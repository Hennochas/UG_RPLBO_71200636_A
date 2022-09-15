package com.ug3.soal1;

import java.util.Scanner;

public class UG3soal1 {
    public static void main(String[] args){
        System.out.println("Masukkan Data Product Makanan Anda");
        String makanan,tanggal;
        float jumlah,berat;
        Scanner b = new Scanner(System.in);
        System.out.println("Nama Makanan"); makanan = b.nextLine();
        System.out.println("Tanggal Kadaluarsa"); tanggal = b.nextLine();
        System.out.println("Jumlah (quantity)"); jumlah = b.nextFloat();
        System.out.println("Berat (Gram)"); berat = b.nextFloat();
        System.out.println("========================Data Product==================");
        System.out.print("Nama makanan= ");
        System.out.println(makanan);
        System.out.print("Tanggal Kadaluarsa= ");
        System.out.println(tanggal);
        System.out.print("Jumlah Quantity= ");
        System.out.println(jumlah);
        System.out.print("Berat = ");
        System.out.println(berat);
        System.out.println("=======================================================");

    }
}