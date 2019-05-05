package edu.matc.controller;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.opendota.matches.Match;
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


public class MatchHistory {


    public List<Match> getMatches(String steamId) throws Exception {
        final Logger logger = LogManager.getLogger(this.getClass());

        List<String> matches;
        List<Match> userMatches = new ArrayList<>();
        Client client = ClientBuilder.newClient();
        WebTarget target =
                client.target("https://api.opendota.com/api/players/"+ steamId +"/matches");
        String response = target.request(MediaType.APPLICATION_JSON).get(String.class);
        matches = split(response);
        for (String match : matches) {
            ObjectMapper mapper = new ObjectMapper();
            Match currentMatch = mapper.readValue(match, Match.class);
            userMatches.add(currentMatch);

        }
        return userMatches;
    }


    public List<String> split(final String jsonArray) throws IOException {
        final JsonNode jsonNode = new ObjectMapper().readTree(jsonArray);
        return StreamSupport.stream(jsonNode.spliterator(), false) // Stream
                .map(JsonNode::toString) // map to a string
                .collect(Collectors.toList()); //and collect as a List
    }
}
