/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.testproj.service;

import com.testproj.model.Sport;
import java.util.List;
/**
 *
 * @author banne
 */


public interface SportService {    
    public List<Sport> getAllSports();
    public Sport getSport(String code);
    public void deleteSport(String code);
    public Sport createSport(Sport sport);
    public Sport updateSport(Sport sport);
}
