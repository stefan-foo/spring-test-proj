/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.testproj.dtos;

import javax.validation.Payload;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;
import lombok.Getter;

/**
 *
 * @author banne
 */
@Getter
public class CreateTeamDTO {
    @NotEmpty
    @Size(min = 2, max = 50, message = "Length of team name must be between 2 and 50 characters")
    private String name;
}
