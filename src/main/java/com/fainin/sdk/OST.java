package com.fainin.sdk;

import com.fainin.sdk.response.BalanceResponse;
import com.fainin.sdk.response.TransactionResponse;
import com.fainin.sdk.response.UsersDataResponse;

/**
 * Created by hishamaborob on 23-Mar-18.
 */
public interface OST {

    public UsersDataResponse createUser(final String name);

    public UsersDataResponse updateUser(final String id, final String name);

    public UsersDataResponse retrieveUser(final String id);

    public UsersDataResponse listUsers(final int pageNo);

    public TransactionResponse executeTransaction(
            final String fromId, final String toId, final Long actionId);

    public TransactionResponse executeTransactionCompanyToUser(
            final String userId, final Long actionId);

    public TransactionResponse executeTransactionUserToCompany(
            final String userId, final Long actionId);

    public TransactionResponse retrieveTransaction(final String id);

    public BalanceResponse retrieveUserBalance(final String userId);

    public TransactionResponse retrieveUserLedger(final String userId, final int pageNo);
}
