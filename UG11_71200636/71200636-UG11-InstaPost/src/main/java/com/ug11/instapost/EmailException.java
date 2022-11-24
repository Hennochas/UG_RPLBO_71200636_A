package com.ug11.instapost;

public class EmailException extends Throwable {
    private String errorMessage;
    private int errorCode;

    public EmailException(int errCode) {
        this.errorCode = errCode;
        if (this.errorCode == 1) {
            this.errorMessage = "Error: Login gagal! Email yang Anda masukkan tidak valid.";
        }
        else if (this.errorCode == 2) {
            this.errorMessage = "Error: Login gagal! Email Anda tidak terdaftar di Google.";
        }
    }

    public String getErrorMessage() {
        return this.errorMessage;
    }
}
