package login.com;

public class EmailException extends Throwable {
    private int errCode;
    private String errMessage;

    public EmailException(int errCode) {
        if (errCode == 1) {
            this.errMessage = "Maaf, email tidak boleh kosong!";
        }
        else if (errCode == 2) {
            this.errMessage = "Maaf, email tidak valid!";
        }
    }

    public EmailException(String errMessage){
        super(errMessage);
    }

    public int getErrCode() {
        return this.errCode;
    }

    public String getErrMessage() {
        return this.errMessage;
    }
}
