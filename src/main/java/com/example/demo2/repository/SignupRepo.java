package com.example.demo2.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo2.model.Signup;

public interface SignupRepo extends JpaRepository<Signup,Integer>{
    
}