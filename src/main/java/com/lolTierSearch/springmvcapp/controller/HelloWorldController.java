
package com.lolTierSearch.springmvcapp.controller;
/**
 * Created by KangSeongGil on 2017. 1. 6..
 */

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;


@Controller
@RequestMapping(value = "/")
public class HelloWorldController {

    @RequestMapping(value="/hello", method = RequestMethod.GET)
    public ModelAndView viewHello(Model model) {
        String message = "안녕하세요 롤 검색기 입니다";
        return new ModelAndView("hello", "greeting" , message);
    }

}



