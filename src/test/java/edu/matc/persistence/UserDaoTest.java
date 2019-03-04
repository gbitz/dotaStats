package edu.matc.persistence;

import edu.matc.entity.User;

import edu.matc.test.util.Database;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

/**
 * The type User dao test.
 */
class UserDaoTest {

    /**
     * The Dao.
     */
    UserDao dao;

    /**
     * Test start up.
     */
    @BeforeEach
    void testStartUp() {

        dao = new UserDao();

        Database database = Database.getInstance();
        database.runSQL("cleandb.sql");    }

    /**
     * Gets by term like success.
     */
    @Test
    void getByTermLikeSuccess() {
        List<User> users = dao.getByPropertyLike("firstName", "Grant");
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

        List<User> users = dao.getByPropertyEqual("steamID", "76561197965031622");
        assertEquals(1, users.size());
    }

    /**
     * Delete user success.
     */
    @Test
    void deleteUserSuccess() {
        User user = dao.getById(1);
        dao.delete(user);
        assertNull(dao.getById(1));

    }

    /**
     * Insert user test.
     */
    @Test
    void insertUserTest() {

        User newUser = new User("Jimbo", "James", "jjames", "password", "76561197965031622");
        int id = dao.insert(newUser);
        assertNotEquals(0, id);
        User insertedUser = dao.getById(id);
        assertEquals("Jimbo", insertedUser.getFirstName());
    }

    /**
     * Update user test.
     */
    @Test
    void updateUserTest() {
        String changedUserName = "bitz";
        User userToChange = dao.getById(1);
        userToChange.setUserName(changedUserName);
        dao.saveOrUpdate(userToChange);
        User retrievedUser = dao.getById(1);
        assertEquals(userToChange, retrievedUser);
    }







}