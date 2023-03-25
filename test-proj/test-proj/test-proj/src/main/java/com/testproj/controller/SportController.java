/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.testproj.controller;

import com.testproj.service.SportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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
    
    @GetMapping("")
    public String world(){
        return "Hello";
    }
    
    @GetMapping("/{id}")
    public String getSport(@PathVariable(name = "id") String vidsdd) {
        return "sport1";
    }
}
