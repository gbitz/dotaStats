package edu.matc.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;
import java.util.ArrayList;
import java.util.List;

//
//public class MatchHistory {
//
//
//    public Match getMatches(String steamId) throws Exception {
//        final Logger logger = LogManager.getLogger(this.getClass());
//
//        List<String> allMatches = new ArrayList<>();
//
//        Client client = ClientBuilder.newClient();
//        WebTarget target =
//                client.target("https://api.opendota.com/api/players/4765894/matches");
//        String response = target.request(MediaType.APPLICATION_JSON).get(String.class);
//
//        ObjectMapper mapper = new ObjectMapper();
//        Match matches = mapper.readValue(response, Match.class);
//        System.out.println("!!!!!!!!!!!!!!!!!11" + matches);
////        List<PostalCodesItem> zipCodeitems = results.getPostalCodes();
////
////        for (PostalCodesItem zip : zipCodeitems){
////            nearZipCodes.add(zip.getPostalCode());
////        }
////
////
//        return matches;
//    }
//}
