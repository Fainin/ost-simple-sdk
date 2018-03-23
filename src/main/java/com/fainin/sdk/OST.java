package com.fainin.sdk;

import com.fainin.sdk.constant.CurrencyType;
import com.fainin.sdk.constant.TransactionTypeKind;
import com.fainin.sdk.response.AirdropDateResponse;
import com.fainin.sdk.response.TransactionsTypeExecutionResponse;
import com.fainin.sdk.response.UsersDataResponse;
import com.fainin.sdk.constant.AirdropListType;
import com.fainin.sdk.response.TransactionsTypeResponse;

/**
 * Created by hishamaborob on 23-Mar-18.
 */
public interface OST {

    public UsersDataResponse createUser(final String name);

    public UsersDataResponse editUser(final String uuid, final String name);

    public UsersDataResponse listUsers(final int pageNo);

    public AirdropDateResponse airdrop(final double amount, final AirdropListType airdropListType);

    public AirdropDateResponse airdropStatus(final String airdropUuid);

    public TransactionsTypeResponse createTransactionType(
            final String name, final TransactionTypeKind transactionTypeKind, final CurrencyType currencyType,
            final long currencyValue, final float commissionPercent);

    public TransactionsTypeResponse editTransactionType(
            final long clientTransactionId, final String name, final TransactionTypeKind transactionTypeKind,
            final CurrencyType currencyType, final long currencyValue, final float commissionPercent);

    public TransactionsTypeResponse listTransactionTypes();

    public TransactionsTypeExecutionResponse executeTransactionType(
            final String fromUuid, final String toUuid, final String transactionKindName);

    public TransactionsTypeExecutionResponse executeTransactionTypeCompanyToUser(
            final String userUuid, final String transactionKindName);

    public TransactionsTypeExecutionResponse executeTransactionTypeUserToCompany(
            final String userUuid, final String transactionKindName);
}
