package edu.matc.controller;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * The type Player info test.
 */
class PlayerInfoTest {
    /**
     * The Generator.
     */
    PlayerInfo generator;

    /**
     * Sets up before test.
     */
    @BeforeEach
    void setUp() {
        generator = new PlayerInfo();
    }

    /**
     * Gets player info.
     *
     * @throws Exception the exception
     */
    @Test
    void getPlayerInfo() throws Exception {
        assertEquals("Chinstrap_45", generator.getPlayerInfo("4765894").getProfile().getPersonaname());
    }

}