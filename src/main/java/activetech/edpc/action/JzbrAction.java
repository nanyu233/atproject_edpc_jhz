package activetech.edpc.action;

import activetech.base.pojo.dto.ActiveUser;
import activetech.base.process.context.Config;
import activetech.base.process.result.DataGridResultInfo;
import activetech.base.process.result.ResultInfo;
import activetech.base.process.result.ResultUtil;
import activetech.base.process.result.SubmitResultInfo;
import activetech.edpc.pojo.dto.HspDbzlBasCustom;
import activetech.edpc.pojo.dto.HspDbzlBasQueryDto;
import activetech.edpc.pojo.dto.HspZlInfQueryDto;
import activetech.edpc.service.JzbrService;
import activetech.external.service.EsbService;
import activetech.hospital.pojo.dto.HspemginfQueryDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

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
        String regSeq = esbService.insertHspDbzlBasForCust(hspDbzlBasQueryDto, activeUser);
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("regSeq", regSeq);
        resultInfo.setSysdata(map);
        return ResultUtil.createSubmitResult(resultInfo);
    }

    /**
     * 三大中心患者分诊登记更新诊疗表信息
     * @param hspZlInfQueryDto
     * @param activeUser
     * @return
     * @throws Exception
     */
    @RequestMapping("/addzlinfosubmit_sdzx")
    public @ResponseBody SubmitResultInfo addzlinfosubmit_sdzx(@RequestBody HspZlInfQueryDto hspZlInfQueryDto, ActiveUser activeUser) throws Exception {
        ResultInfo resultInfo = ResultUtil.createSuccess(Config.MESSAGE, 906, null);
        esbService.addzlinfosubmit_sdzx(hspZlInfQueryDto,activeUser);
        return ResultUtil.createSubmitResult(resultInfo);
    }

    /**
     * 分诊获取dbzl_bas列表
     * @return
     */
    @RequestMapping("/getPatientListForDbzlBas")
    @ResponseBody
    public DataGridResultInfo getPatientListForDbzlBas(HspDbzlBasQueryDto hspDbzlBasQueryDto, ActiveUser activeUser){
        HspDbzlBasCustom hspDbzlBasCustom=new HspDbzlBasCustom();
        hspDbzlBasCustom.setHspAra(activeUser.getHospitalCategory());
        hspDbzlBasQueryDto.setHspDbzlBasCustom(hspDbzlBasCustom);
        DataGridResultInfo dataGridResultInfo = jzbrService.getPatientListForDbzlBas(hspDbzlBasQueryDto);
        return dataGridResultInfo;
    }

    /**
     * 患者基础信息
     * @param hspDbzlBasQueryDto
     * @return SubmitResultInfo
     */
    @RequestMapping("/queryHspDbzlBasinf")
    @ResponseBody
    public SubmitResultInfo queryHspDbzlBasinf(HspDbzlBasQueryDto hspDbzlBasQueryDto) {
        ResultInfo resultInfo = null;

        resultInfo = jzbrService.queryHspDbzlBasinf(hspDbzlBasQueryDto);
        return ResultUtil.createSubmitResult(resultInfo);
    }

}
