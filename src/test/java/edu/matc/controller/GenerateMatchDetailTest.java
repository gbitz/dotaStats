package edu.matc.controller;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

/**
 * The type Generate match detail test.
 */
class GenerateMatchDetailTest {
    /**
     * The Generator.
     */
    GenerateMatchDetail generator;

    /**
     * Sets up before each test
     */
    @BeforeEach
    void setUp() {
        generator = new GenerateMatchDetail();
    }

    /**
     * Gets match detail.
     *
     * @throws Exception the exception
     */
    @Test
    void getMatchDetail() throws Exception {
        assertEquals(20,generator.getMatchDetail(Long.parseLong("4730832010")).getRadiantScore());

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