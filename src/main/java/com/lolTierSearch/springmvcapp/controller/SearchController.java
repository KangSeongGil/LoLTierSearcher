
package com.lolTierSearch.springmvcapp.controller;

/**
 * Created by KangSeongGil on 2017. 1. 6..
 */

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.lolTierSearch.springmvcapp.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.client.RestTemplate;

import javax.servlet.http.HttpServletRequest;
import java.io.IOException;


@Controller
@RequestMapping("/intergratedSearch")
public class SearchController {
    User user = null;

    @RequestMapping(method = RequestMethod.GET)
    public String initSearch(HttpServletRequest request, Model model) throws IOException {
        String ID = request.getParameter("searchID");
        RestTemplate restTemplate = new RestTemplate();
        String jasonData = restTemplate.getForObject("https://kr.api.riotgames.com/lol/summoner/v3/summoners/by-name/"
                + ID + "?api_key=RGAPI-d9340852-9050-4375-ac10-8b151d3d29ad", String.class);

        if (user == null) {
            initUserInfo(jasonData);
        }

        model.addAttribute("jsonData", user.getID());
        model.addAttribute("headerCheck", "intergration");

        return "intergration_search";
    }

    private void initUserInfo(String jasonData) {
        ObjectMapper mapper = new ObjectMapper();

        try {
            JsonNode root = mapper.readTree(jasonData);
            user = new User(root.path("ID").asLong(), root.path("accountId").asLong(), root.path("name").asText(),
                    root.path("profileIconId").asLong(), root.path("revisionDate").asLong(),
                    root.path("summonerLevel").asLong());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}