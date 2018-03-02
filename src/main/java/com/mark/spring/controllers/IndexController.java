package com.mark.spring.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by marklovatt on 02/03/2018.
 */
@Controller
public class IndexController {

    @RequestMapping({"","/","/index"})
    public String getIndex() {
        return "index";
    }
}
