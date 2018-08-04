package com.fainin.sdk;

import com.fainin.sdk.response.BalanceResponse;
import com.fainin.sdk.response.TransactionResponse;
import com.fainin.sdk.response.UsersDataResponse;

public class TestUsage {

    public static void main(String args[]) {

        OST ost = OSTClientBuilder.defaultClient();

        /*UsersDataResponse usersDataResponse1 = ost.createUser("Hisham xxx");
        UsersDataResponse usersDataResponse2 =
                ost.updateUser(usersDataResponse1.getData().getUser().getId(), "Hisham testx");
        UsersDataResponse usersDataResponse3 = ost.retrieveUser(usersDataResponse2.getData().getUser().getId());
        UsersDataResponse usersDataResponse4 = ost.listUsers(1);

        BalanceResponse balanceResponse = ost.retrieveUserBalance(
                usersDataResponse4.getData().getUsers().get(4).getId());

        TransactionResponse ledgerResponse = ost.retrieveUserLedger(
                usersDataResponse4.getData().getUsers().get(4).getId(), 1);*/

        UsersDataResponse usersDataResponse4 = ost.listUsers(1);
        TransactionResponse ledgerResponse = ost.retrieveUserLedger(
                usersDataResponse4.getData().getUsers().get(4).getId(), 1);

        /*TransactionResponse transactionsExecutionResponse = ost.executeTransaction(
                usersDataResponse4.getData().getUsers().get(3).getId(),
                usersDataResponse4.getData().getUsers().get(4).getId(), 39728l
        );*/

        /*TransactionResponse transactionResponse = ost.retrieveTransaction(
                transactionsExecutionResponse.getData().getTransaction().getId());*/

        //System.out.println(usersDataResponse1);
        //System.out.println(usersDataResponse2);
        //System.out.println(usersDataResponse3);
        System.out.println(usersDataResponse4);
        //System.out.println(balanceResponse);
        System.out.println(ledgerResponse);
        //System.out.println(transactionsExecutionResponse);
        //System.out.println(transactionResponse);
    }
}
