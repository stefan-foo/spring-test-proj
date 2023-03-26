/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.testproj.controller;

import com.testproj.dtos.CreateMatchDTO;
import com.testproj.dtos.MatchDTO;
import com.testproj.service.MatchService;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
/**
 *
 * @author banne
 */
@RestController
@RequestMapping("/matches")
@Validated
public class MatchController {
    @Autowired
    private MatchService matchService;
    
    @PostMapping
    public MatchDTO createMatch(@RequestBody @Valid CreateMatchDTO newMatch) {
        return matchService.createMatch(newMatch);
    }
}
