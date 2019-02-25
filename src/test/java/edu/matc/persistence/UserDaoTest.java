package edu.matc.persistence;

import edu.matc.entity.User;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

/**
 * The type User dao test.
 */
class UserDaoTest {

    UserDao dao;

    /**
     * Test start up.
     */
    @BeforeEach
    void testStartUp() {

        edu.matc.test.util.Database database = edu.matc.test.util.Database.getInstance();
        database.runSQL("cleandb.sql");

        dao = new UserDao();    }

    /**
     * Gets by term like success.
     */
    @Test
    void getByTermLikeSuccess() {
        List<User> users = dao.getByTermLike("firstName", "Grant");
        assertEquals(1, users.size());
    }

    /**
     * Gets by id success.
     */
    @Test
    void getByIdSuccess() {
        User user = dao.getById(1);
        assertEquals("Grant", user.getFirstName());
        assertEquals("Bitzer", user.getLastName());
        assertEquals("gbitzer", user.getUserName());
    }

    /**
     * Gets by term equal success.
     */
    @Test
    void getByTermEqualSuccess() {

        List<User> users = dao.getByTermEqual("steamID", "76561197965031622");
        assertEquals(1, users.size());
    }

    /**
     * Delete user success.
     */
    @Test
    void deleteUserSuccess() {
        User user = dao.getById(1);
        dao.deleteUser(user);
        assertNull(dao.getById(1));

    }

    @Test
    void insertUserTest() {

        User user = new User("Jimbo", "James", "jjames", "password", Long.parseLong("76561197965031622"));
        int id = dao.insertUser(user);
        assertNotEquals(0, id);
        User insertedUser = dao.getById(id);
        assertEquals("Jimbo", insertedUser.getFirstName());
    }

    @Test
    void updateUserTest() {
        String changedUserName = "bitz";
        User userToChange = dao.getById(1);
        userToChange.setUserName(changedUserName);
        dao.updateUser(userToChange);
        User retrievedUser = dao.getById(1);
        assertEquals(userToChange, retrievedUser);
    }







}