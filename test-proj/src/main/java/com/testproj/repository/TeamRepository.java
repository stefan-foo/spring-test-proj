/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.testproj.repository;

import com.testproj.model.Team;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author banne
 */
public interface TeamRepository extends CrudRepository<Team, Long>{
}
