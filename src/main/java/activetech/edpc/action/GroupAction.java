package activetech.edpc.action;

import activetech.base.pojo.dto.ActiveUser;
import activetech.base.pojo.dto.PageQuery;
import activetech.base.process.result.DataGridResultInfo;
import activetech.edpc.pojo.dto.HspDbzlBasCustom;
import activetech.edpc.pojo.dto.HspGrpInfQueryDto;
import activetech.edpc.pojo.dto.QueryDto;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @author ChenH
 */
@Controller
@RequestMapping("/group")
public class GroupAction {

    @RequestMapping("/querygroup")
    public String tohuzdtob(Model model, String moduleid) throws Exception {
        model.addAttribute("moduleid", moduleid);
        return "/edpc/group/querygroup";
    }

    @RequestMapping("/querygroup_result")
    @ResponseBody
    public DataGridResultInfo queryGroupResult(HspGrpInfQueryDto hspGrpInfQueryDto, ActiveUser activeUser){
        // TODO 分页查询群组列表

        DataGridResultInfo dataGridResultInfo = new DataGridResultInfo();
        // 填充total
//        dataGridResultInfo.setTotal(total);
        // 填充rows
//        dataGridResultInfo.setRows(list);
        return dataGridResultInfo;
    }
}
