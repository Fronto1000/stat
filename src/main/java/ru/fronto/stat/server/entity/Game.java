package ru.fronto.stat.server.entity;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by Alex on 10.03.2018.
 */

@Entity
@Table(name = "game")
public class Game {

    @Id
    @GeneratedValue(generator = "increment")
    @GenericGenerator(name = "increment", strategy = "increment")
    private long id;

    @Column(name = "league", nullable = false)
    private String league;

    @Column(name = "round", nullable = false)
    private int round;

    @Column(name = "team1", nullable = false)
    private String team1;

    @Column(name = "team2", nullable = false)
    private String team2;

    @Column(name = "gameDate", nullable = false)
    private Date gameDate;

    @Column(name = "goals1")
    private int goals1;

    @Column(name = "goals2")
    private int goals2;

    @Column(name = "coefficient1", nullable = false)
    private float coefficient1;

    @Column(name = "coefficient2", nullable = false)
    private float coefficient2;

    @Column(name = "coefficientX", nullable = false)
    private float coefficientX;

    public Game() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getLeague() {
        return league;
    }

    public void setLeague(String league) {
        this.league = league;
    }

    public int getRound() {
        return round;
    }

    public void setRound(int round) {
        this.round = round;
    }

    public String getTeam1() {
        return team1;
    }

    public void setTeam1(String team1) {
        this.team1 = team1;
    }

    public String getTeam2() {
        return team2;
    }

    public void setTeam2(String team2) {
        this.team2 = team2;
    }

    public Date getGameDate() {
        return gameDate;
    }

    public void setGameDate(Date gameDate) {
        this.gameDate = gameDate;
    }

    public int getGoals1() {
        return goals1;
    }

    public void setGoals1(int goals1) {
        this.goals1 = goals1;
    }

    public int getGoals2() {
        return goals2;
    }

    public void setGoals2(int goals2) {
        this.goals2 = goals2;
    }

    public float getCoefficient1() {
        return coefficient1;
    }

    public void setCoefficient1(float coefficient1) {
        this.coefficient1 = coefficient1;
    }

    public float getCoefficient2() {
        return coefficient2;
    }

    public void setCoefficient2(float coefficient2) {
        this.coefficient2 = coefficient2;
    }

    public float getCoefficientX() {
        return coefficientX;
    }

    public void setCoefficientX(float coefficientX) {
        this.coefficientX = coefficientX;
    }
}
