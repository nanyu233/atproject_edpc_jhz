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

    @RequestMapping("/addyjqd")
    public String addYjqd(Model model, String regSeq) throws Exception {
        model.addAttribute("grpSeq", regSeq);
        return "/edpc/yjqd/addyjqd";
    }
}
