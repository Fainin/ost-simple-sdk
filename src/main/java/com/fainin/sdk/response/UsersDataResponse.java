package com.fainin.sdk.response;

import com.fainin.sdk.response.data.UsersData;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * Created by hishamaborob on 23-Mar-18.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class UsersDataResponse extends ApiResponse implements OSTApiResponse {

    private UsersData data;

    public UsersData getData() {
        return data;
    }

    public void setData(UsersData data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "UsersDataResponse{" +
                "success=" + getSuccess() +
                ", err=" + getErr() +
                ", data=" + data +
                '}';
    }
}
