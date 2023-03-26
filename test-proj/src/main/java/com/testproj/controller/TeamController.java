/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.testproj.controller;

import com.testproj.dtos.CreateTeamDTO;
import com.testproj.dtos.TeamDTO;
import com.testproj.model.Team;
import com.testproj.service.TeamService;
import java.util.List;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author banne
 */
@RestController
@RequestMapping("/teams")
@Validated
public class TeamController {
    @Autowired
    private TeamService teamService;
    
    @GetMapping
    public List<TeamDTO> getAllTeams() {
        return teamService.getAllTeams();
    }
    
    @PostMapping
    public TeamDTO createTeam(@RequestBody @Valid CreateTeamDTO newTeam) {
        return teamService.createTeam(newTeam);
    }
}
