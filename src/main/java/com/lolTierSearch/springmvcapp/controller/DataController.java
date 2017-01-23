
package com.lolTierSearch.springmvcapp.controller;
/**
 * Created by KangSeongGil on 2017. 1. 6..
 */

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller

public class DataController {

    @RequestMapping(method = RequestMethod.GET)
    public String sayHello(Model model) {
        return "/WEB-INF/views/index.vm";
    }

}