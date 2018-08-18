package com.fainin.sdk.client.v1_1.constant;

/**
 * Created by hishamaborob on 23-Mar-18.
 */
public class Endpoints {

    public static final String USERS_CREATE_ENDPOINT = "/users/";
    public static final String USERS_EDIT_ENDPOINT = "/users/{id}";
    public static final String USERS_RETRIEVE_ENDPOINT = "/users/{id}";
    public static final String USERS_LIST_ENDPOINT = "/users";
    public static final String TRANSACTION_EXECUTE_ENDPOINT = "/transactions";
    public static final String TRANSACTION_RETRIEVE_ENDPOINT = "/transactions/{id}";
    public static final String BALANCE_RETRIEVE_ENDPOINT = "/balances/{user_id}";
    public static final String LEDGER_RETRIEVE_ENDPOINT = "/ledger/{user_id}";
}
