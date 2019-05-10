package edu.matc.controller;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.opendota.heroStats.HeroStats;
import com.opendota.matchDetail.MatchDetail;
import com.opendota.matches.Match;
import com.opendota.player.Player;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;


public class GenerateMatchDetail {


    public MatchDetail getMatchDetail(long matchId) throws Exception {
        final Logger logger = LogManager.getLogger(this.getClass());
        MatchDetail matchDetail;

        Client client = ClientBuilder.newClient();
        WebTarget target =
                client.target("https://api.opendota.com/api/matches/" + matchId);
        String response = target.request(MediaType.APPLICATION_JSON).get(String.class);
        ObjectMapper mapper = new ObjectMapper();
        mapper.disable(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES);
        matchDetail = mapper.readValue(response, MatchDetail.class);

        return matchDetail;

    }


    public List<String> split(final String jsonArray) throws IOException {
        final JsonNode jsonNode = new ObjectMapper().readTree(jsonArray);
        return StreamSupport.stream(jsonNode.spliterator(), false) // Stream
                .map(JsonNode::toString) // map to a string
                .collect(Collectors.toList()); //and collect as a List
    }
}