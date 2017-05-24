package com.hellospring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


/**
 * Created by The Revenant on 5/23/2017.1weqweadadasdss
 */

@Controller
public class HomeController {
    @RequestMapping("/")
    public String home() {
        return "home";

    }
}
