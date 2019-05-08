package com.xjy.springbootweb.Entity;

public class Products {
    private String name;
    private double price;
    private int storeNum;

    public Products(String name, double price, int storeNum) {
        this.name = name;
        this.price = price;
        this.storeNum = storeNum;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getStoreNum() {
        return storeNum;
    }

    public void setStoreNum(int storeNum) {
        this.storeNum = storeNum;
    }
}
