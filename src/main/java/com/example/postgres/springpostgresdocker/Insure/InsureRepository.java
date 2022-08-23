package com.example.postgres.springpostgresdocker.Insure;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InsureRepository extends JpaRepository<InsureEntity,Long> {
}
