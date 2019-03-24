//package edu.matc.persistence;
//
//import edu.matc.entity.Role;
//import org.apache.logging.log4j.LogManager;
//import org.apache.logging.log4j.Logger;
//import org.hibernate.Session;
//import org.hibernate.SessionFactory;
//import org.hibernate.Transaction;
//
//import javax.persistence.criteria.CriteriaBuilder;
//import javax.persistence.criteria.CriteriaQuery;
//import javax.persistence.criteria.Expression;
//import javax.persistence.criteria.Root;
//import java.util.List;
//
///**
// * The type Role dao.
// */
//public class RoleDao {
//
//    private final Logger logger = LogManager.getLogger(this.getClass());
//    /**
//     * The Session factory.
//     */
//    SessionFactory sessionFactory = SessionFactoryProvider.getSessionFactory();
//
//
//    /**
//     * Gets all roles.
//     *
//     * @return the all roles
//     */
//    public List<Role> getAllRoles() {
//
//        Session session = sessionFactory.openSession();
//        CriteriaBuilder builder = session.getCriteriaBuilder();
//        CriteriaQuery<Role> query = builder.createQuery(Role.class);
//        Root<Role> root = query.from(Role.class);
//        List<Role> roles = session.createQuery(query).getResultList();
//        session.close();
//        return roles;
//    }
//
//
//    /**
//     * Search roles list.
//     *
//     * @param userId the user id
//     * @return the list
//     */
//    public List<Role> searchRoles(Integer userId) {
//
//        logger.debug("Searching for: {}", userId);
//
//        Session session = sessionFactory.openSession();
//
//        CriteriaBuilder builder = session.getCriteriaBuilder();
//        CriteriaQuery<Role> query = builder.createQuery(Role.class);
//        Root<Role> root = query.from(Role.class);
//        Expression<String> propertyPath = root.get("user_id");
//        query.where(builder.like(propertyPath, "%" + userId + "%"));
//        List<Role> roles = session.createQuery(query).getResultList();
//        session.close();
//        return roles;
//    }
//
//
//    /**
//     * Gets by id.
//     *
//     * @param id the id
//     * @return the by id
//     */
//    public Role getById(int id) {
//        Session session = sessionFactory.openSession();
//        Role role = session.get(Role.class, id);
//        session.close();
//        return role;
//    }
//
//
//    /**
//     * Save or update.
//     *
//     * @param role the role
//     */
//    public void saveOrUpdate(Role role) {
//        Session session = sessionFactory.openSession();
//        Transaction transaction = session.beginTransaction();
//        session.saveOrUpdate(role);
//        transaction.commit();
//        session.close();
//    }
//
//    /**
//     * Insert int.
//     *
//     * @param role the role
//     * @return the int
//     */
//    public int insert(Role role) {
//        int id = 0;
//        Session session = sessionFactory.openSession();
//        Transaction transaction = session.beginTransaction();
//        id = (int)session.save(role);
//        transaction.commit();
//        session.close();
//        return id;
//    }
//
//    /**
//     * Delete.
//     *
//     * @param role the role
//     */
//    public void delete(Role role) {
//        Session session = sessionFactory.openSession();
//        Transaction transaction = session.beginTransaction();
//        session.delete(role);
//        transaction.commit();
//        session.close();
//    }
//
//
//    /**
//     * Gets by property equal.
//     *
//     * @param propertyName the property name
//     * @param value        the value
//     * @return the by property equal
//     */
//    public List<Role> getByPropertyEqual(String propertyName, String value) {
//        Session session = sessionFactory.openSession();
//
//        logger.debug("Searching for role with " + propertyName + " = " + value);
//
//        CriteriaBuilder builder = session.getCriteriaBuilder();
//        CriteriaQuery<Role> query = builder.createQuery( Role.class );
//        Root<Role> root = query.from( Role.class );
//        query.select(root).where(builder.equal(root.get(propertyName), value));
//        List<Role> roles = session.createQuery( query ).getResultList();
//
//        session.close();
//        return roles;
//    }
//
//
//    /**
//     * Gets by property like.
//     *
//     * @param propertyName the property name
//     * @param value        the value
//     * @return the by property like
//     */
//    public List<Role> getByPropertyLike(String propertyName, String value) {
//        Session session = sessionFactory.openSession();
//
//        logger.debug("Searching for role with {} = {}",  propertyName, value);
//
//        CriteriaBuilder builder = session.getCriteriaBuilder();
//        CriteriaQuery<Role> query = builder.createQuery( Role.class );
//        Root<Role> root = query.from( Role.class );
//        Expression<String> propertyPath = root.get(propertyName);
//        query.where(builder.like(propertyPath, "%" + value + "%"));
//
//        List<Role> roles = session.createQuery( query ).getResultList();
//        session.close();
//        return roles;
//    }
//
//
//}
