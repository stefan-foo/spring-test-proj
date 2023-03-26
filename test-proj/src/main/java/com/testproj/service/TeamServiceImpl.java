/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.testproj.service;


import com.testproj.dtos.CreateTeamDTO;
import com.testproj.dtos.TeamDTO;
import com.testproj.model.Team;
import com.testproj.repository.TeamRepository;
import java.util.List;
import java.util.stream.StreamSupport;
import java.util.stream.Collectors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author banne
 */
@Service
public class TeamServiceImpl implements TeamService {
    @Autowired
    private TeamRepository teamRepository;
    
    @Override
    public TeamDTO createTeam(CreateTeamDTO newTeam) {
        Team team = new Team()
            .setName(newTeam.getName());
        
        teamRepository.save(team);
        return new TeamDTO(team.getId(), team.getName());
    }

    @Override
    public List<TeamDTO> getAllTeams() {
        return StreamSupport.stream(teamRepository.findAll().spliterator(), true)
                .map((team) -> new TeamDTO(team.getId(), team.getName()))
                .collect(Collectors.toList());
    }
    
}
