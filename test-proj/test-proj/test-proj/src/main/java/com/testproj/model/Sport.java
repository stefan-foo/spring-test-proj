/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.testproj.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import lombok.Data;

/**
 *
 * @author banne
 */
@Entity
@Data
public class Sport {
    @Id
    private String code;
    private String name;
    private String sortOrder;
}
