package com.example.postgres.springpostgresdocker.repository;

import com.example.postgres.springpostgresdocker.model.Insurance;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InsuranceRepository extends JpaRepository<Insurance,Integer> {
}
