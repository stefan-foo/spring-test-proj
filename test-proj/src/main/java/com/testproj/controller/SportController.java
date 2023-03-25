/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.testproj.controller;

import com.testproj.model.Sport;
import com.testproj.service.SportService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author banne
 */
@RestController
@RequestMapping("/sports")
public class SportController {
    @Autowired
    private SportService sportService;
    
    @GetMapping("hello")
    public String hello() {
        return "hello world";
    }
    
    @GetMapping
    public List<Sport> world(){
        return sportService.getAllSports();
    }
    
    @GetMapping("/{code}")
    public Sport getSport(@PathVariable(name = "code") String code) {
        return sportService.getSport(code);
    }
    
    @PostMapping
    public Sport createSport(@RequestBody Sport sport) {
        return sportService.createSport(sport);
    }
    
    @PutMapping
    public Sport updateSport(@RequestBody Sport sport) {
        return sportService.updateSport(sport);
    }
    
    @DeleteMapping("/{code}")
    public void deleteSport(@PathVariable(name = "code") String code) {
        sportService.deleteSport(code);
    }
}
