package activetech.edpc.action;

import activetech.base.process.context.Config;
import activetech.base.process.result.ResultInfo;
import activetech.base.process.result.ResultUtil;
import activetech.base.process.result.SubmitResultInfo;
import activetech.edpc.service.JzbrService;
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

    /**
     * 急诊病人进入多病种中心
     * @param hspemginfQueryDto hspemginfQueryDto
     * @return return
     * @throws Exception Exception
     */
    @RequestMapping("/enterDbzl")
    public @ResponseBody SubmitResultInfo enterDbzl(@RequestBody HspemginfQueryDto hspemginfQueryDto) throws Exception {
        ResultInfo resultInfo = ResultUtil.createSuccess(Config.MESSAGE, 906, null);
        jzbrService.enterDbzl(hspemginfQueryDto);
        return ResultUtil.createSubmitResult(resultInfo);
    }

}
