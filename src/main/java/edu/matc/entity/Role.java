package edu.matc.entity;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.validator.constraints.NotEmpty;

import javax.persistence.*;


/**
 * The type Role.
 */
@Entity(name = "Role")
@Table(name = "roles")
public class Role {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "native")
    @GenericGenerator(name = "native", strategy = "native")
    private Integer id;


    @Column(name = "role_title")
    @NotEmpty(message = "role is empty")
    private String role;


    @Column(name = "user_name")
    @NotEmpty(message = "username is empty")
    private String username;

    @ManyToOne
    @JoinColumn(name = "user_id", foreignKey = @ForeignKey(name = "roles_users_id_fk"))
    private User user;

    /**
     * Instantiates a new Role.
     */
    public Role() {
    }

    /**
     * Instantiates a new Role.
     *
     * @param role     the role
     * @param username the username
     * @param user     the user
     */
    public Role(String role,String username, User user) {
        this.role = role;
        this.username= username;
        this.user = user;
    }

    /**
     * Gets id.
     *
     * @return the id
     */
    public Integer getId() {
        return id;
    }

    /**
     * Sets id.
     *
     * @param id the id
     */
    public void setId(Integer id) {
        this.id = id;
    }


    /**
     * Gets username.
     *
     * @return the username
     */
    public String getUsername() {
        return username;
    }

    /**
     * Sets username.
     *
     * @param username the username
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * Gets role.
     *
     * @return the role
     */
    public String getRole() {
        return role;
    }

    /**
     * Sets role.
     *
     * @param role the role
     */
    public void setRole(String role) {
        this.role = role;
    }

    /**
     * Gets user.
     *
     * @return the user
     */
    public User getUser() {
        return user;
    }

    /**
     * Sets user.
     *
     * @param user the user
     */
    public void setUser(User user) {
        this.user = user;
    }

    @Override
    public String toString() {
        return "Role{" +
                "id=" + id +
                ", role='" + role + '\'' +
                ", user=" + user +
                '}';
    }


}
