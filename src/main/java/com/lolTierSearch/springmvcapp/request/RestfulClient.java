package com.lolTierSearch.springmvcapp.request;

import org.springframework.web.client.RestTemplate;

import java.util.LinkedHashMap;
import java.util.List;

/**
 * Created by KangSeongGil on 2017. 1. 24..
 */
public class RestfulClient {

    public String getTotalRanking() {
        System.out.println("Testing getUser API----------");
        RestTemplate restTemplate = new RestTemplate();
        String user = restTemplate.getForObject("https://kr.api.pvp.net" +
                "/api/lol/kr/v2.5/league/by-summoner/7643798/" +
                "entry?api_key=RGAPI-b1e0076d-d1f5-40c8-820a-41c8255834ff", String.class);
        return user;
    }
}
