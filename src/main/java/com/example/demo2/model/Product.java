package com.example.demo2.model;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;

@Entity
public class Product {
    @Id
    private int productId;
   // private String productPlace;
    private String productName;
    //private String productColour;
    private String productBrand;
    private String productmanufatureId;
    private double productPrice;
    private String productDiscount;
    public int getProductId() {
        return productId;
    }
    public void setProductId(int productId) {
        this.productId = productId;
    }
    // public String getProductPlace() {
    //     return productPlace;
    // }
    // public void setProductPlace(String productPlace) {
    //     this.productPlace = productPlace;
    // }
    public String getProductName() {
        return productName;
    }
    public void setProductName(String productName) {
        this.productName = productName;
    }
    // public String getProductColour() {
    //     return productColour;
    // }
    // public void setProductColour(String productColour) {
    //     this.productColour = productColour;
    // }
    public String getProductBrand() {
        return productBrand;
    }
    public void setProductBrand(String productBrand) {
        this.productBrand = productBrand;
    }
    public String getProductmanufatureId() {
        return productmanufatureId;
    }
    public void setProductmanufatureId(String productmanufatureId) {
        this.productmanufatureId = productmanufatureId;
    }
    public double getProductPrice() {
        return productPrice;
    }
    public void setProductmanufacturePrice(double productmanufacturePrice) {
        this.productPrice = productmanufacturePrice;
    }
    public String getProductDiscount() {
        return productDiscount;
    }
    public void setProductDiscount(String productDiscount) {
        this.productDiscount = productDiscount;
    }
    public Product(int productId, String productPlace, String productName, String productColour, String productBrand,
            String productmanufatureId, double productmanufacturePrice, String productDiscount) {
        this.productId = productId;
       // this.productPlace = productPlace;
        this.productName = productName;
       // this.productColour = productColour;
        this.productBrand = productBrand;
        this.productmanufatureId = productmanufatureId;
        this.productPrice = productmanufacturePrice;
        this.productDiscount = productDiscount;
    }
    public Product() {
    }
    @OneToOne(mappedBy = "product", cascade = CascadeType.ALL ,fetch=FetchType.LAZY)
    @JoinColumn(name = "productName")
    @JsonManagedReference
    private Signup signup;
    public Signup getSignup() {
        return signup;
    }
    public void setSignup(Signup signup) {
        this.signup=signup;
    }
    

}