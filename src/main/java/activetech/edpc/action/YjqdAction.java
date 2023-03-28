package activetech.edpc.action;

import activetech.base.pojo.domain.TreeNode;
import activetech.base.pojo.dto.ActiveUser;
import activetech.base.process.context.Config;
import activetech.base.process.result.ResultInfo;
import activetech.base.process.result.ResultUtil;
import activetech.base.process.result.SubmitResultInfo;
import activetech.edpc.pojo.dto.HspGrpInfQueryDto;
import activetech.edpc.pojo.dto.HspYjqdInfQueryDto;
import activetech.edpc.service.YjqdService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * 一键启动action
 *
 * @author Chen Haoyuan
 * @date 2023-03-22 17:04
 */
@Controller
@RequestMapping("/yjqd")
public class YjqdAction {

    @Autowired
    private YjqdService yjqdService;

    /**
     * 跳转一键启动页面
     *
     * @param model
     * @param regSeq    病人信息主键 hsp_dbzl_bas.reg_seq
     * @return
     * @throws Exception
     */
    @RequestMapping("/addyjqd")
    public String addYjqd(Model model, String regSeq) throws Exception {
        model.addAttribute("regSeq", regSeq);
        return "/edpc/yjqd/addyjqd";
    }

    @RequestMapping("/querygroupusertree_result")
    @ResponseBody
    public List<TreeNode> queryGroupUserTree() throws Exception {
        return yjqdService.queryGroupUserTree();
    }

    @RequestMapping("/addyjqdsubmit")
    @ResponseBody
    public SubmitResultInfo addYjqdSubmit(@RequestBody HspYjqdInfQueryDto hspYjqdInfQueryDto, ActiveUser activeUser) throws Exception {
        // 新增一键启动
        yjqdService.addYjqd(hspYjqdInfQueryDto, activeUser);
        ResultInfo resultInfo = ResultUtil.createSuccess(Config.MESSAGE, 906, null);
        return ResultUtil.createSubmitResult(resultInfo);
    }
}
