package com.company;

import java.util.ArrayList;

public class Store {
    ArrayList<Vendor> venderArr = new ArrayList<Vendor>();
    ArrayList<Products> cartArr = new ArrayList<Products>();

    public void addToVenderList(Vendor aVendor){
        venderArr.add(aVendor);
    }

    public void addProdToCart(Products aProduct){
        cartArr.add(aProduct);
    }

    public void printVendorList(){
        for (Vendor aVendor : venderArr) {
            System.out.println(aVendor.venderName);
        }
    }

    public void printCartList(){
        System.out.println("----------");
        System.out.println("Items in Cart");
        for(Products aProduct : cartArr) {
            System.out.println(aProduct.name +" price: " + aProduct.price);
        }
    }
}
