package com.ecommerce.Shopping.repositories;

import com.ecommerce.Shopping.entities.Payment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PaymentRepo extends JpaRepository<Payment, Long>{

}