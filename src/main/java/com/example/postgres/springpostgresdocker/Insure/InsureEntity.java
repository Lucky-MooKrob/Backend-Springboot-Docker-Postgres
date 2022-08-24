package com.example.postgres.springpostgresdocker.Insure;

import com.example.postgres.springpostgresdocker.bullet.BulletEntity;
import com.example.postgres.springpostgresdocker.type.TypeEntity;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

import javax.persistence.*;
import java.util.List;

@Getter
@Setter
@Entity
@Table(name = "insure")
@FieldDefaults(level = AccessLevel.PRIVATE)
public class InsureEntity {

    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    @Column
    String name;

    @Column
    Long price;

    @Column
    String pic;

    @Column
    String miniPic;

    @Column
    Long minAge;

    @Column
    Long maxAge;

    @OneToMany
    @JoinColumn(name = "insure_id", referencedColumnName = "id")
    List<BulletEntity> bullets;

    @OneToMany
    @JoinColumn(name = "insure_id", referencedColumnName = "id")
    List<TypeEntity> typeInsure;

}