package activetech.edpc.action;

import activetech.base.pojo.dto.ActiveUser;
import activetech.base.pojo.dto.PageQuery;
import activetech.base.process.context.Config;
import activetech.base.process.result.DataGridResultInfo;
import activetech.base.process.result.ResultInfo;
import activetech.base.process.result.ResultUtil;
import activetech.base.process.result.SubmitResultInfo;
import activetech.edpc.pojo.domain.HspGrpInf;
import activetech.edpc.pojo.dto.HspDbzlBasCustom;
import activetech.edpc.pojo.dto.HspGrpInfCustom;
import activetech.edpc.pojo.dto.HspGrpInfQueryDto;
import activetech.edpc.pojo.dto.QueryDto;
import activetech.edpc.service.GroupService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 群组管理action
 *
 * @author Chen Haoyuan
 * @date 2023-03-15 15:00
 */
@Controller
@RequestMapping("/group")
public class GroupAction {

    @Autowired
    private GroupService groupService;

    /**
     * 跳转群组管理页面
     *
     * @param model
     * @param moduleid
     * @return
     * @throws Exception
     */
    @RequestMapping("/querygroup")
    public String querygroup(Model model, String moduleid) throws Exception {
        model.addAttribute("moduleid", moduleid);
        return "/edpc/group/querygroup";
    }

    /**
     * 群组管理列表数据分页查询
     *
     * @param hspGrpInfQueryDto
     * @param page
     * @param rows
     * @return
     */
    @RequestMapping("/querygroup_result")
    @ResponseBody
    public DataGridResultInfo queryGroupResult(HspGrpInfQueryDto hspGrpInfQueryDto, int page, int rows) throws Exception {
        // 分页查询群组列表
        int total = groupService.getGroupCount(hspGrpInfQueryDto);
        PageQuery pageQuery = new PageQuery();
        pageQuery.setPageParams(total, rows, page);
        hspGrpInfQueryDto.setPageQuery(pageQuery);
        List<HspGrpInfCustom> list = groupService.getGroupList(hspGrpInfQueryDto);
        DataGridResultInfo dataGridResultInfo = new DataGridResultInfo();
        // 填充total
        dataGridResultInfo.setTotal(total);
        // 填充rows
        dataGridResultInfo.setRows(list);
        return dataGridResultInfo;
    }

    /**
     * 跳转群组新增、修改和详情页面
     *
     * @return
     * @throws Exception
     * @description
     */
    @RequestMapping("/editgroup")
    public String editgroup(Model model, String grpSeq) throws Exception {
        model.addAttribute("grpSeq", grpSeq);
        return "/edpc/group/editgroup";
    }

    /**
     * 根据主键获取群组信息
     *
     * @param hspGrpInfQueryDto
     * @return
     * @throws Exception
     */
    @RequestMapping("/findgroupbyseq")
    @ResponseBody
    public SubmitResultInfo findGroupBySeq(HspGrpInfQueryDto hspGrpInfQueryDto) throws Exception {
        ResultInfo resultInfo = ResultUtil.createSuccess(Config.MESSAGE, 906, null);
        // 根据主键获取群组信息
        HspGrpInf hspGrpInf = groupService.findGroupBySeq(hspGrpInfQueryDto);
        Map<String, Object> sysdata = new HashMap<>();
        sysdata.put("hspGrpInf", hspGrpInf);
        resultInfo.setSysdata(sysdata);
        return ResultUtil.createSubmitResult(resultInfo);
    }

    /**
     * 群组新增提交
     *
     * @param hspGrpInfQueryDto
     * @param activeUser
     * @return
     * @throws Exception
     */
    @RequestMapping("/addgroupsubmit")
    @ResponseBody
    public SubmitResultInfo addGroupSubmit(HspGrpInfQueryDto hspGrpInfQueryDto, ActiveUser activeUser) throws Exception {
        // 群组新增
        groupService.addGroup(hspGrpInfQueryDto, activeUser);
        ResultInfo resultInfo = ResultUtil.createSuccess(Config.MESSAGE, 906, null);
        return ResultUtil.createSubmitResult(resultInfo);
    }

    /**
     * 群组修改提交
     *
     * @param hspGrpInfQueryDto
     * @param activeUser
     * @return
     * @throws Exception
     */
    @RequestMapping("/editgroupsubmit")
    @ResponseBody
    public SubmitResultInfo editGroupSubmit(HspGrpInfQueryDto hspGrpInfQueryDto, ActiveUser activeUser) throws Exception {
        // 群组修改
        groupService.editGroup(hspGrpInfQueryDto, activeUser);
        ResultInfo resultInfo = ResultUtil.createSuccess(Config.MESSAGE, 906, null);
        return ResultUtil.createSubmitResult(resultInfo);
    }

    /**
     * 群组删除提交
     *
     * @param hspGrpInfQueryDto
     * @param activeUser
     * @return
     * @throws Exception
     */
    @RequestMapping("/delgroupsubmit")
    @ResponseBody
    public SubmitResultInfo delGroupSubmit(HspGrpInfQueryDto hspGrpInfQueryDto, ActiveUser activeUser) throws Exception {
        // 群组删除
        groupService.delGroup(hspGrpInfQueryDto, activeUser);
        ResultInfo resultInfo = ResultUtil.createSuccess(Config.MESSAGE, 906, null);
        return ResultUtil.createSubmitResult(resultInfo);
    }

    /**
     * 跳转添加用户页面
     *
     * @return
     * @throws Exception
     * @description
     */
    @RequestMapping("/adduser")
    public String adduser(Model model, String grpSeq) throws Exception {
        model.addAttribute("grpSeq", grpSeq);
        return "/edpc/group/adduser";
    }

    /**
     * 群组新增提交
     *
     * @param hspGrpInfQueryDto
     * @param activeUser
     * @return
     * @throws Exception
     */
    @RequestMapping("/addusersubmit")
    @ResponseBody
    public SubmitResultInfo addUserSubmit(@RequestBody HspGrpInfQueryDto hspGrpInfQueryDto, ActiveUser activeUser) throws Exception {
        // TODO 群组新增
        groupService.addUser(hspGrpInfQueryDto, activeUser);
        ResultInfo resultInfo = ResultUtil.createSuccess(Config.MESSAGE, 906, null);
        return ResultUtil.createSubmitResult(resultInfo);
    }
}
