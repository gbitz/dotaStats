package edu.matc.controller;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

class GenerateMatchDetailTest {
    GenerateMatchDetail generator;
    @BeforeEach
    void setUp() {
        generator = new GenerateMatchDetail();
    }

    @Test
    void getMatchDetail() throws Exception {
//        assertTrue(generator.getMatchDetail(Long.parseLong("4730832010")).isRadiantWin());
        assertEquals(20,generator.getMatchDetail(Long.parseLong("4730832010")).getRadiantScore());

    }

    @Test
    void split() throws IOException {
        assertEquals("\"test\"", generator.split("{\"name\":\"test\"}").get(0));

    }

}