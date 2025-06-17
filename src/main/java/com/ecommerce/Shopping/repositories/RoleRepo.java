package com.ecommerce.Shopping.repositories;

import com.ecommerce.Shopping.entities.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;



@Repository
public interface RoleRepo extends JpaRepository<Role, Long> {

}