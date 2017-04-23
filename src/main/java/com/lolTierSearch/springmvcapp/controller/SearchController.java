
package com.lolTierSearch.springmvcapp.controller;

/**
 * Created by KangSeongGil on 2017. 1. 6..
 */

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.client.RestTemplate;

@Controller
@RequestMapping("/intergrated_search")
public class SearchController {
    @RequestMapping(method = RequestMethod.GET)
    public String initSearch(@RequestParam("searchID") String ID, Model model) {
        RestTemplate restTemplate = new RestTemplate();
        String userInfo = restTemplate.getForObject("https://kr.api.riotgames.com" +
                        "/lol/summoner/v3/summoners/by-name/" + ID +
                        "?api_key=RGAPI-d9340852-9050-4375-ac10-8b151d3d29ad"
                , String.class);
        model.addAttribute("greeting", "안녕하세요 롤 티어 검색기 입니다");
        return "intergration_search.vm";
    }
}