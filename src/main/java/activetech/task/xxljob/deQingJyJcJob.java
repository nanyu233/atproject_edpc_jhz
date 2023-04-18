package activetech.task.xxljob;

import activetech.base.service.RedisService;
import activetech.basehis.pojo.dto.VHemsJcjgCustom;
import activetech.basehis.pojo.dto.VHemsJyjgCustom;
import activetech.basehis.pojo.dto.VHemsJyjgQueryDto;
import activetech.edpc.dao.mapper.HspDbzlBasMapperCustom;
import activetech.edpc.pojo.dto.HspDbzlBasCustom;
import activetech.external.dao.mapper.VHemsJcjgMapper;
import activetech.external.dao.mapper.VHemsJcjgMapperCustom;
import activetech.external.dao.mapper.VHemsJyjgMapper;
import activetech.external.dao.mapper.VHemsJyjgMapperCustom;
import activetech.external.pojo.domain.VHemsJcjg;
import activetech.external.pojo.domain.VHemsJcjgExample;
import activetech.external.pojo.domain.VHemsJyjg;
import activetech.external.pojo.domain.VHemsJyjgExample;
import activetech.external.service.EsbService;
import activetech.util.DateUtil;
import activetech.util.StringUtils;
import com.xxl.job.core.handler.annotation.XxlJob;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.*;

@Component
public class deQingJyJcJob {
    @Autowired
    private HspDbzlBasMapperCustom hspDbzlBasMapperCustom;
    @Autowired
    private VHemsJyjgMapper vHemsJyjgMapper;
    @Autowired
    private VHemsJyjgMapperCustom vHemsJyjgMapperCustom;
    @Autowired
    private VHemsJcjgMapper vHemsJcjgMapper;
    @Autowired
    private VHemsJcjgMapperCustom vHemsJcjgMapperCustom;
    @Autowired
    private EsbService esbService;

    @XxlJob("")
    public void jyinfo() throws Exception {
        //查询两小时之内的病人数据
        List<HspDbzlBasCustom> hspDbzlBasCustomList = hspDbzlBasMapperCustom.selectByWithinTowHour();

        for (HspDbzlBasCustom hspDbzlBasCustom : hspDbzlBasCustomList) {
            if (StringUtils.isNotNullAndEmptyByTrim(hspDbzlBasCustom.getVstCad())) {
                //拼接请求参数
                VHemsJyjgQueryDto vHemsJyjgQueryDto = new VHemsJyjgQueryDto();
                VHemsJyjgCustom vHemsJyjgCustom = new VHemsJyjgCustom();
                vHemsJyjgCustom.setPatientId(hspDbzlBasCustom.getVstCad());
                vHemsJyjgCustom.setStartdate(hspDbzlBasCustom.getRegTim());
                vHemsJyjgCustom.setEnddate(DateUtil.getNextDay(new Date()));
                vHemsJyjgQueryDto.setvHemsJyjgCustom(vHemsJyjgCustom);
                vHemsJyjgQueryDto.setSort("resultDateTime");
                vHemsJyjgQueryDto.setOrder("asc");


                //定义接口返回的结果  vHemsJyjgCustoms
                List<VHemsJyjgCustom> vHemsJyjgCustoms = new ArrayList<>();
                //请求接口数据
                vHemsJyjgCustoms = esbService.findjyCategoriesList(vHemsJyjgQueryDto);

                //接口没有数据则结束本次循环
                if (Objects.isNull(vHemsJyjgCustoms) || vHemsJyjgCustoms.size() <= 0) {
                    continue;
                }

                //查询本地表v_hems_jyjg里这个病人的数据
                VHemsJyjgExample vHemsJyjgExample = new VHemsJyjgExample();
                VHemsJyjgExample.Criteria criteria = vHemsJyjgExample.createCriteria();
                criteria.andVstCadEqualTo(hspDbzlBasCustom.getVstCad());
                criteria.andResultDateTimeBetween(hspDbzlBasCustom.getRegTim(), DateUtil.getNextDay(new Date()));
                List<VHemsJyjg> vHemsJyjgs = vHemsJyjgMapper.selectByExample(vHemsJyjgExample);

                //如病人没有检验数据直接将检验信息入库，如果有数据则将数据进行比较入库
                if (Objects.nonNull(vHemsJyjgs) && vHemsJyjgs.size() > 0) {
                    Iterator<VHemsJyjgCustom> iterator = vHemsJyjgCustoms.iterator();
                    while (iterator.hasNext()) {
                        VHemsJyjgCustom hemsJyjgCustom = iterator.next();
                        for (VHemsJyjg vHemsJyjg : vHemsJyjgs) {
                            //比较
                            if (hemsJyjgCustom.getExaminaim().equals(vHemsJyjg.getExaminaim())) {
                                if (hemsJyjgCustom.getSampleName().equals(vHemsJyjg.getSampleName())) {
                                    //如果接口的数据与本地数据有重复，则接口的数据不入库
                                    iterator.remove();
                                }
                            }
                        }
                    }
                }
                //定义插入数据库list vHemsJyjgCustomList
                List<VHemsJyjgCustom> vHemsJyjgCustomList = new ArrayList<>();
                //拼接入库list数据
                for (VHemsJyjgCustom hemsJyjgCustom : vHemsJyjgCustoms) {
                    hemsJyjgCustom.setVstCad(hspDbzlBasCustom.getVstCad());
                    vHemsJyjgCustomList.add(hemsJyjgCustom);
                    vHemsJyjgCustomList.addAll(hemsJyjgCustom.getVlist());
                }

                //检验信息入库
                if (Objects.nonNull(vHemsJyjgCustomList) && vHemsJyjgCustomList.size()>0){
                    vHemsJyjgMapperCustom.insertJyjgOnDeQing(vHemsJyjgCustomList);
                }
            }

        }
    }

