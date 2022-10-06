package com.ug6.soal1;

import java.util.ArrayList;

public class VendingMachines {
    private String code;
    private int capacity;
    private int usedCapacity;
    private ArrayList<Goods> goods;
    private ArrayList<Double> accpetanceBalance;
    private double consumerMoney;

    public VendingMachines(){

    }
    public VendingMachines(int code, int capacity){
        this.capacity = capacity;
        String kode = String.valueOf(code);
        this.code = kode;
    }
    public VendingMachines(int code, int capacity,Goods goods, double accpetanceBalance){
        String kode = String.valueOf(code);
        this.code = kode;
        //this.accpetanceBalance = accpetanceBalance;
    }
    public void proceedOrder(String goodsCode, int orderQuantity){

    }
    public void takeMoney(double money){

    }
    public void giveGood(double goodsPrice, String goodsName){

    }
    public double withdrawMoney(){
        return 0;
    }
    public void inputGoods(Goods goods){

    }
}