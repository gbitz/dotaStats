package edu.matc.persistence;

import edu.matc.entity.User;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Expression;
import javax.persistence.criteria.Root;
import java.util.List;

/**
 * The userdao used for various CRUD
 */
public class UserDao {
    private final Logger logger = LogManager.getLogger(this.getClass());
    /**
     * The Session factory.
     */
    SessionFactory sessionFactory = SessionFactoryProvider.getSessionFactory();

    /**
     * Get a user by any term and value
     *
     * @param termName term used to search (column name)
     * @param value    search criteria
     * @return list of users meeting the criteria search
     */
    public List<User> getByTermLike(String termName, String value) {
        Session session = sessionFactory.openSession();

        logger.debug("Searching for user with {} = {}",  termName, value);

        CriteriaBuilder builder = session.getCriteriaBuilder();
        CriteriaQuery<User> query = builder.createQuery( User.class );
        Root<User> root = query.from( User.class );
        Expression<String> propertyPath = root.get(termName);
        query.where(builder.like(propertyPath, "%" + value + "%"));
        List<User> users = session.createQuery( query ).getResultList();
        session.close();
        return users;
    }

    /**
     * Gets by id.
     *
     * @param id the id
     * @return the by id
     */
    public User getById(int id) {
        Session session = sessionFactory.openSession();
        User user = session.get(User.class, id);
        session.close();
        return user;
    }

    /**
     * Gets by term equal.
     *
     * @param termName the term name
     * @param value    the value
     * @return the by term equal
     */
    public List<User> getByTermEqual(String termName, String value) {
        Session session = sessionFactory.openSession();

        logger.debug("Searching for user with " + termName + " = " + value);

        CriteriaBuilder builder = session.getCriteriaBuilder();
        CriteriaQuery<User> query = builder.createQuery( User.class );
        Root<User> root = query.from( User.class );
        query.select(root).where(builder.equal(root.get(termName), value));
        List<User> users = session.createQuery( query ).getResultList();
        session.close();
        return users;
    }

    public int insertUser(User user) {
        int id = 0;
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        id = (int)session.save(user);
        transaction.commit();
        session.close();
        return id;
    }

    public void updateUser(User user) {
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        session.saveOrUpdate(user);
        transaction.commit();
        session.close();

    }

    /**
     * Delete a user
     *
     * @param user User to be deleted
     */
    public void deleteUser(User user) {
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        logger.debug("user..." + user);
        session.delete(user);
        transaction.commit();
        session.close();
    }


}
