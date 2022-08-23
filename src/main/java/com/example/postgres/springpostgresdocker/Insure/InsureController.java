package com.example.postgres.springpostgresdocker.Insure;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class InsureController {
    @Autowired
    InsureRepository insureRepository;

    @GetMapping("/insure")
    List<InsureEntity> getAll(){
        return insureRepository.findAll();
    }
}
