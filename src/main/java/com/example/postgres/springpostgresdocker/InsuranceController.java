package com.example.postgres.springpostgresdocker;

//import com.example.postgres.springpostgresdocker.model.Employee;
import com.example.postgres.springpostgresdocker.model.Insurance;
import com.example.postgres.springpostgresdocker.repository.InsuranceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class InsuranceController {
    @Autowired
    private InsuranceRepository insuranceRepository;

    @PostMapping("/insurance")
    public Insurance addInsurance(@RequestBody Insurance insurance) {
        return insuranceRepository.save(insurance);
    }

    @GetMapping("/findall")
    public ResponseEntity<List<Insurance>> getAllInsurance() {
        return ResponseEntity.ok(insuranceRepository.findAll());
    }

    @GetMapping("findbyid/{id}")
    public ResponseEntity<Insurance> findInsuranceById(@PathVariable(value = "id") Integer insuranceId) {
        Insurance insurance = insuranceRepository.findById(insuranceId).orElseThrow(
                () -> new ResouceNotFoundException("Insurance not found" + insuranceId));
        return ResponseEntity.ok().body(insurance);
    }

//    @GetMapping("FindByInsuranceId/{insuranceid}")
//    public ResponseEntity<Insurance> findInsuranceByInsuranceId(@PathVariable(value = "insuranceid") String insuranceId) {
//        Insurance insurance = insuranceRepository.find(insuranceId).orElseThrow(
//                () -> new ResouceNotFoundException("Insurance not found" + insuranceId));
//        return ResponseEntity.ok().body(insurance);
//    }


    @PutMapping("updatebyid/{id}")
    public ResponseEntity<Insurance> updateInsurance(@PathVariable(value = "id") Integer insuranceId,
                                                   @RequestBody Insurance insuranceDetails) {
        Insurance insurance = insuranceRepository.findById(insuranceId)
                .orElseThrow(() -> new ResouceNotFoundException("Insurance not found for this id :: " + insuranceId));
        insurance.setName(insuranceDetails.getName());
        insurance.setInsuranceid(insuranceDetails.getInsuranceid());
        insurance.setDetail(insuranceDetails.getDetail());
        insurance.setPrice(insuranceDetails.getPrice());
        final Insurance updatedInsurance = insuranceRepository.save(insurance);
        return ResponseEntity.ok(updatedInsurance);
    }

    @DeleteMapping("deletebyid/{id}")
    public ResponseEntity<Void> deleteInsurance(@PathVariable(value = "id") Integer insuranceId) {
        Insurance insurance = insuranceRepository.findById(insuranceId).orElseThrow(
                () -> new ResouceNotFoundException("Insurance not found" + insuranceId));
        insuranceRepository.delete(insurance);
        return ResponseEntity.ok().build();
    }
}
