package com.example.postgres.springpostgresdocker.insuranceInfo;

import com.example.postgres.springpostgresdocker.model.Insurance;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class InsuranceInfoController {

    @Autowired
    InsuranceInfoService insuranceInfoService;

    @Autowired
    InsuranceInfoRepository insuranceInfoRepository;

    @PostMapping("/InsuranceDetails")
    public InsuranceInfoModelResponse insuranceDetail(@RequestBody InsuranceInfoModelRequest request){
        return insuranceInfoService.insuranceInfoCreate(request);
    }

    @GetMapping("/InsuranceDetails")
    public  List<InsuranceInfoEntity> getAllInsurance(){
        return insuranceInfoRepository.findAll();
    }
}
