package co.uk.dental.group.exception;

public class EquipmentServiceErrorResponse {

    private int status;
    private String message;
    private long timeStamp;

    public EquipmentServiceErrorResponse(){};

    public EquipmentServiceErrorResponse(final int status, final String message, final long timeStamp) {
        this.status = status;
        this.message = message;
        this.timeStamp = timeStamp;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public long getTimeStamp() {
        return timeStamp;
    }

    public void setTimeStamp(long timeStamp) {
        this.timeStamp = timeStamp;
    }
}
