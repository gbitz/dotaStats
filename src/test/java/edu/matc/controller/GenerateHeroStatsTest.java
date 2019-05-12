package edu.matc.controller;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

class GenerateHeroStatsTest {
    GenerateHeroStats generator;
    @BeforeEach
    void setUp() {
        generator = new GenerateHeroStats();
    }
    @Test
    void getHeroStats() throws Exception {
        generator.getHeroStats(0);
        assertEquals("/apps/dota2/images/heroes/wisp_icon.png",generator.getHeroStats(0).getIcon());
    }

    @Test
    void split() throws IOException {
        assertEquals("\"test\"", generator.split("{\"name\":\"test\"}").get(0));

    }

}