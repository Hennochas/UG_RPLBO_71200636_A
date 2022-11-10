package com.ug9.etransactionproject;

public class MobileWallet extends DigitalPayment {
    private String noHp;
    private long feeTransferBank;

    public MobileWallet(String nama, long saldo, String noHp) {
        super(nama, saldo);
        this.noHp = noHp;
    }

    public void setFeeTransferBank(long feeTransferBank) {
        this.feeTransferBank = feeTransferBank;
    }

    public String getNoHp() {
        return noHp;
    }

    @Override
    public void transfer(DigitalPayment dp, long nominal) {
        if (nominal < 0) {
            System.out.println("Nominal yang Anda input tidak valid");
        }
        else if (this.getSaldo() < nominal) {
            System.out.println("Transfer gagal! Saldo Anda tidak mencukupi.");
        }
        else if (this.getSaldo() >= nominal) {
            if (dp instanceof BNImo || dp instanceof BRImo) {
                long totalTf = nominal + this.feeTransferBank;
                this.setSaldo(this.getSaldo() - totalTf);
                dp.setSaldo(dp.getSaldo() + nominal);
                printBuktiTransfer(dp, nominal);
            }
            else {
                this.setSaldo(this.getSaldo() - nominal);
                dp.setSaldo(dp.getSaldo() + nominal);
                printBuktiTransfer(dp, nominal);
            }
        }
    }
}
