package com.example.cffapp;

import android.graphics.Bitmap;

public class OrderListModel {
    String name;
    float price;
    Bitmap image;

    public int getSoluong() {
        return soluong;
    }

    public void setSoluong(int soluong) {
        this.soluong = soluong;
    }

    int soluong;

    public String getName() {
        return name;
    }

    public float getPrice() {
        return price;
    }
    public Bitmap getImage()
    {
    return image;
    }
    public OrderListModel(String name, float price,int soluong, Bitmap image) {
        this.name = name;
        this.price = price;
        this.image = image;
        this.soluong = soluong;
    }
}
