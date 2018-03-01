package com.company;

import java.util.ArrayList;

public class Store {
    ArrayList<Vendor> venderArr = new ArrayList<Vendor>();
    ArrayList<String> cartArr = new ArrayList<String>();

    public void addToVenderList(Vendor aVendor){
        venderArr.add(aVendor);
    }

    public void printVendorList(){
        for (Vendor aVendor : venderArr) {
            System.out.println(aVendor.venderName);
        }
    }
}
