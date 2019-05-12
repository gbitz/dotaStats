package edu.matc.controller;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

/**
 * The type Generate hero stats test.
 */
class GenerateHeroStatsTest {
    /**
     * The Generator.
     */
    GenerateHeroStats generator;

    /**
     * Sets up before each test.
     */
    @BeforeEach
    void setUp() {
        generator = new GenerateHeroStats();
    }

    /**
     * Gets hero stats.
     *
     * @throws Exception the exception
     */
    @Test
    void getHeroStats() throws Exception {
        generator.getHeroStats(0);
        assertEquals("/apps/dota2/images/heroes/wisp_icon.png",generator.getHeroStats(0).getIcon());
    }

    /**
     * Split.
     *
     * @throws IOException the io exception
     */
    @Test
    void split() throws IOException {
        assertEquals("\"test\"", generator.split("{\"name\":\"test\"}").get(0));

    }

}