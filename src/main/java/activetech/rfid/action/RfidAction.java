package activetech.rfid.action;

import activetech.base.action.View;
import activetech.base.pojo.dto.ActiveUser;
import activetech.base.pojo.dto.PageQuery;
import activetech.base.process.context.Config;
import activetech.base.process.result.DataGridResultInfo;
import activetech.base.process.result.ResultInfo;
import activetech.base.process.result.ResultUtil;
import activetech.base.process.result.SubmitResultInfo;
import activetech.rfid.pojo.domain.HspUhfRdr;
import activetech.rfid.pojo.domain.HspUhfTrp;
import activetech.rfid.pojo.dto.HspUhfRdrCustom;
import activetech.rfid.pojo.dto.HspUhfRdrQueryDto;
import activetech.rfid.pojo.dto.HspUhfTrpCustom;
import activetech.rfid.pojo.dto.HspUhfTrpQueryDto;
import activetech.rfid.service.HspUhfRdrService;
import activetech.rfid.service.HspUhfTrpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;
import java.util.List;

/**
 * <p>Title:RfidAction</p>
 * <p>Description:Rfid定义</p>
 * <p>activetech</p>
 *
 * @author zhanghui
 * @date 2021-3-25 上午11:34:00
 */
@Controller
@RequestMapping("/rfid")
public class RfidAction {

    @Autowired
    private HspUhfRdrService hspUhfRdrService;

    @Autowired
    private HspUhfTrpService hspUhfTrpService;

    /**
     * 跳转UHF读写器定义列表
     *
     * @param model
     * @return
     * @throws Exception
     */
    @RequestMapping("/toRfidManager")
    public String queryHspUhfRdr(Model model, String moduleid) throws Exception {
        model.addAttribute("moduleid", moduleid);
        return View.toRfid("/queryHspUhfRdr");
    }

    /**
     * UHF读写器定义列表查询结果集
     *
     * @param hspUhfRdrQueryDto
     * @param page
     * @param rows
     * @return
     * @throws Exception
     */
    @RequestMapping("/queryHspUhfRdrResult")
	@ResponseBody
    public DataGridResultInfo queryHspUhfRdrResult(
            HspUhfRdrQueryDto hspUhfRdrQueryDto,
            int page,//当前页码
            int rows//每页显示个数
    ) throws Exception {
        //非空校验
        hspUhfRdrQueryDto = hspUhfRdrQueryDto != null ? hspUhfRdrQueryDto : new HspUhfRdrQueryDto();

        //查询列表的总数
        int total = hspUhfRdrService.findHspUhfRdrCount(hspUhfRdrQueryDto);
        PageQuery pageQuery = new PageQuery();
        pageQuery.setPageParams(total, rows, page);
        hspUhfRdrQueryDto.setPageQuery(pageQuery);
        List<HspUhfRdr> list = hspUhfRdrService.findHspUhfRdrList(hspUhfRdrQueryDto);
        DataGridResultInfo dataGridResultInfo = new DataGridResultInfo();
        //填充total
        dataGridResultInfo.setTotal(total);
        //填充rows
        dataGridResultInfo.setRows(list);
        return dataGridResultInfo;
    }


    /**
     * 跳转UHF读写器新增界面
     *
     * @param model
     * @return
     * @throws Exception
     */
    @RequestMapping("/addHspUhfRdr")
    public String addHspUhfRdr(Model model) throws Exception {
        return View.toRfid("/addHspUhfRdr");
    }

    /**
     * UHF读写器新增提交(提交结果转json输出到页面、提交表单数据统一使用包装类)
     *
     * @param hspUhfRdrQueryDto
     * @return
     * @throws Exception
     */
    @RequestMapping("/addHspUhfRdrSubmit")
	@ResponseBody
    public SubmitResultInfo addHspUhfRdrSubmit(ActiveUser activeUser, @RequestBody HspUhfRdrQueryDto hspUhfRdrQueryDto) throws Exception {
        ResultInfo resultInfo = null;
        if(hspUhfRdrQueryDto!=null && hspUhfRdrQueryDto.getHspUhfRdrCustom()!=null){
            HspUhfRdrCustom hspUhfRdrCustom = hspUhfRdrQueryDto.getHspUhfRdrCustom();
            if(hspUhfRdrCustom!=null){
                hspUhfRdrCustom.setCrtUsrNo(activeUser.getUsrno());
                hspUhfRdrCustom.setCrtUsrNam(activeUser.getUsrname());
                resultInfo = hspUhfRdrService.insertHspUhfRdr(hspUhfRdrCustom);
            }
        }else{
            resultInfo = ResultUtil.createSuccess(Config.MESSAGE, 906, null);
        }

        return ResultUtil.createSubmitResult(resultInfo);
    }

