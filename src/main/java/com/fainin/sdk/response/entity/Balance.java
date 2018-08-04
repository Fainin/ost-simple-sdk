package com.fainin.sdk.response.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * Created by hishamaborob on 04-Aug-18.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class Balance {

    private String availableBalance;
    private String airdroppedBalance;
    private String tokenBalance;

    public String getAvailableBalance() {
        return availableBalance;
    }

    public void setAvailableBalance(String availableBalance) {
        this.availableBalance = availableBalance;
    }

    public String getAirdroppedBalance() {
        return airdroppedBalance;
    }

    public void setAirdroppedBalance(String airdroppedBalance) {
        this.airdroppedBalance = airdroppedBalance;
    }

    public String getTokenBalance() {
        return tokenBalance;
    }

    public void setTokenBalance(String tokenBalance) {
        this.tokenBalance = tokenBalance;
    }

    @Override
    public String toString() {
        return "Balance{" +
                "availableBalance='" + availableBalance + '\'' +
                ", airdroppedBalance='" + airdroppedBalance + '\'' +
                ", tokenBalance='" + tokenBalance + '\'' +
                '}';
    }
}
