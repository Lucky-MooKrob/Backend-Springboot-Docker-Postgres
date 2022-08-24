package com.example.postgres.springpostgresdocker.Insure;


//import com.example.postgres.springpostgresdocker.mapper.InsureMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class InsureController {
    @Autowired
    InsureRepository insureRepository;

//    @Autowired
//    InsureMapper insureMapper;

    @GetMapping("/insure")
    List<InsureEntity> getAll(){
        return insureRepository.findAll();
    }

//    @GetMapping("/homepage")
//    List<InsureResponse> findAll(){
//        return insureMapper.toInsureResponse(insureRepository.findAll());
//    }
}
