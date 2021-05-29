package com.example.cffapp;

import android.graphics.Bitmap;

public class DymanicRVModel {

    String name;
    float price;
    private Bitmap image;

    public DymanicRVModel(String name, float price, Bitmap image) {
        this.name = name;
        this.price = price;
        this.image = image;
    }

    public String getName() {
        return name;
    }
    public Bitmap getImage() {
        return image;
    }
    public  float getPrice(){return price;}
}
