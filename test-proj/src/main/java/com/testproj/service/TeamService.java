/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.testproj.service;

import com.testproj.dtos.CreateTeamDTO;
import com.testproj.dtos.TeamDTO;
import com.testproj.model.Team;
import java.util.List;
/**
 *
 * @author banne
 */
public interface TeamService {
    public TeamDTO createTeam(CreateTeamDTO newTeam);
    public List<TeamDTO> getAllTeams();
}
