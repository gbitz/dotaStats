package edu.matc.persistence;

import edu.matc.entity.FavoriteMatch;
import edu.matc.entity.Role;
import edu.matc.entity.User;
import edu.matc.test.util.Database;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;


public class GenericDaoTest {


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
    void getById() {
        Role role = (Role)roleDao.getById(1);
        assertEquals("admin", role.getRole());
    }

    @Test
    void delete() {

        Role role = (Role)roleDao.getById(1);
        roleDao.delete(role);
        assertNull(roleDao.getById(1));
    }

    @Test
    void getAll() {
        List<User> allUsers = userDao.getAll();
        assertEquals(6, allUsers.size());
        assertEquals("gbitzer", allUsers.get(0).getUserName());
    }

    @Test
    void getByPropertyEqual() {
        List<Role> roles = roleDao.getByPropertyEqual("id","1");
        assertEquals(1, roles.size());
    }

    @Test
    void insert() {
        User newUser = new User("Jimbo", "James", "jjames", "password", "76561197965031622");
        int id = userDao.insert(newUser);
        assertNotEquals(0, id);
        User insertedUser = (User)userDao.getById(id);
        assertEquals("Jimbo", insertedUser.getFirstName());

        Role newRole = new Role("adminTest", newUser);
        int roleId = roleDao.insert(newRole);
        Role insertedRole = (Role)roleDao.getById(roleId);
        assertEquals("adminTest", insertedRole.getRole());
    }

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

    @Test
    void getByPropertyLike() {
        List<Role> roles = roleDao.getByPropertyLike("role", "admin");
        assertEquals(1, roles.size());
    }
}
