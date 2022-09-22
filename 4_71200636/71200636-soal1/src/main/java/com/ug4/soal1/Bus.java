package com.ug4.soal1;

import java.util.ArrayList;

public class Bus {
    String name;
    Driver driver;
    Integer Capacity;
    Integer usedCapacity;
    double profit;
    String Route;
    final double fares = 0;
    //final ArrayList <Passenger>;

    public Driver getDriver() {
        return driver;
    }

    public Bus(String name, String driver) {
        name = name;
        driver = driver;
    }

    public String[] getRoute() {
        return new String[]{Route};
    }

    public double getProfit() {
        return 0;
    }

    public int getUsedCapacity() {
        return 0;
    }

    public void dropPassengers(String s, Passenger passenger) {
    }
}
