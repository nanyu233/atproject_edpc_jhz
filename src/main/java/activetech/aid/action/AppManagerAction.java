package activetech.aid.action;

import activetech.aid.pojo.domain.AidApk;
import activetech.aid.pojo.dto.AidApkQueryDto;
import activetech.aid.service.AidApkService;
import activetech.base.action.View;
import activetech.base.pojo.dto.ActiveUser;
import activetech.base.process.result.DataGridResultInfo;
import activetech.base.process.result.ResultInfo;
import activetech.base.process.result.ResultUtil;
import activetech.base.process.result.SubmitResultInfo;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;

/**
 * 三大中心-app版本管理控制器类
 * @description
 */
@Controller
@RequestMapping("/app")
public class AppManagerAction {

    @Resource
    private AidApkService aidApkService;

    /**
     * 跳转app版本管理页面
     * @param moduleid
     * @param model
     * @return
     * @throws Exception
     */
    @RequestMapping("/toManagerAppPage")
    public String toManagerAppPage(String moduleid, Model model) throws Exception {
        model.addAttribute("moduleid", moduleid);
        return View.toAid("/app/appManager");
    }


    /**
     * 查询app版本列表
     * @param aidApkQueryDto
     * @return
     * @throws Exception
     */
    @RequestMapping("/queryaidapk_result")
    @ResponseBody
    public DataGridResultInfo queryaidapk_result(AidApkQueryDto aidApkQueryDto) throws Exception {
        DataGridResultInfo dataGridResultInfo = aidApkService.getAidApkList(aidApkQueryDto);
        return dataGridResultInfo;
    }

    /**
     * 跳转新增app版本页面
     * @param model
     * @return
     * @throws Exception
     */
    @RequestMapping("/toAddAppApkPage")
    public String toAddAppApkPage(Model model) throws Exception {
        return View.toAid("/app/addAppApk");
    }


    /**
     * 上传app版本
     * @param multipartFile
     * @param apkVer
     * @param apkDes
     * @param activeUser
     * @return
     */
    @RequestMapping("/uploadAppApk")
    @ResponseBody
    public SubmitResultInfo uploadAppApk(@RequestParam("file") MultipartFile multipartFile,
                                         String apkVer,String apkDes,ActiveUser activeUser){
        ResultInfo resultInfo = aidApkService.uploadAppApk(multipartFile,apkVer,apkDes,activeUser);
        return ResultUtil.createSubmitResult(resultInfo);
    }

    /**
     * 删除app版本
     * @param aidApk
     * @return
     */
    @RequestMapping("/delAppApk")
    @ResponseBody
    public SubmitResultInfo delAppApk(AidApk aidApk){
        ResultInfo resultInfo = aidApkService.delAppApk(aidApk);
        return ResultUtil.createSubmitResult(resultInfo);
    }

    /**
     * 获取app下载链接
     * @param aidApk
     * @return
     */
    @RequestMapping("/getDownloadUrl")
    @ResponseBody
    public SubmitResultInfo getDownloadUrl(AidApk aidApk){
        ResultInfo resultInfo = aidApkService.getDownloadUrl(aidApk);
        return ResultUtil.createSubmitResult(resultInfo);
    }

    /**
     * 设置App版本为最新版本
     * @param aidApk
     * @return
     */
    @RequestMapping("/updateAppApk")
    @ResponseBody
    public SubmitResultInfo updateAppApk(AidApk aidApk){
        ResultInfo resultInfo = aidApkService.updateAppApk(aidApk);
        return ResultUtil.createSubmitResult(resultInfo);
    }
}
