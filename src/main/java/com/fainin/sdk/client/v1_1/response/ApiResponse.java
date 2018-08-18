package com.fainin.sdk.client.v1_1.response;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * Created by hishamaborob on 23-Mar-18.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class ApiResponse {

    private Boolean success;
    private Err err;

    public Boolean getSuccess() {
        return success;
    }

    public void setSuccess(Boolean success) {
        this.success = success;
    }

    public Err getErr() {
        return err;
    }

    public void setErr(Err err) {
        this.err = err;
    }
}
