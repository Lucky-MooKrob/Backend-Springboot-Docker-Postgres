package com.example.postgres.springpostgresdocker.Insure;

import com.example.postgres.springpostgresdocker.bullet.BulletResponse;
import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

import java.util.List;

@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class InsureResponse {
    Long id;
    String name;
    Long price;
    String pic;
    Long minAge;
    Long maxAge;
    List<String> bullets;
}
