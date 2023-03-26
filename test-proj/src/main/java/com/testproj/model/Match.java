/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.testproj.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import lombok.Data;
import lombok.experimental.Accessors;

/**
 *
 * @author banne
 */
@Entity
@Data
@Accessors(chain = true)
public class Match {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private int scoreHome;
    private int scoreAway;
    @ManyToOne
    @JoinColumn(name = "away_team", nullable = false)
    private Team awayTeam;
    @ManyToOne
    @JoinColumn(name = "home_team", nullable = false)
    private Team homeTeam;
}
