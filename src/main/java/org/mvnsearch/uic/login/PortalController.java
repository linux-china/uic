package org.mvnsearch.uic.login;

import org.mvnsearch.uic.domain.application.AccountManager;
import org.springframework.beans.factory.annotation.Autowired;
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
    @Autowired
    private AccountManager accountManager;
    //不能引用Domain内部的组件，如repository, service, infrastructure等

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
