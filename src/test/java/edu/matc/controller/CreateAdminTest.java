package edu.matc.controller;

import edu.matc.entity.FavoriteMatch;
import edu.matc.entity.Role;
import edu.matc.entity.User;
import edu.matc.persistence.GenericDao;
import edu.matc.test.util.Database;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import javax.servlet.*;
import javax.servlet.http.*;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.security.Principal;
import java.util.Collection;
import java.util.Enumeration;
import java.util.Locale;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class CreateAdminTest {


    GenericDao userDao;
    GenericDao roleDao;
    GenericDao favoriteMatchDao;


    @BeforeEach
    void setUp() {
        userDao = new GenericDao(User.class);
        roleDao = new GenericDao(Role.class);
        favoriteMatchDao = new GenericDao(FavoriteMatch.class);
        Database database = Database.getInstance();
        database.runSQL("cleandb.sql");
    }

    @Test
    void doGet() {
    }

    @Test
    void makeAdmin() {
    }

}