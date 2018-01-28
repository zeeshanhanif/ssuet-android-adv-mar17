package httprequestdemoone.springbootandroidapp;

public class ResponseModel {
    private String message;
    private boolean error;
    private Object data;

    public ResponseModel() {
    }

    public ResponseModel(String message, boolean error) {
        this.message = message;
        this.error = error;
    }

    public ResponseModel(String message, boolean error, Object data) {
        this.message = message;
        this.error = error;
        this.data = data;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public boolean isError() {
        return error;
    }

    public void setError(boolean error) {
        this.error = error;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
