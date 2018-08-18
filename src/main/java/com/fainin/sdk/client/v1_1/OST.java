package com.fainin.sdk.client.v1_1;

import com.fainin.sdk.client.v1_1.response.BalanceResponse;
import com.fainin.sdk.client.v1_1.response.TransactionResponse;
import com.fainin.sdk.client.v1_1.response.UsersDataResponse;

/**
 * Created by hishamaborob on 23-Mar-18.
 */
public interface OST {

    public String companyId();

    /**
     *
     * @param name
     * @return
     */
    public UsersDataResponse createUser(final String name);

    /**
     *
     * @param id
     * @param name
     * @return
     */
    public UsersDataResponse updateUser(final String id, final String name);

    /**
     *
     * @param id
     * @return
     */
    public UsersDataResponse retrieveUser(final String id);

    /**
     *
     * @param pageNo
     * @return
     */
    public UsersDataResponse listUsers(final int pageNo);

    /**
     *
     * @param fromId
     * @param toId
     * @param actionId
     * @return
     */
    public TransactionResponse executeTransaction(
            final String fromId, final String toId, final Long actionId);

    /**
     *
     * @param userId
     * @param actionId
     * @return
     */
    public TransactionResponse executeTransactionCompanyToUser(
            final String userId, final Long actionId);

    /**
     *
     * @param userId
     * @param actionId
     * @return
     */
    public TransactionResponse executeTransactionUserToCompany(
            final String userId, final Long actionId);

    /**
     *
     * @param id
     * @return
     */
    public TransactionResponse retrieveTransaction(final String id);

    /**
     *
     * @param userId
     * @return
     */
    public BalanceResponse retrieveUserBalance(final String userId);

    /**
     *
     * @param userId
     * @param pageNo
     * @return
     */
    public TransactionResponse retrieveUserLedger(final String userId, final int pageNo);
}
