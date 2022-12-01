package com.ug12.projectkassa;

public class Kasir {
    private String nama;
    private String username;
    private String password;
    private long totalPenjualan;

    public Kasir(String nama, String username, String password) {
        this.nama = nama;
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getNama() {
        return nama;
    }

    public long getTotalPenjualan() {
        return totalPenjualan;
    }

    public void setTotalPenjualan(long totalPenjualan) {
        this.totalPenjualan = totalPenjualan;
    }
}
