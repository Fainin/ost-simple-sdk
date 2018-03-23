package com.fainin.sdk.response;

import com.fainin.sdk.response.data.TransactionsTypeData;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * Created by hishamaborob on 23-Mar-18.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class TransactionsTypeResponse extends ApiResponse implements OSTApiResponse {

    private TransactionsTypeData data;

    public TransactionsTypeData getData() {
        return data;
    }

    public void setData(TransactionsTypeData data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "TransactionsTypeResponse{" +
                "success=" + getSuccess() +
                ", err=" + getErr() +
                ", data=" + data +
                '}';
    }
}
