package edu.matc.controller;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

/**
 * The type Match history test.
 */
class MatchHistoryTest {

    /**
     * The Generator.
     */
    MatchHistory generator;

    /**
     * Sets up before each test
     */
    @BeforeEach
    void setUp() {
        generator = new MatchHistory();
    }

    /**
     * Gets matches.
     *
     * @throws Exception the exception
     */
    @Test
    void getMatches() throws Exception {
        assertEquals(22, generator.getMatches("4765894").get(1).getGameMode());
    }

    /**
     * Split json array test.
     *
     * @throws IOException the io exception
     */
    @Test
    void split() throws IOException {
        assertEquals("\"test\"", generator.split("{\"name\":\"test\"}").get(0));

    }

}