    @XxlJob("")
    public void jcInfo() throws Exception {
        //查询两小时之内的病人数据
        List<HspDbzlBasCustom> hspDbzlBasCustomList = hspDbzlBasMapperCustom.selectByWithinTowHour();

        for (HspDbzlBasCustom hspDbzlBasCustom : hspDbzlBasCustomList) {
            if (StringUtils.isNotNullAndEmptyByTrim(hspDbzlBasCustom.getVstCad())) {
                //拼接参数，从接口获取病人检查数据
                VHemsJyjgQueryDto vHemsJyjgQueryDto = new VHemsJyjgQueryDto();
                VHemsJcjgCustom vHemsJcjgCustom = new VHemsJcjgCustom();
                vHemsJcjgCustom.setZyh(hspDbzlBasCustom.getVstCad());
                vHemsJcjgCustom.setStartdate(hspDbzlBasCustom.getRegTim());
                vHemsJcjgCustom.setEnddate(DateUtil.getNextDay(new Date()));
                vHemsJyjgQueryDto.setvHemsJcjgCustom(vHemsJcjgCustom);
                List<VHemsJcjgCustom> vHemsJcjgCustomList = esbService.findVHemsJcjgList(vHemsJyjgQueryDto);
                //如接口无数据返回，结束本次循环。
                if (Objects.isNull(vHemsJcjgCustomList) || vHemsJcjgCustomList.size() <= 0) {
                    continue;
                }
                //查询本地V_HEMS_JCJG这个病人的数据
                VHemsJcjgExample vHemsJcjgExample = new VHemsJcjgExample();
                VHemsJcjgExample.Criteria criteria = vHemsJcjgExample.createCriteria();
                criteria.andZyhEqualTo(hspDbzlBasCustom.getVstCad());
                criteria.andShrqBetween(hspDbzlBasCustom.getRegTim(), DateUtil.getNextDay(new Date()));
                List<VHemsJcjg> vHemsJcjgs = vHemsJcjgMapper.selectByExample(vHemsJcjgExample);
                //本地无此病人数据直接插入接口数据，本地有数据进行比较入库
                if (Objects.nonNull(vHemsJcjgs) && vHemsJcjgs.size() > 0) {
                    Iterator<VHemsJcjgCustom> iterator = vHemsJcjgCustomList.iterator();
                    while (iterator.hasNext()) {
                        VHemsJcjgCustom hemsJcjgCustom = iterator.next();
                        for (VHemsJcjg vHemsJcjg : vHemsJcjgs) {
                            if (hemsJcjgCustom.getYlmc().equals(vHemsJcjg.getYlmc())) {
                                iterator.remove();
                            }
                        }
                    }
                }
                //检查信息入库
                if (Objects.nonNull(vHemsJcjgCustomList) && vHemsJcjgCustomList.size()>0){
                    vHemsJcjgCustomList.stream().forEach(item ->{
                        item.setZyh(hspDbzlBasCustom.getVstCad());
                        item.setXm(hspDbzlBasCustom.getCstNam());
                    });
                    vHemsJcjgMapperCustom.insertJcjgOnDeQing(vHemsJcjgCustomList);
                }
            }
        }
    }

}
