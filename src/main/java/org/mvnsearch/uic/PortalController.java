package org.mvnsearch.uic;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * portal controller
 *
 * @author linux_china
 */
@Controller
public class PortalController {
    @GetMapping("/")
    @ResponseBody
    public String index() {
        return "Hello World!!!";
    }

    @GetMapping("/welcome")
    public String welcome(Model model) {
        model.addAttribute("nick", "雷卷");
        return "welcome";
    }
}
