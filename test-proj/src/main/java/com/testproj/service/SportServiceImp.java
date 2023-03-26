/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.testproj.service;

import com.testproj.model.Sport;
import com.testproj.repository.SportRepository;
import java.util.List;
import java.util.Optional;
import java.util.stream.StreamSupport;
import java.util.stream.Collectors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

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
        return StreamSupport.stream(sportRepository.findAll().spliterator(), true).collect(Collectors.toList());
    }

    @Override
    public Sport getSport(String code) {
        Optional<Sport> sport = sportRepository.findById(code);
        if (sport.isPresent()) {
            return sport.get();
        } else {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Sport not found");
        }
    }

    @Override
    public void deleteSport(String code) {
        try {
            Optional<Sport> sport = sportRepository.findById(code);
            if (sport.isPresent()) {
                sportRepository.delete(sport.get());
            } else {
                throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Sport not found");
            }
        } catch (ResponseStatusException e) {
            throw e;
        } catch (Exception e) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Sport deletion failed");
        }
    }

    @Override
    public Sport createSport(Sport sport) {
        if (sportRepository.findById(sport.getCode()).isPresent()) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Sport with entered code already exists");
        } 
        
        return sportRepository.save(sport);
    }

    @Override
    public Sport updateSport(Sport updatedSport) {
        Optional<Sport> optionalSport = sportRepository.findById(updatedSport.getCode());
        
        if (optionalSport.isEmpty()) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Sport does not exist");
        } 
        
        Sport sport = optionalSport.get();
        sport.setName(updatedSport.getName())
            .setSortOrder(updatedSport.getSortOrder());
        
        return sportRepository.save(sport);
    }

    @Override
    public List<Sport> searchSportsByName(String query) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
