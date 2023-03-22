package activetech.edpc.action;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 一键启动action
 *
 * @author Chen Haoyuan
 * @date 2023-03-22 17:04
 */
public class YjqdAction {

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
}
