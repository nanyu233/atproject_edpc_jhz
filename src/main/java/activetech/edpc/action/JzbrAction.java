package activetech.edpc.action;

import activetech.base.pojo.dto.ActiveUser;
import activetech.base.process.context.Config;
import activetech.base.process.result.ResultInfo;
import activetech.base.process.result.ResultUtil;
import activetech.base.process.result.SubmitResultInfo;
import activetech.edpc.pojo.dto.HspDbzlBasQueryDto;
import activetech.edpc.service.JzbrService;
import activetech.external.service.EsbService;
import activetech.hospital.pojo.dto.HspemginfQueryDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 急诊病人进入多病种中心
 * @author n
 */
@Controller
@RequestMapping("/jzbr")
public class JzbrAction {

    @Autowired
    private JzbrService jzbrService;


    @Autowired
    private EsbService esbService;
    /**
     * 急诊病人进入多病种中心
     * @param hspemginfQueryDto hspemginfQueryDto
     * @return return
     * @throws Exception Exception
     */
    @RequestMapping("/enterDbzl")
    public @ResponseBody SubmitResultInfo enterDbzl(@RequestBody HspemginfQueryDto hspemginfQueryDto, ActiveUser activeUser) throws Exception {
        ResultInfo resultInfo = ResultUtil.createSuccess(Config.MESSAGE, 906, null);
        jzbrService.enterDbzl(hspemginfQueryDto,activeUser);
        return ResultUtil.createSubmitResult(resultInfo);
    }


    /**
     * 三大中心患者分诊登记入库
     *
     * @param hspDbzlBasQueryDto
     * @return
     * @throws Exception
     */
    @RequestMapping("/adddbzlbassubmit_sdzx")
    public @ResponseBody SubmitResultInfo addzyyemgsubmit_yjfz_sdzx(@RequestBody HspDbzlBasQueryDto hspDbzlBasQueryDto, ActiveUser activeUser) throws Exception {
        ResultInfo resultInfo = ResultUtil.createSuccess(Config.MESSAGE, 906, null);
        esbService.insertHspDbzlBasForCust(hspDbzlBasQueryDto,activeUser);
        return ResultUtil.createSubmitResult(resultInfo);
    }

}
