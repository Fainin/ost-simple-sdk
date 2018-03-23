package com.fainin.sdk.response;

import com.fainin.sdk.response.data.AirdropDate;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * Created by hishamaborob on 23-Mar-18.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class AirdropDateResponse extends ApiResponse implements OSTApiResponse {

    private AirdropDate data;

    public AirdropDate getData() {
        return data;
    }

    public void setData(AirdropDate data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "AirdropDateResponse{" +
                "success=" + getSuccess() +
                ", err=" + getErr() +
                ", data=" + data +
                '}';
    }
}
