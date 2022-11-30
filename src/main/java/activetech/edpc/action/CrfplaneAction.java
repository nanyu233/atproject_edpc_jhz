package activetech.edpc.action;

import activetech.base.action.View;
import activetech.base.pojo.dto.ActiveUser;
import activetech.base.process.result.ResultInfo;
import activetech.base.process.result.ResultUtil;
import activetech.base.process.result.SubmitResultInfo;
import activetech.edpc.pojo.dto.HspDbzlBasCustom;
import activetech.edpc.service.CrfplaneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/crfplane")
public class CrfplaneAction {

    @Autowired
    private CrfplaneService cpcCrfplaneService;

    /**
     * 审核提交(申请,通过,不通过)
     * @return throws
     * @throws Exception Exception
     */
    @RequestMapping("/reviewSubmit")
    public @ResponseBody
    SubmitResultInfo reviewSubmit(@RequestBody HspDbzlBasCustom hspDbzlBasCustom, ActiveUser activeUser) throws Exception {
        ResultInfo resultInfo = cpcCrfplaneService.reviewSubmit(hspDbzlBasCustom, activeUser);
        return ResultUtil.createSubmitResult(resultInfo);
    }

    /**
     * 跳转审核确认页面
     * @param model model
     * @return return
     * @throws Exception Exception
     */
    @RequestMapping("/toChkConfirm")
    public String toChkConfirm(Model model) throws Exception {
        return View.toEDPC("/cpc/chkConfirm");
    }

    @RequestMapping("/reportSubmit")
    public @ResponseBody SubmitResultInfo reportSubmit(@RequestBody HspDbzlBasCustom hspDbzlBasCustom, ActiveUser activeUser) throws Exception {
        ResultInfo resultInfo = cpcCrfplaneService.reportSubmit(hspDbzlBasCustom, activeUser);
        return ResultUtil.createSubmitResult(resultInfo);
    }


}
