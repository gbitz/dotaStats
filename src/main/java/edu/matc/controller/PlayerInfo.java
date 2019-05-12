package edu.matc.controller;


import com.fasterxml.jackson.databind.ObjectMapper;
import com.opendota.player.Player;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;


/**
 * Generator for Player info and stats
 */
public class PlayerInfo {


    /**
     * Calls opendotaapi for player information and stats
     *
     * @param steamId the steam id
     * @return the player info
     * @throws Exception the exception
     */
    public Player getPlayerInfo(String steamId) throws Exception {
        final Logger logger = LogManager.getLogger(this.getClass());
        logger.debug("current user steamId : " + steamId);
        Player player;

        Client client = ClientBuilder.newClient();
        logger.info("https://api.opendota.com/api/players/" + steamId);
        WebTarget target =
                client.target("https://api.opendota.com/api/players/" + steamId);
        String response = target.request(MediaType.APPLICATION_JSON).get(String.class);

        ObjectMapper mapper = new ObjectMapper();
        player = mapper.readValue(response, Player.class);

        return player;
    }
}

