package com.ug11.kalkulasirupiah;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Masukkan teks: ");
        String teks = scan.nextLine();

        StringBuilder rincian = new StringBuilder();
        String[] arr = teks.split(" ");
        int total = 0;

        for (String s : arr) {
            if (s.startsWith("Rp")) {
                if (rincian.isEmpty()) {
                    rincian.append(s);
                } else {
                    rincian.append(" + ").append(s);
                }
                String m = s.replaceAll(",00","");
                total += Integer.parseInt(m.replaceAll("[^0-9]",""));
            }
        }


        System.out.println("Rincian Biaya: " + rincian);
        System.out.println("Total: " + total);

    }

}