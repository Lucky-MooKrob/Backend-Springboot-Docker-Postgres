package com.example.postgres.springpostgresdocker.type;


import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

import javax.persistence.*;

@Getter
@Setter
@Entity
@Table(name = "type_insure")
@FieldDefaults(level = AccessLevel.PRIVATE)
public class TypeEntity {

    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    @Column
    Long typeId;

    @Column
    String name;

    @Column(name = "insure_id")
    Long insureId;
}
