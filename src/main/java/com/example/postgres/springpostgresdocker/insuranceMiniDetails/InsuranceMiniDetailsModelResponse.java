package com.example.postgres.springpostgresdocker.insuranceMiniDetails;

import lombok.Data;

@Data
public class InsuranceMiniDetailsModelResponse {
    private String insuranceMiniDetailsPic;
    private String insuranceMiniDetailsPrice;
    private String insuranceMiniDetailsFBulletin;
    private String insuranceMiniDetailsSBulletin;
    private String insuranceMiniDetailsTBulletin;
    private String insuranceMiniDetailsName;
}
