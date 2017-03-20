package com.lolTierSearch.springmvcapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by KangSeongGil on 2017. 3. 15..
 */
@Controller
public class IndexController {

    @RequestMapping("/index")
    public String indexHandler(ModelMap model) {
        return "/WEB-INF/views/index_velocity";
    }
}