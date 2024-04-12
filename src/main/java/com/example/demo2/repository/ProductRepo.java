package com.example.demo2.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo2.model.Product;



public interface ProductRepo extends JpaRepository<Product,Integer>
{
@Query("SELECT s FROM Product s WHERE s.productName = :productName")
Product findName(@RequestParam("productName") String productName);
}