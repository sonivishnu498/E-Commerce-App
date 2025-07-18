package com.ecommerce.Shopping.repositories;

import com.ecommerce.Shopping.entities.OrderItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;



@Repository
public interface OrderItemRepo extends JpaRepository<OrderItem, Long> {

}