    /**
     * 跳转UHF读写器修改界面
     *
     * @param model
     * @param rdrSeq
     * @return
     * @throws Exception
     */
    @RequestMapping("/editHspUhfRdr")
    public String editHspUhfRdr(Model model, String rdrSeq) throws Exception {
        //根据rdrSeq获取UHF读写器信息并传回页面
//		HspUhfRdrCustom hspUhfRdrCustom = hspUhfRdrService.findHspUhfRdrByHspUhfRdr(rdrSeq);
        model.addAttribute("rdrSeq", rdrSeq);
        return View.toRfid("/editHspUhfRdr");
    }

	/**
	 * 根据rdrSeq获取单条UHF读写器信息
	 * @param rdrSeq
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/getHspUhfRdrByRdrSeq")
	@ResponseBody
	public SubmitResultInfo getHspUhfRdrByRdrSeq(String rdrSeq) throws Exception {

		ResultInfo resultInfo = hspUhfRdrService.getHspUhfRdrByRdrSeq(rdrSeq);

		return ResultUtil.createSubmitResult(resultInfo);
	}

    /**
     * UHF读写器修改提交
     *
     * @param hspUhfRdrQueryDto
     * @return
     * @throws Exception
     */
    @RequestMapping("/editHspUhfRdrSubmit")
    @ResponseBody
    public SubmitResultInfo editHspUhfRdrSubmit(ActiveUser activeUser, @RequestBody HspUhfRdrQueryDto hspUhfRdrQueryDto) throws Exception {
        HspUhfRdrCustom hspUhfRdrCustom = hspUhfRdrQueryDto.getHspUhfRdrCustom();
        hspUhfRdrCustom.setModUsrNo(activeUser.getUsrno());
        hspUhfRdrCustom.setModUsrNam(activeUser.getUsrname());
        ResultInfo resultInfo = hspUhfRdrService.updateHspUhfRdr(hspUhfRdrCustom);
        return ResultUtil.createSubmitResult(resultInfo);
    }

    /**
     * 删除UHF读写器
     *
     * @param rdrSeq
     * @return
     * @throws Exception
     */
    @RequestMapping("/deleteHspUhfRdr")
    public @ResponseBody
    SubmitResultInfo deleteHspUhfRdr(String rdrSeq) throws Exception {
        hspUhfRdrService.deleteHspUhfRdr(rdrSeq);
        return ResultUtil.createSubmitResult(ResultUtil.createSuccess(Config.MESSAGE, 906, null));
    }

    /**
     * 跳转UHF应答器定义列表
     *
     * @param model
     * @return
     * @throws Exception
     */
    @RequestMapping("/queryHspUhfTrp")
    public String queryHspUhfTrp(Model model, String moduleid) throws Exception {
        model.addAttribute("moduleid", moduleid);
        return View.toRfid("/queryHspUhfTrp");
    }

    /**
     * UHF应答器定义列表查询结果集
     *
     * @param hspUhfTrpQueryDto
     * @param page
     * @param rows
     * @return
     * @throws Exception
     */
    @RequestMapping("/queryHspUhfTrpResult")
    public @ResponseBody
    DataGridResultInfo queryHspUhfTrpResult(
            HspUhfTrpQueryDto hspUhfTrpQueryDto,
            int page,//当前页码
            int rows//每页显示个数
    ) throws Exception {
        //非空校验
        hspUhfTrpQueryDto = hspUhfTrpQueryDto != null ? hspUhfTrpQueryDto : new HspUhfTrpQueryDto();

        //查询列表的总数
        int total = hspUhfTrpService.findHspUhfTrpCount(hspUhfTrpQueryDto);
        PageQuery pageQuery = new PageQuery();
        pageQuery.setPageParams(total, rows, page);
        hspUhfTrpQueryDto.setPageQuery(pageQuery);
        List<HspUhfTrp> list = hspUhfTrpService.findHspUhfTrpList(hspUhfTrpQueryDto);
        DataGridResultInfo dataGridResultInfo = new DataGridResultInfo();
        //填充total
        dataGridResultInfo.setTotal(total);
        //填充rows
        dataGridResultInfo.setRows(list);
        return dataGridResultInfo;
    }


