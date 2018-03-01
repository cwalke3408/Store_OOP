package com.company;

public class Products {
    String name;
    String description;
    double price;
    int amountInStock;


    Products(String name, String description, double price){
        this.name = name;
        this.description = description;
        this.price = price;
        this.amountInStock = 0;
    }

    Products(String name, String description, double price, int amount){
        this.name = name;
        this.description = description;
        this.price = price;
        this.amountInStock = amount;
    }

    // increase amountInStock when a Product is added
    public void incrementStock(){
        this.amountInStock++;
    }

    public void incrementStock(int amount){
        this.amountInStock += amount;
    }

    public void decreamentStock(){
        this.amountInStock--;
    }

    public void decreamentStock(int amount){
        if(amount != 0 )
            this.amountInStock -= amount;
    }

    public void setAmountInStock(int amount){
        this.amountInStock = (amount < this.amountInStock) ? this.amountInStock - amount : 0;
    }
}
