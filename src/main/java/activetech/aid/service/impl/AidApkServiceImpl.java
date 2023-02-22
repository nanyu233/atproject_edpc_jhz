package activetech.aid.service.impl;

import activetech.aid.dao.mapper.AidApkMapper;
import activetech.aid.dao.mapper.AidApkMapperCustom;
import activetech.aid.pojo.domain.AidApk;
import activetech.aid.pojo.domain.AidApkExample;
import activetech.aid.pojo.dto.AidApkCustom;
import activetech.aid.pojo.dto.AidApkQueryDto;
import activetech.aid.service.AidApkService;
import activetech.base.pojo.dto.ActiveUser;
import activetech.base.pojo.dto.PageQuery;
import activetech.base.process.context.Config;
import activetech.base.process.result.DataGridResultInfo;
import activetech.base.process.result.ResultInfo;
import activetech.base.process.result.ResultUtil;
import activetech.base.util.MinIoUtil;
import io.minio.errors.*;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
import java.io.IOException;
import java.io.InputStream;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.*;

public class AidApkServiceImpl implements AidApkService {

    private static final String APP_BUCKET_NAME = "app";

    @Resource
    private AidApkMapperCustom aidApkMapperCustom;

    @Resource
    private AidApkMapper aidApkMapper;

    @Override
    public DataGridResultInfo getAidApkList(AidApkQueryDto aidApkQueryDto) {
        int count = aidApkMapperCustom.countByQueryDto(aidApkQueryDto);
        DataGridResultInfo dataGridResultInfo = new DataGridResultInfo();
        ResultInfo resultInfo = null;
        if (count > 0) {
            PageQuery pageQuery = new PageQuery();
            if (aidApkQueryDto.getRows() != null && aidApkQueryDto.getPage() != null) {
                pageQuery.setPageParams(count, aidApkQueryDto.getRows(), aidApkQueryDto.getPage());
                aidApkQueryDto.setPageQuery(pageQuery);
            }
            List<AidApkCustom> aidApks = aidApkMapperCustom.selectByQueryDto(aidApkQueryDto);
            //填充total
            dataGridResultInfo.setTotal(count);
            //填充rows
            dataGridResultInfo.setRows(aidApks);
            resultInfo = ResultUtil.createSuccess(Config.MESSAGE, 906, null);
        } else {
            resultInfo = ResultUtil.createSuccess(Config.MESSAGE, 920, null);
        }
        dataGridResultInfo.setResultInfo(resultInfo);
        return dataGridResultInfo;
    }

    @Override
    public ResultInfo uploadAppApk(MultipartFile multipartFile, String apkVer, String apkDes, ActiveUser activeUser) {
        ResultInfo resultInfo;
        // 保存文件进 对象存储
        try {
            // 1.获取文件流
            InputStream inputStream = multipartFile.getInputStream();
            // 2.设置保存文件的名称

            // 2.1获取文件名后缀
            String originalFilename = multipartFile.getOriginalFilename();
            String suffixFileName = originalFilename.substring(originalFilename.lastIndexOf("."));
            // 2.2生成随机文件名
            String prefixfileName = UUID.randomUUID().toString().replaceAll("-", "");
            String fileName = prefixfileName + suffixFileName;
            // 3.保存进相应的对象存储服务器
            // 判断桶存不存在
            boolean b = MinIoUtil.bucketExists(APP_BUCKET_NAME);
            if (!b) {
                MinIoUtil.createBucket(APP_BUCKET_NAME);
            }
            MinIoUtil.putObject(APP_BUCKET_NAME, fileName, inputStream);
            //移除旧下载版本
            MinIoUtil.removeObject(APP_BUCKET_NAME, "edpc.apk");
            //复制apk 作为新下载版本
            MinIoUtil.copyObject(APP_BUCKET_NAME, fileName,APP_BUCKET_NAME, "edpc.apk");

            // 把老的app 的newFlg置为false

            AidApk record = new AidApk();
            record.setApkNewFlg("0");
            AidApkExample example = new AidApkExample();
            aidApkMapper.updateByExampleSelective(record, example);

            AidApk aidApk = new AidApk();
            aidApk.setApkId("");
            aidApk.setApkVer(apkVer);
            aidApk.setApkDir(fileName);
            aidApk.setApkDes(apkDes);
            aidApk.setApkNewFlg("1");
            aidApk.setCrtTim(new Date());
            aidApk.setCrtUsr(activeUser.getUsrno());
            aidApkMapperCustom.insert(aidApk);

            resultInfo = ResultUtil.createSuccess(Config.MESSAGE, 906, null);

        } catch (IOException | InvalidKeyException | InvalidResponseException | InsufficientDataException | NoSuchAlgorithmException | ServerException | InternalException | XmlParserException | InvalidBucketNameException | ErrorResponseException | RegionConflictException e) {
            e.printStackTrace();
            resultInfo = ResultUtil.createSuccess(Config.MESSAGE, 920, new Object[]{
                    "上传失败"
            });
        }

        return resultInfo;
    }

