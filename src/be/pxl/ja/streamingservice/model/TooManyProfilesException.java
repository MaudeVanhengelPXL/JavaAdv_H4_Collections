package be.pxl.ja.streamingservice.model;

public class TooManyProfilesException extends RuntimeException {

    public TooManyProfilesException(String message) {
        super(message);
    }
}
