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
        String message = "안녕하세요 롤 검색기 입니다";
        return new ModelAndView("index_velocity", "greeting" , message);
    }
}