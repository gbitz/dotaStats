package edu.matc.persistence;

import edu.matc.entity.Role;
import edu.matc.entity.User;
import edu.matc.test.util.Database;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;


/**
 * The type Role dao test.
 */
class RoleDaoTest {

    /**
     * The Dao.
     */
    RoleDao dao;
    /**
     * The User dao.
     */
    UserDao userDao;


    /**
     * Test start up.
     */
    @BeforeEach
    void testStartUp() {

        dao = new RoleDao();
        userDao = new UserDao();


        Database database = Database.getInstance();
        database.runSQL("cleandb.sql");    }


    /**
     * Gets by term like success.
     */
    @Test
    void getByTermLikeSuccess() {
        List<Role> roles = dao.getByPropertyLike("role", "admin");
        assertEquals(1, roles.size());
    }

    /**
     * Gets by id success.
     */
    @Test
    void getByIdSuccess() {
        Role role = dao.getById(1);
        assertEquals("admin", role.getRole());
    }


    /**
     * Gets by term equal success.
     */
    @Test
    void getByTermEqualSuccess() {

        List<Role> roles = dao.getByPropertyEqual("id","1");
        assertEquals(1, roles.size());
    }


    /**
     * Delete role success.
     */
    @Test
    void deleteRoleSuccess() {
        Role role = dao.getById(1);
        dao.delete(role);
        assertNull(dao.getById(1));

    }

    /**
     * Insert role test.
     */
    @Test
    void insertRoleTest() {
        User newUser = new User("Jimbo", "James", "jjames", "password", "76561197965031622");
        int id = userDao.insert(newUser);
        assertNotEquals(0, id);
        User insertedUser = userDao.getById(id);
        assertEquals("Jimbo", insertedUser.getFirstName());

        Role newRole = new Role("adminTest", newUser);
        int roleId = dao.insert(newRole);
        Role insertedRole = dao.getById(roleId);
        assertEquals("adminTest", insertedRole.getRole());

    }

    /**
     * Update role test.
     */
    @Test
    void updateRoleTest() {
        String changedRoleName = "adminTest";
        Role roleToChange = dao.getById(3);
        roleToChange.setRole(changedRoleName);
        dao.saveOrUpdate(roleToChange);
        Role retrievedRole = dao.getById(3);
        String roleTitle = retrievedRole.getRole();
        assertEquals("adminTest", roleTitle);
    }







}