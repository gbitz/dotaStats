package edu.matc.controller;


import com.fasterxml.jackson.databind.ObjectMapper;
import com.opendota.player.Player;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;


public class PlayerInfo {


    public Player getPlayerInfo(String steamId) throws Exception {
        final Logger logger = LogManager.getLogger(this.getClass());
        logger.debug("current user steamId : " + steamId);
        Player player;

        Client client = ClientBuilder.newClient();
        WebTarget target =
                client.target("https://api.opendota.com/api/players/" + steamId);
        String response = target.request(MediaType.APPLICATION_JSON).get(String.class);

        ObjectMapper mapper = new ObjectMapper();
//        mapper.disable(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES);
        player = mapper.readValue(response, Player.class);

        return player;
    }
}

