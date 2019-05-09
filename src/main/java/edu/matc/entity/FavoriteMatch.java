package edu.matc.entity;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Entity(name="Match")
@Table(name ="matches")
public class FavoriteMatch {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "native")
    @GenericGenerator(name = "native", strategy = "native")
    private Integer id;

    @Column(name = "match_id")
    private String matchId;

    @ManyToOne
    @JoinColumn(name = "user_id",
            foreignKey = @ForeignKey(name = "matches_users_id_fk")
    )
    private User user;

    public FavoriteMatch() {
    }

    public FavoriteMatch(String matchId, User user) {
        this.matchId = matchId;
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
                ", user=" + user +
                '}';
    }
}
