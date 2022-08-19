package com.example.postgres.springpostgresdocker.customerInfo;

import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerInfoRepository extends JpaRepository<CustomerInfoEntity,String> {
}
