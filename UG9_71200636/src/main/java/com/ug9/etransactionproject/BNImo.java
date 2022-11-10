package com.ug9.etransactionproject;

public class BNImo extends MobileBanking {
    public BNImo(String nama, long saldo, String noRekening) {
        super(nama, saldo, noRekening);
    }

    @Override
    public void transfer(DigitalPayment dp, long nominal) {
        if (nominal < 0) {
            System.out.println("Nominal yang Anda input tidak valid!");
        }
        else if (this.getSaldo() < nominal) {
            System.out.println("Transfer gagal! Saldo Anda tidak mencukupi.");
        }
        else if (dp instanceof  BRImo) {
            super.setCheckFee(true);
            super.transfer(dp, nominal);
        }
        else {
            super.transfer(dp, nominal);
        }
    }
}