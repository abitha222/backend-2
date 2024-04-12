package com.example.demo2.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo2.model.Signup;
import com.example.demo2.service.SignupService;

@RestController
public class SignupController {

    @Autowired
    SignupService ss;

    @PostMapping("/api/signup")
    public ResponseEntity<Signup> postUser(@RequestBody Signup signup)
    {
        Signup obj = ss.create(signup);
        return new ResponseEntity<>(obj,HttpStatus.CREATED);
    }

    @GetMapping("/api/signup")
    public ResponseEntity<List<Signup>> getAllUserController()
    {
        List<Signup> obj = ss.getAllUser();
        return new ResponseEntity<>(obj,HttpStatus.OK);
    }
    @PutMapping("/putdata/{Id}")
    public ResponseEntity<Signup> putMethodName(@PathVariable("Id") int userId, @RequestBody Signup se) {
        if(ss.update(userId,se) == true)
        {
            return new ResponseEntity<>(se,HttpStatus.OK);
        }
        
        return new ResponseEntity<>(null,HttpStatus.NOT_FOUND);
    }
@DeleteMapping("/delete/{userId}")
    public ResponseEntity<Boolean> delete(@PathVariable("userId") int userId)
    {
        if(ss.delete(userId) == true)
        {
            return new ResponseEntity<>(true,HttpStatus.OK);
        }
        return new ResponseEntity<>(false,HttpStatus.NOT_FOUND);
    }
}