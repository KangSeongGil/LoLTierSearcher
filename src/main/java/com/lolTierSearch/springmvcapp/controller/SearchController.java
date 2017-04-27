
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
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;



@Controller
@RequestMapping("/intergratedSearch")
public class SearchController {
    User user = null;

    @RequestMapping(method = RequestMethod.GET)
    public String initSearch(HttpServletRequest request, Model model) throws IOException {
        String ID = request.getParameter("searchID");
        ObjectMapper mapper = new ObjectMapper();

        if (user == null) {
           // initUserInfo(ID);
        }

        model.addAttribute("headerCheck", "intergration");
        //model.addAttribute("check", user.getID());
        model.addAttribute("jsonData", mapper.readTree("https://kr.api.riotgames.com" +
                "/lol/summoner/v3/summoners/by-name/" + ID +
                "?api_key=RGAPI-d9340852-9050-4375-ac10-8b151d3d29ad"););


        return "intergration_search";
    }

    public void initUserInfo(String ID) {
        ObjectMapper mapper = new ObjectMapper();


        try {
            JsonNode root = mapper.readTree("https://kr.api.riotgames.com" +
                    "/lol/summoner/v3/summoners/by-name/" + ID +
                    "?api_key=RGAPI-d9340852-9050-4375-ac10-8b151d3d29ad");
            user = new User(root.path("ID").asInt(),root.path("accountId").asInt(),root.path("name").asText(),
                            root.path("profileIconId").asInt(),root.path("revisionDate").asInt(),
                            root.path("summonerLevel").asInt());
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}