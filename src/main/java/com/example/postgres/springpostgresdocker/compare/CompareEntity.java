package com.example.postgres.springpostgresdocker.compare;


import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

import javax.persistence.*;

@Getter
@Setter
@Entity
@Table(name = "compare")
@FieldDefaults(level = AccessLevel.PRIVATE)
public class CompareEntity {

    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    @Column(name = "insure_id")
    Long insureId;

    @Column
    Long compareId;

    @Column
    String ageCoverage;

    @Column
    String dailyCom;

    @Column
    String ipdRoom;

    @Column
    String opdCoverage;

    @Column
    String maxCoverage;

    @Column
    Long taxBenefit;

}