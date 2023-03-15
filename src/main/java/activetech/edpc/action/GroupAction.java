package activetech.edpc.action;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author ChenH
 */
@Controller
@RequestMapping("/group")
public class GroupAction {

    @RequestMapping("/togroup")
    public String tohuzdtob(Model model, String moduleid) throws Exception {
        model.addAttribute("moduleid", moduleid);
        return "/edpc/group/querygroup";
    }
}
