package edu.matc.entity;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.validator.constraints.NotEmpty;

import javax.persistence.*;
import javax.validation.constraints.Pattern;

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

    public FavoriteMatch() {
    }

    public FavoriteMatch(String matchId,String username, User user) {
        this.matchId = matchId;
        this.username = username;
        this.user = user;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getMatchId() {
        return matchId;
    }

    public void setMatchId(String matchId) {
        this.matchId = matchId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public User getUser() {
        return user;
    }

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
