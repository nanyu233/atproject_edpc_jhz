package activetech.edpc.action;

import activetech.base.pojo.dto.ActiveUser;
import activetech.base.process.context.Config;
import activetech.base.process.result.ResultInfo;
import activetech.base.process.result.ResultUtil;
import activetech.base.process.result.SubmitResultInfo;
import activetech.edpc.pojo.dto.HspConsentFormImgQueryDto;
import activetech.edpc.service.HspConsentFormImgService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.Assert;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 知情同意书拍照相关功能
 */
@Controller
@RequestMapping("/consentForm")
public class HspConsentFormImgAction {

    @Resource
    private HspConsentFormImgService hspConsentFormImgService;

    /**
     * 跳转拍照上传页面
     *
     * @return jsp
     */
    @RequestMapping(value = "toConsentFormPhoto", method = RequestMethod.GET)
    public String toConsentFormPhoto(Model model, @RequestParam("patientId") String patientId) {
        model.addAttribute("patientId", patientId);
        return "/hzszyyhospital/consentPhoto/consentFormPhoto";
    }

    /**
     * 查询左侧文书历史列表
     *
     * @param hspConsentFormImgQueryDto hspConsentFormImgQueryDto
     * @return activetech.base.process.result.SubmitResultInfo
     * @throws Exception Exception
     * @author chenys
     * @date 2023/4/6 11:53
     */
    @RequestMapping(value = "queryConsentFormImgInfos", method = RequestMethod.POST)
    @ResponseBody
    public SubmitResultInfo queryConsentFormImgInfos(@RequestBody HspConsentFormImgQueryDto hspConsentFormImgQueryDto) throws Exception {
        ResultInfo resultInfo = ResultUtil.createSuccess(Config.MESSAGE, 906, null);
        Map<String, Object> map = hspConsentFormImgService.queryHspConsentFormImgCustomInfo(hspConsentFormImgQueryDto);
        resultInfo.setSysdata(map);
        return ResultUtil.createSubmitResult(resultInfo);
    }

    /**
     * 文件上传保存至minio
     *
     * @param multipartFiles          multipartFiles
     * @param hspConsentFormImgCustom hspConsentFormImgCustom
     * @param activeUser              activeUser
     * @return activetech.base.process.result.SubmitResultInfo
     * @throws Exception Exception
     * @author chenys
     * @date 2023/4/7 10:14
     */
    @RequestMapping(value = "/uploadConsentFormImg", method = RequestMethod.POST)
    @ResponseBody
    public SubmitResultInfo uploadConsentFormImg(@RequestParam("files") MultipartFile[] multipartFiles, HspConsentFormImgQueryDto hspConsentFormImgCustom, ActiveUser activeUser) throws Exception {
        ResultInfo resultInfo = ResultUtil.createSuccess(Config.MESSAGE, 906, null);
        Assert.isTrue(multipartFiles != null && multipartFiles.length >= 1, "文件必传");
        Map<String,Object> map=new HashMap<>();
        List<String> idList= new ArrayList<>();
        for (MultipartFile multipartFile : multipartFiles) {
            String id = hspConsentFormImgService.uploadConsentFormImg(multipartFile, hspConsentFormImgCustom, activeUser);
            idList.add(id);
        }
        map.put("idList",idList);
        resultInfo.setSysdata(map);
        return ResultUtil.createSubmitResult(resultInfo);
    }


    /**
     * 查询同意书下的拍照图片
     *
     * @param hspConsentFormImgQueryDto hspConsentFormImgQueryDto
     * @return activetech.base.process.result.SubmitResultInfo
     * @throws Exception Exception
     * @author chenys
     * @date 2023/4/7 10:16
     */
    @RequestMapping(value = "queryConsentFormImgInfo", method = RequestMethod.POST)
    @ResponseBody
    public SubmitResultInfo queryConsentFormImgInfo(@RequestBody HspConsentFormImgQueryDto hspConsentFormImgQueryDto) throws Exception {
        ResultInfo resultInfo = ResultUtil.createSuccess(Config.MESSAGE, 906, null);
        Map<String, Object> map = hspConsentFormImgService.queryConsentFormImgInfo(hspConsentFormImgQueryDto);
        resultInfo.setSysdata(map);
        return ResultUtil.createSubmitResult(resultInfo);
    }

    /**
     * 删除已拍的图片
     *
     * @param hspConsentFormImgQueryDto hspConsentFormImgQueryDto
     * @return activetech.base.process.result.SubmitResultInfo
     * @throws Exception Exception
     * @author chenys
     * @date 2023/4/7 10:16
     */
    @RequestMapping(value = "deleteConsentFormImgInfo", method = RequestMethod.POST)
    @ResponseBody
    public SubmitResultInfo deleteConsentFormImgInfo(@RequestBody HspConsentFormImgQueryDto hspConsentFormImgQueryDto) throws Exception {
        ResultInfo resultInfo = ResultUtil.createSuccess(Config.MESSAGE, 906, null);
        hspConsentFormImgService.deleteConsentFormImgInfo(hspConsentFormImgQueryDto);
        return ResultUtil.createSubmitResult(resultInfo);
    }

    /**
     * 文件下载
     *
     * @param id       id  文件ID
     * @param response response
     * @throws Exception Exception
     * @author chenys
     * @date 2023/4/11 10:52
     */
    @RequestMapping(value = "conFmImgDownload", method = RequestMethod.GET)
    public void conFmImgDownload(@RequestParam String id, HttpServletResponse response) throws Exception {
        hspConsentFormImgService.conFmImgDownload(id, response);
    }

}
