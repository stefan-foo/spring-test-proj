/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.testproj.dtos;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import lombok.Getter;

/**
 *
 * @author banne
 */
@Getter
public class CreateMatchDTO {
    private int scoreHome = 0;
    private int scoreAway = 0;
    @NotNull
    private long awayTeamId;
    @NotNull
    private long homeTeamId;
}
