package edu.matc.persistence;

import edu.matc.entity.FavoriteMatch;
import edu.matc.entity.Role;
import edu.matc.entity.User;
import edu.matc.test.util.Database;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;


/**
 * The type Generic dao test.
 */
public class GenericDaoTest {
    /**
     * The User dao.
     */
    GenericDao userDao;
    /**
     * The Role dao.
     */
    GenericDao roleDao;
    /**
     * The Favorite match dao.
     */
    GenericDao favoriteMatchDao;

    /**
     * Sets up before each test
     */
    @BeforeEach
    void setUp() {
        userDao = new GenericDao(User.class);
        roleDao = new GenericDao(Role.class);
        favoriteMatchDao = new GenericDao(FavoriteMatch.class);
        Database database = Database.getInstance();
        database.runSQL("cleandb.sql");
    }

    /**
     * Gets by id test.
     */
    @Test
    void getById() {
        Role role = (Role)roleDao.getById(1);
        assertEquals("admin", role.getRole());
    }

    /**
     * Delete test test.
     */
    @Test
    void delete() {

        Role role = (Role)roleDao.getById(1);
        roleDao.delete(role);
        assertNull(roleDao.getById(1));
    }

    /**
     * Gets all test.
     */
    @Test
    void getAll() {
        List<User> allUsers = userDao.getAll();
        assertEquals(6, allUsers.size());
        assertEquals("gbitzer", allUsers.get(0).getUserName());
    }

    /**
     * Gets by property equal test.
     */
    @Test
    void getByPropertyEqual() {
        List<Role> roles = roleDao.getByPropertyEqual("id","1");
        assertEquals(1, roles.size());
    }

    /**
     * Insert test.
     */
    @Test
    void insert() {
        User newUser = new User("Jimbo", "James", "jjames", "password", "1111");
        int id = userDao.insert(newUser);
        assertNotEquals(0, id);
        User insertedUser = (User)userDao.getById(id);
        assertEquals("Jimbo", insertedUser.getFirstName());

        Role newRole = new Role("adminTest",newUser.getUserName(), newUser);
        int roleId = roleDao.insert(newRole);
        Role insertedRole = (Role)roleDao.getById(roleId);
        assertEquals("adminTest", insertedRole.getRole());
    }

    /**
     * Save or update test.
     */
    @Test
    void saveOrUpdate() {
        String changedRoleName = "adminTest";
        Role roleToChange = (Role)roleDao.getById(3);
        roleToChange.setRole(changedRoleName);
        roleDao.saveOrUpdate(roleToChange);
        Role retrievedRole = (Role)roleDao.getById(3);
        String roleTitle = retrievedRole.getRole();
        assertEquals("adminTest", roleTitle);
    }

    /**
     * Gets by property like test.
     */
    @Test
    void getByPropertyLike() {
        List<Role> roles = roleDao.getByPropertyLike("role", "admin");
        assertEquals(1, roles.size());
    }
}
