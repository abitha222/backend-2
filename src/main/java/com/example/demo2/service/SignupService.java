
package com.example.demo2.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo2.model.Signup;
import com.example.demo2.repository.SignupRepo;

@Service
public class SignupService {
    
    @Autowired
    SignupRepo sr;

    public Signup create(Signup se)
    {
        if (se != null) {
            return sr.save(se);
        } else {
            // Handle null case (e.g., throw an exception, return a default value)
            throw new IllegalArgumentException("Signup object cannot be null");
        }
    }

    public List<Signup> getAllUser()
    {
        return sr.findAll();
    }

    public Signup getUserbyId(int userId)
    {
        return sr.findById(userId).orElse(null);
    }
    public Signup getUserById(int userId) 
    {
        return sr.findById(userId).orElse(null);
    }
    public boolean update(int userId,Signup se)
    {
        if(this.getUserById(userId)==null)
        {
            return false;
        }
        try{
            sr.save(se);
        }
        catch(Exception e)
        {
            return false;
        }
        return  true;
    }
    public boolean delete(int Id)
    {
        if(this.getUserById(Id)==null)
        {
            return false;
        }
        sr.deleteById(Id);
        return true;
    }
    
}