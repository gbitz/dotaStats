package edu.matc.controller;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

class MatchHistoryTest {

    MatchHistory generator;
    @BeforeEach
    void setUp() {
        generator = new MatchHistory();
    }
    @Test
    void getMatches() throws Exception {
        assertEquals(22, generator.getMatches("4765894").get(1).getGameMode());
    }

    @Test
    void split() throws IOException {
        assertEquals("\"test\"", generator.split("{\"name\":\"test\"}").get(0));

    }

}