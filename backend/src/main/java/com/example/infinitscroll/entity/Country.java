package com.example.infinitscroll.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import java.math.BigDecimal;
import java.math.BigInteger;

import static javax.persistence.GenerationType.IDENTITY;

@Entity(name = "countries")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Country {

    @Id
    @GeneratedValue(strategy = IDENTITY)
    private Integer id;
    
    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private BigInteger population;


    @Column(nullable = false)
    private String capital;

    @Column(nullable = false)
    private BigDecimal area;

    @Column(nullable = false)
    private String language;


}