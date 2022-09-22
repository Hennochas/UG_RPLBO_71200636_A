package com.ug4.soal1;

    public class Passenger {
        String name;
        double balance;
        String email;
        String destiny;

        public Passenger(String name, String email, double balance){
            name = name;
            email = email;
            balance = balance;
        }

        public String getName() {
            return name;
        }
    }
