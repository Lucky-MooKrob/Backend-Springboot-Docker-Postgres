package com.example.postgres.springpostgresdocker.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Insurance extends InsuranceAudit {
    @Id
    @GeneratedValue
    private int id;
    private String insuranceid;
    private String name;
    private String detail;
    private int price;
}