package com.gg.proj.webapp;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BasicController {

    @RequestMapping(value = "/")
    public String index() {
        return "index";
    }

}
