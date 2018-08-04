package com.fainin.sdk.response.data;

import com.fainin.sdk.response.entity.Balance;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * Created by hishamaborob on 04-Aug-18.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class BalanceData {

    private String resultType;
    private Balance balance;

    public String getResultType() {
        return resultType;
    }

    public void setResultType(String resultType) {
        this.resultType = resultType;
    }

    public Balance getBalance() {
        return balance;
    }

    public void setBalance(Balance balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "BalanceData{" +
                "resultType='" + resultType + '\'' +
                ", balance=" + balance +
                '}';
    }
}
