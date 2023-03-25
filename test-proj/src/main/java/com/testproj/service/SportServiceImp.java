/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.testproj.service;

import com.testproj.model.Sport;
import com.testproj.repository.SportRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author banne
 */
@Service
public class SportServiceImp implements SportService {

    @Autowired
    private SportRepository sportRepository;
    
    @Override
    public List<Sport> getAllSports() {
        return List.of();
    }
    
}
