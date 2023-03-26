/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.testproj.service;

import com.testproj.dtos.CreateMatchDTO;
import com.testproj.dtos.MatchDTO;

/**
 *
 * @author banne
 */
public interface MatchService {
    public MatchDTO createMatch(CreateMatchDTO newMatch);
}
