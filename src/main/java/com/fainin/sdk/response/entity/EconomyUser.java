package com.fainin.sdk.response.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * Created by hishamaborob on 23-Mar-18.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class EconomyUser {

    private String uuid;
    private String name;
    private Long totalAirdroppedTokens;
    private Long tokenBalance;

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

    public Long getTotalAirdroppedTokens() {
        return totalAirdroppedTokens;
    }

    public void setTotalAirdroppedTokens(Long totalAirdroppedTokens) {
        this.totalAirdroppedTokens = totalAirdroppedTokens;
    }

    public Long getTokenBalance() {
        return tokenBalance;
    }

    public void setTokenBalance(Long tokenBalance) {
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
