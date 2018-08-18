package com.fainin.sdk.client.v1_1.response.data;

import com.fainin.sdk.client.v1_1.response.entity.EconomyUser;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;

/**
 * Created by hishamaborob on 23-Mar-18.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class UsersData {

    private String resultType;
    private EconomyUser user;

    private List<EconomyUser> users;

    public String getResultType() {
        return resultType;
    }

    public void setResultType(String resultType) {
        this.resultType = resultType;
    }

    public EconomyUser getUser() {
        return user;
    }

    public void setUser(EconomyUser user) {
        this.user = user;
    }

    public List<EconomyUser> getUsers() {
        return users;
    }

    public void setUsers(List<EconomyUser> users) {
        this.users = users;
    }

    @Override
    public String toString() {
        return "UsersData{" +
                "resultType='" + resultType + '\'' +
                ", user=" + user +
                ", users=" + users +
                '}';
    }
}
