package com.ecommerce.ecommerce.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.ecommerce.ecommerce.entity.User;

public interface UserRepository extends JpaRepository<User,Integer>{
    
    @Query("select u FROM User u WHERE u.email =:email")
    public User findByEmail(@Param("email") String email);
}