    @Override
    public ResultInfo delAppApk(AidApk aidApk) {
        ResultInfo resultInfo;
        Integer result = 0;
        String apkSeq = aidApk.getApkSeq();
        try {
            // 删除存储桶的数据
            AidApk ret = aidApkMapper.selectByPrimaryKey(apkSeq);

            MinIoUtil.removeObject(APP_BUCKET_NAME, ret.getApkDir());
            // 删除数据
            result = aidApkMapper.deleteByPrimaryKey(apkSeq);

        } catch (IOException e) {
            e.printStackTrace();
        } catch (InvalidKeyException e) {
            e.printStackTrace();
        } catch (InvalidResponseException e) {
            e.printStackTrace();
        } catch (InsufficientDataException e) {
            e.printStackTrace();
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        } catch (ServerException e) {
            e.printStackTrace();
        } catch (InternalException e) {
            e.printStackTrace();
        } catch (XmlParserException e) {
            e.printStackTrace();
        } catch (InvalidBucketNameException e) {
            e.printStackTrace();
        } catch (ErrorResponseException e) {
            e.printStackTrace();
        }


        if (result == 1) {
            resultInfo = ResultUtil.createSuccess(Config.MESSAGE, 906, null);
        } else {
            resultInfo = ResultUtil.createSuccess(Config.MESSAGE, 920, null);
        }
        return resultInfo;
    }

    @Override
    public ResultInfo getDownloadUrl(AidApk aidApk) {
        ResultInfo resultInfo = ResultUtil.createSuccess(Config.MESSAGE, 906, null);;

        AidApk ret = aidApkMapper.selectByPrimaryKey(aidApk.getApkSeq());

        String presignedObjectUrl = MinIoUtil.getPresignedObjectUrl(APP_BUCKET_NAME, ret.getApkDir(), 2);

        Map<String,Object> sysdata = new HashMap<>();

        sysdata.put("url",presignedObjectUrl);

        resultInfo.setSysdata(sysdata);

        return resultInfo;
    }

    @Override
    public ResultInfo updateAppApk(AidApk aidApk) {
        ResultInfo resultInfo;
        Integer result = 0;

        try {
            //查询  ApkNewFlg =1 的数据
            AidApkExample example = new AidApkExample();
            AidApkExample.Criteria exampleCriteria=example.createCriteria();
            exampleCriteria.andApkNewFlgEqualTo("1");
            List<AidApk>  aidApk_flg_list= aidApkMapper.selectByExample(example);
            for(AidApk apk_old:aidApk_flg_list){
                AidApk aidApk_old =new AidApk();
                aidApk_old.setApkNewFlg("0");
                aidApk_old.setApkSeq(apk_old.getApkSeq());
                aidApkMapper.updateByPrimaryKeySelective(aidApk_old);
            }

            aidApk.setApkNewFlg("1");
            // 更新设置为最新版本
            result = aidApkMapper.updateByPrimaryKeySelective(aidApk);

            // 查询存储桶的数据
            AidApk ret = aidApkMapper.selectByPrimaryKey(aidApk.getApkSeq());
            //移除旧下载版本
            MinIoUtil.removeObject(APP_BUCKET_NAME, "edpc.apk");
            //复制apk 作为新下载版本
            MinIoUtil.copyObject(APP_BUCKET_NAME, ret.getApkDir(),APP_BUCKET_NAME, "edpc.apk");

        } catch (IOException e) {
            e.printStackTrace();
        } catch (InvalidKeyException e) {
            e.printStackTrace();
        } catch (InvalidResponseException e) {
            e.printStackTrace();
        } catch (InsufficientDataException e) {
            e.printStackTrace();
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        } catch (ServerException e) {
            e.printStackTrace();
        } catch (InternalException e) {
            e.printStackTrace();
        } catch (XmlParserException e) {
            e.printStackTrace();
        } catch (InvalidBucketNameException e) {
            e.printStackTrace();
        } catch (ErrorResponseException e) {
            e.printStackTrace();
        }


        if (result == 1) {
            resultInfo = ResultUtil.createSuccess(Config.MESSAGE, 906, null);
        } else {
            resultInfo = ResultUtil.createSuccess(Config.MESSAGE, 920, null);
        }
        return resultInfo;
    }
}
