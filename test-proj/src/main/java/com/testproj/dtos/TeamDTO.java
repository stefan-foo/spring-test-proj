/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.testproj.dtos;

import javax.validation.constraints.Max;
import javax.validation.constraints.NotEmpty;
import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 *
 * @author banne
 */
@Getter
@AllArgsConstructor
public class TeamDTO {
    private long id;
    private String name;
}
