package edu.matc.entity;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.validator.constraints.NotEmpty;

import javax.persistence.*;
import javax.validation.constraints.Pattern;

/**
 * The type Favorite match.
 */
@Entity(name="Match")
@Table(name ="matches")
public class FavoriteMatch {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "native")
    @GenericGenerator(name = "native", strategy = "native")
    private Integer id;

    @Column(name = "match_id")
    @Pattern(regexp="^[0-9]*$", message = "Match Id must be numeric")
    @NotEmpty(message = "match Id is empty")
    private String matchId;

    @Column(name = "user_name")
    @NotEmpty(message = "username is empty")
    private String username;

    @ManyToOne
    @JoinColumn(name = "user_id",
            foreignKey = @ForeignKey(name = "matches_users_id_fk")
    )
    private User user;

    /**
     * Instantiates a new Favorite match.
     */
    public FavoriteMatch() {
    }

    /**
     * Instantiates a new Favorite match.
     *
     * @param matchId  the match id
     * @param username the username
     * @param user     the user
     */
    public FavoriteMatch(String matchId,String username, User user) {
        this.matchId = matchId;
        this.username = username;
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
     * Gets match id.
     *
     * @return the match id
     */
    public String getMatchId() {
        return matchId;
    }

    /**
     * Sets match id.
     *
     * @param matchId the match id
     */
    public void setMatchId(String matchId) {
        this.matchId = matchId;
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
        return "FavoriteMatch{" +
                "id=" + id +
                ", matchId=" + matchId +
                ", username=" + username +
                ", user=" + user +
                '}';
    }
}
