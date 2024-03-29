package com.ug9.etransactionproject;

public class Ovo extends MobileWallet {
    private long ovoFeeTransferBank = 2000;

    public Ovo(String nama, long saldo, String noHp) {
        super(nama, saldo, noHp);
    }


    @Override
    public void transfer(DigitalPayment dp, long nominal)  {
        if (nominal < 0) {
            System.out.println("Nominal yang Anda input tidak valid!");
        }
        else if (this.getSaldo() < nominal) {
            System.out.println("Transfer gagal! Saldo Anda tidak mencukupi.");
        }
        else if (dp instanceof Dana) {
            System.out.println("Akun Ovo tidak valid!");
        }
        else if (dp instanceof BNImo || dp instanceof BRImo) {
            super.setFeeTransferBank(this.ovoFeeTransferBank);
            super.transfer(dp, nominal);
        }
        else {
            super.transfer(dp, nominal);
        }
    }
}
