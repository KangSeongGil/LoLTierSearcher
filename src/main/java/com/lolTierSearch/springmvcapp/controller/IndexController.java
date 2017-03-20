package com.lolTierSearch.springmvcapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by KangSeongGil on 2017. 3. 15..
 */
@Controller
@RequestMapping("/")
public class IndexController {

    public String indexHandler(ModelMap model) {
        return "/WEB-INF/views/index_velocity";
    }
}