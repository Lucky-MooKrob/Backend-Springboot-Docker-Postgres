package com.example.postgres.springpostgresdocker.bullet;


import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class BulletResponse {
    String name;
}
