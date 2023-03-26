/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.testproj.service;

import com.testproj.dtos.CreateMatchDTO;
import com.testproj.dtos.MatchDTO;
import com.testproj.model.Match;
import com.testproj.model.Team;
import com.testproj.repository.MatchRepository;
import com.testproj.repository.TeamRepository;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

/**
 *
 * @author banne
 */
@Service
public class MatchServiceImpl implements MatchService {
    private TeamRepository teamRepository;
    private MatchRepository matchRepository;
    
    @Autowired
    public MatchServiceImpl(TeamRepository teamRepository, MatchRepository matchRepository) {
        this.teamRepository = teamRepository;
        this.matchRepository = matchRepository;
    }
    
    @Override
    public MatchDTO createMatch(CreateMatchDTO newMatch) {
        Optional<Team> homeTeamOptional = teamRepository.findById(newMatch.getHomeTeamId());
        Optional<Team> awayTeamOptional = teamRepository.findById(newMatch.getAwayTeamId());
        
        if (homeTeamOptional.isEmpty() || awayTeamOptional.isEmpty()) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST);
        }
        
        Match match = new Match()
            .setAwayTeam(awayTeamOptional.get())
            .setHomeTeam(homeTeamOptional.get())
            .setScoreAway(newMatch.getScoreAway())
            .setScoreHome(newMatch.getScoreHome());
        
        match = matchRepository.save(match);
        return new MatchDTO(match.getId(), match.getScoreHome(), match.getScoreAway());
    }
    
}
