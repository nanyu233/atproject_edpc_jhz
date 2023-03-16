package activetech.edpc.action;

import activetech.base.pojo.dto.ActiveUser;
import activetech.base.pojo.dto.PageQuery;
import activetech.base.process.result.DataGridResultInfo;
import activetech.edpc.pojo.dto.HspDbzlBasCustom;
import activetech.edpc.pojo.dto.HspGrpInfCustom;
import activetech.edpc.pojo.dto.HspGrpInfQueryDto;
import activetech.edpc.pojo.dto.QueryDto;
import activetech.edpc.service.GroupService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @author Chen Haoyuan
 * @description 群组管理action
 * @date 2023-03-15 15:00
 */
@Controller
@RequestMapping("/group")
public class GroupAction {

    @Autowired
    private GroupService groupService;

    /**
     * @description 跳转群组管理页面
     * @param model
     * @param moduleid
     * @return
     * @throws Exception
     */
    @RequestMapping("/querygroup")
    public String tohuzdtob(Model model, String moduleid) throws Exception {
        model.addAttribute("moduleid", moduleid);
        return "/edpc/group/querygroup";
    }

    /**
     * @description 群组管理列表数据分页查询
     * @param hspGrpInfQueryDto
     * @param page
     * @param rows
     * @return
     */
    @RequestMapping("/querygroup_result")
    @ResponseBody
    public DataGridResultInfo queryGroupResult(HspGrpInfQueryDto hspGrpInfQueryDto, int page, int rows){
        // TODO 分页查询群组列表
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
}
