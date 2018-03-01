package com.company;

import java.util.ArrayList;

public class Vendor {
    ArrayList<Products> productsArr = new ArrayList<Products>();
    String venderName;

    // Vendor Constructor
    Vendor(String venderName){
        this.venderName = venderName;
    }

    // Add Products to Vendor
    public void addToProductsArr(Products product){
        productsArr.add(product);
    }

    public void printProctuctList(){
        for(Products product: productsArr){
            System.out.println("name: " + product.name);
            System.out.println("decription: " + product.description);
            System.out.println("price: " + product.price);
        }
    }

}

