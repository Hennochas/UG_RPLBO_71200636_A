package login.com;

public class LoginException extends Throwable {
    private int errCode;
    private String errMessage;

    public LoginException(int errCode) {
        if (errCode == 1) {
            this.errMessage = "Maaf, username atau password tidak boleh kosong!";
        }
        else if (errCode == 2) {
            this.errMessage = "Maaf, username atau password salah! Silahkan coba lagi!";
        }
    }

    public LoginException(String errMessage){
        super(errMessage);
    }

    public int getErrCode() {
        return this.errCode;
    }

    public String getErrMessage() {
        return this.errMessage;
    }
}
