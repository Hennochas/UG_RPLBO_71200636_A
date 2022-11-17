package login.com;

public class UsernameException extends Throwable {
    private int errCode;
    private String errMessage;

    public UsernameException(int errCode) {
        if (errCode == 1) {
            this.errMessage = "Maaf, username tidak boleh kosong!";
        }
        else if (errCode == 2) {
            this.errMessage = "Maaf, username minimal harus terdiri dari 6 karakter!";
        }
    }

    public UsernameException(String errMessage){
        super(errMessage);
    }

    public int getErrCode() {
        return this.errCode;
    }

    public String getErrMessage() {
        return this.errMessage;
    }
}
