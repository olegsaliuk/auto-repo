package api.helpers.enums;

import org.apache.http.HttpStatus;

public enum StatusCode {
    SUCCESS(HttpStatus.SC_OK);

    private int status;

    StatusCode(int status) {
        this.status = status;
    }

    public int getStatus() {
        return status;
    }
}