    /**
     * 根据trpSeq获取单条UHF标签信息
     * @param trpSeq
     * @return
     * @throws Exception
     */
    @RequestMapping("/getHspUhfTrpByRdrSeq")
    @ResponseBody
    public SubmitResultInfo getHspUhfTrpByRdrSeq(String trpSeq) throws Exception {

        ResultInfo resultInfo = hspUhfTrpService.getHspUhfTrpByRdrSeq(trpSeq);

        return ResultUtil.createSubmitResult(resultInfo);
    }


    /**
     * 跳转UHF应答器新增界面
     *
     * @param model
     * @return
     * @throws Exception
     */
    @RequestMapping("/addHspUhfTrp")
    public String addHspUhfTrp(Model model) throws Exception {
        return View.toRfid("/addHspUhfTrp");
    }

    /**
     * UHF应答器新增提交(提交结果转json输出到页面、提交表单数据统一使用包装类)
     *
     * @param hspUhfTrpQueryDto
     * @return
     * @throws Exception
     */
    @RequestMapping("/addHspUhfTrpSubmit")
    public @ResponseBody
    SubmitResultInfo addHspUhfTrpSubmit(ActiveUser activeUser, @RequestBody HspUhfTrpQueryDto hspUhfTrpQueryDto) throws Exception {
        ResultInfo resultInfo = null;
        if(hspUhfTrpQueryDto!=null && hspUhfTrpQueryDto.getHspUhfTrpCustom()!=null){
            HspUhfTrpCustom hspUhfTrpCustom = hspUhfTrpQueryDto.getHspUhfTrpCustom();
            if(hspUhfTrpCustom!=null){
                hspUhfTrpCustom.setCrtUsrNo(activeUser.getUsrno());
                hspUhfTrpCustom.setCrtUsrNam(activeUser.getUsrname());
                resultInfo = hspUhfTrpService.insertHspUhfTrp(hspUhfTrpCustom);
            }
        }else{
            resultInfo = ResultUtil.createSuccess(Config.MESSAGE, 906, null);
        }
        return ResultUtil.createSubmitResult(resultInfo);
    }

    /**
     * 跳转UHF应答器修改界面
     * @param model
     * @param trpSeq
     * @return
     * @throws Exception
     */
    @RequestMapping("/editHspUhfTrp")
    public String editHspUhfTrp(Model model, String trpSeq) throws Exception {
        // 根据rdrSeq获取UHF应答器信息并传回页面
        model.addAttribute("trpSeq", trpSeq);
        return View.toRfid("/editHspUhfTrp");
    }

    /**
     * UHF应答器修改提交
     * @param hspUhfTrpQueryDto
     * @return
     * @throws Exception
     */
    @RequestMapping("/editHspUhfTrpSubmit")
    public @ResponseBody
    SubmitResultInfo editHspUhfTrpSubmit(ActiveUser activeUser,@RequestBody HspUhfTrpQueryDto hspUhfTrpQueryDto) throws Exception {
        ResultInfo resultInfo = null;
        if(hspUhfTrpQueryDto!=null && hspUhfTrpQueryDto.getHspUhfTrpCustom()!=null){
            HspUhfTrpCustom hspUhfTrpCustom = hspUhfTrpQueryDto.getHspUhfTrpCustom();
            hspUhfTrpCustom.setModUsrNo(activeUser.getUsrno());
            hspUhfTrpCustom.setModUsrNam(activeUser.getUsrname());
            resultInfo = hspUhfTrpService.updateHspUhfTrp(hspUhfTrpCustom);
        }else{
            resultInfo = ResultUtil.createWarning(Config.MESSAGE, 920, null);
        }
        return ResultUtil.createSubmitResult(resultInfo);
    }

    /**
     * 删除UHF应答器
     *
     * @param trpSeq
     * @return
     * @throws Exception
     */
    @RequestMapping("/deleteHspUhfTrp")
    public @ResponseBody
    SubmitResultInfo deleteHspUhfTrp(String trpSeq) throws Exception {
        hspUhfTrpService.deleteHspUhfTrp(trpSeq);
        return ResultUtil.createSubmitResult(ResultUtil.createSuccess(Config.MESSAGE, 906, null));
    }


}
