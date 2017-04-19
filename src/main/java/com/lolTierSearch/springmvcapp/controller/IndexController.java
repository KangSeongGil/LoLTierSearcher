package com.lolTierSearch.springmvcapp.controller;
/**
 * Created by KangSeongGil on 2017. 1. 6..
 */

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
@RequestMapping("/")
public class IndexController {

    @RequestMapping(method = RequestMethod.GET)
    public String sayHello(Model model) {
        model.addAttribute("greeting", "안녕하세요 롤 티어 검색기 입니다");
        return "welcome";
    }

}