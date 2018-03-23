package com.fainin.sdk;

import com.fainin.sdk.response.UsersDataResponse;

public class TestUsage {

    public static void main(String args[]) {

        OST ost = OSTClientBuilder.defaultClient();

        UsersDataResponse usersDataResponse = ost.createUser("Hisham naser");

        System.out.println(usersDataResponse);
    }
}
