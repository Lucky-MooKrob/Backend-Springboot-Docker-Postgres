package com.example.postgres.springpostgresdocker.insuranceInfo;

import lombok.Data;

@Data
public class InsuranceInfoModelRequest {

    private String InsuranceID;
    private String InsurancePic;
    private String InsurancePrice;
    private String InsuranceDetails;
    private String InsuranceName;

}
