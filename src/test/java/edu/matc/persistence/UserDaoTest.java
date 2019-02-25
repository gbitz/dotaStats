package edu.matc.persistence;

import edu.matc.entity.User;
import org.hibernate.Session;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
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


}