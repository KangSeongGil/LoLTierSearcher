
package com.lolTierSearch.springmvcapp.controller;

/**
 * Created by KangSeongGil on 2017. 1. 6..
 */

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.client.RestTemplate;
import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/intergratedSearch")
public class SearchController{
    @RequestMapping(method = RequestMethod.GET)
    public String initSearch(HttpServletRequest request, Model model) {
        String ID = request.getParameter("searchID");
        RestTemplate restTemplate = new RestTemplate();
        String userInfo = restTemplate.getForObject("https://kr.api.riotgames.com" +
                        "/lol/summoner/v3/summoners/by-name/" +ID+
                        "?api_key=RGAPI-d9340852-9050-4375-ac10-8b151d3d29ad"
                , String.class);
        model.addAttribute("headerCheck","index");
        model.addAttribute("greeting",userInfo);
        return "intergration_search";
    }
}