package com.example.postgres.springpostgresdocker.bullet;

import lombok.AccessLevel;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

import javax.persistence.*;

@Getter
@Setter
@Entity
@Table(name = "bullet")
@FieldDefaults(level = AccessLevel.PRIVATE)
public class BulletEntity {

    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    @Column(name = "insure_id")
    Long insureId;

    @Column
    String name;

}