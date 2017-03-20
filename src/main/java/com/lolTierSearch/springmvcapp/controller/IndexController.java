package com.lolTierSearch.springmvcapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by KangSeongGil on 2017. 3. 15..
 */
@Controller
public class IndexController {

    @RequestMapping("/")
    public ModelAndView indexHandler(ModelMap model) {
        String message = "Hello LoL Tier Seacher";
        return new ModelAndView("index_velocity", "greeting" , message);
    }
}