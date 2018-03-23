package com.fainin.sdk.response.data;

import com.fainin.sdk.response.entity.EconomyUser;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;

/**
 * Created by hishamaborob on 23-Mar-18.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class UsersData {

    private String resultType;
    private List<EconomyUser> economyUsers;

    public String getResultType() {
        return resultType;
    }

    public void setResultType(String resultType) {
        this.resultType = resultType;
    }

    public List<EconomyUser> getEconomyUsers() {
        return economyUsers;
    }

    public void setEconomyUsers(List<EconomyUser> economyUsers) {
        this.economyUsers = economyUsers;
    }

    @Override
    public String toString() {
        return "UsersData{" +
                "resultType='" + resultType + '\'' +
                ", economyUsers=" + economyUsers +
                '}';
    }
}
