package com.ecommerce.ecommerce.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ecommerce.ecommerce.entity.Address;

public interface AddressRepository extends JpaRepository<Address,Integer>{
    
}
