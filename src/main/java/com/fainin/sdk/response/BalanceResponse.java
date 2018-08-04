package com.fainin.sdk.response;

import com.fainin.sdk.response.data.BalanceData;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * Created by hishamaborob on 04-Aug-18.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class BalanceResponse extends ApiResponse implements OSTApiResponse {

    private BalanceData data;

    public BalanceData getData() {
        return data;
    }

    public void setData(BalanceData data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "BalanceResponse{" +
                "data=" + data +
                '}';
    }
}
