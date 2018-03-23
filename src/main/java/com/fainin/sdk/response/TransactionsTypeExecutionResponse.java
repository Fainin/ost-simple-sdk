package com.fainin.sdk.response;

import com.fainin.sdk.response.data.TransactionTypeExecutionData;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * Created by hishamaborob on 23-Mar-18.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class TransactionsTypeExecutionResponse extends ApiResponse implements OSTApiResponse {

    private TransactionTypeExecutionData data;

    public TransactionTypeExecutionData getData() {
        return data;
    }

    public void setData(TransactionTypeExecutionData data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "TransactionsTypeExecutionResponse{" +
                "success=" + getSuccess() +
                ", err=" + getErr() +
                ", data=" + data +
                '}';
    }
}
