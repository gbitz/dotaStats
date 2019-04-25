package edu.matc.controller;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.opendota.player.Player;
import com.opendota.player.Profile;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;
import java.util.ArrayList;
import java.util.List;

public class PlayerInfo {


    public Player getPlayerInfo(String steamId) throws Exception {
        final Logger logger = LogManager.getLogger(this.getClass());
        logger.debug("in PlayerInfo");
        Profile userProfile =  new Profile();
        Player player = new Player();
        Client client = ClientBuilder.newClient();
        WebTarget target =
                client.target("https://api.opendota.com/api/players/4765894");
        String response = target.request(MediaType.APPLICATION_JSON).get(String.class);

//        System.out.println(response);

        ObjectMapper mapper = new ObjectMapper();
//        mapper.disable(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES);
        player = mapper.readValue(response, Player.class);
//        userProfile = mapper.readValue(response, Profile.class);
//        logger.debug("!!!!!!!!!!!!!!!!!11" + userProfile);


//        System.out.println(player.getProfile());

//        for (PostalCodesItem zip : zipCodeitems){
//            nearZipCodes.add(zip.getPostalCode());
//        }
//
//
        return player;
    }
}

