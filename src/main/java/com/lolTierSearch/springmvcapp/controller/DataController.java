
package com.lolTierSearch.springmvcapp.controller;
/**
 * Created by KangSeongGil on 2017. 1. 6..
 */

import com.lolTierSearch.springmvcapp.request.RestfulClient;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;


@Controller
@RequestMapping("/")
public class DataController {

    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public ModelAndView sayHello(Model model) {
        RestfulClient rankingGetter = new RestfulClient();
        String ranking = rankingGetter.getTotalRanking();

        return new ModelAndView("index","rank", ranking);
    }

}