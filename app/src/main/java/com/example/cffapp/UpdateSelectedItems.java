package com.example.cffapp;

import android.graphics.Bitmap;

import java.util.ArrayList;

public interface UpdateSelectedItems {
    void addItems(String name, float price,int soluong, Bitmap image);
    void removeItem(String name, float price,int soluong, Bitmap image);
    void updateItem(String name, float price,int soluong, int vitri);

    ArrayList<OrderListModel> getItems();
}
