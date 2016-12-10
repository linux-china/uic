package org.mvnsearch.uic;

import org.springframework.stereotype.Controller;
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
}
