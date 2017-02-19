package com.module;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by bishoy on 19.02.17.
 */
@Controller
public class BaseController {


    @RequestMapping("/home")
    public String homePage() {
        return "index";
    }

}
