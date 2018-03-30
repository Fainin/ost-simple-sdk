package com.fainin.sdk.response.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * Created by hishamaborob on 23-Mar-18.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class EconomyUser {

    private String uuid;
    private String name;
    private String totalAirdroppedTokens;
    private String tokenBalance;

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTotalAirdroppedTokens() {
        return totalAirdroppedTokens;
    }

    public void setTotalAirdroppedTokens(String totalAirdroppedTokens) {
        this.totalAirdroppedTokens = totalAirdroppedTokens;
    }

    public String getTokenBalance() {
        return tokenBalance;
    }

    public void setTokenBalance(String tokenBalance) {
        this.tokenBalance = tokenBalance;
    }

    @Override
    public String toString() {
        return "EconomyUser{" +
                "uuid='" + uuid + '\'' +
                ", name='" + name + '\'' +
                ", totalAirdroppedTokens=" + totalAirdroppedTokens +
                ", tokenBalance=" + tokenBalance +
                '}';
    }
}
