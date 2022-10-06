package com.ug6.soal1;

public class Goods {
    private String code;
    private String name;
    private int quantity;
    private double price;

    public Goods(){

    }
    public Goods(String code, String name){

        this.code = code;
        this.name = name;
    }

    public Goods(String code,String name, int quantity, double price){

        this.code = code;
        this.quantity = quantity;
        this.price = price;
        this.name = name;
    }

}
