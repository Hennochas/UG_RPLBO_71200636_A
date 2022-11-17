package login.com;

public class PasswordException extends Throwable {
    private int errCode;
    private String errMessage;

    public PasswordException(int errCode) {
        if (errCode == 1) {
            this.errMessage = "Maaf, password tidak boleh kosong!";
        }
        else if (errCode == 2) {
            this.errMessage = "Maaf, password minimal terdiri dari 7 karakter";
        }
        else if (errCode == 3) {
            this.errMessage = "Maaf, password tidak boleh sama dengan username!";
        }
        else if (errCode == 4) {
            this.errMessage = "Maaf, password harus mengandung huruf besar, huruf kecil, simbol, dan angka!";
        }
        else if (errCode == 5) {
            this.errMessage = "Maaf, password harus sama!";
        }
    }

    public PasswordException(String errMessage){
        super(errMessage);
    }

    public int getErrCode() {
        return this.errCode;
    }

    public String getErrMessage() {
        return this.errMessage;
    }
}
