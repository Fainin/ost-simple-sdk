package com.fainin.sdk;

import com.fainin.sdk.auth.AuthenticationProvider;
import com.fainin.sdk.client.OSTHttpClient;
import com.fainin.sdk.config.OSTConfiguration;
import com.fainin.sdk.constant.CurrencyType;
import com.fainin.sdk.constant.TransactionTypeKind;
import com.fainin.sdk.constant.AirdropListType;
import com.fainin.sdk.response.AirdropDateResponse;
import com.fainin.sdk.response.TransactionsTypeExecutionResponse;
import com.fainin.sdk.response.UsersDataResponse;
import com.fainin.sdk.response.TransactionsTypeResponse;

import java.util.TreeMap;

import static com.fainin.sdk.constant.Endpoints.*;

public class OSTClient extends OSTClientBase implements OST {

    public OSTClient(OSTHttpClient ostHttpClient, AuthenticationProvider authenticationProvider,
                     OSTConfiguration ostConfiguration) {

        super(ostHttpClient, authenticationProvider, ostConfiguration);
    }

    @Override
    public UsersDataResponse createUser(final String name) {

        TreeMap<String, String> params = new TreeMap<>();
        params.put("name", name);
        return signAndExecutePostRequest(USERS_CREATE_ENDPOINT, params, UsersDataResponse.class);
    }

    @Override
    public UsersDataResponse editUser(final String uuid, final String name) {

        TreeMap<String, String> params = new TreeMap<>();
        params.put("name", name);
        params.put("uuid", uuid);
        return signAndExecutePostRequest(USERS_EDIT_ENDPOINT, params, UsersDataResponse.class);
    }

    @Override
    public UsersDataResponse listUsers(final int pageNo) {

        TreeMap<String, String> params = new TreeMap<>();
        params.put("page_no", Integer.toString(pageNo));
        return signAndExecuteGetRequest(USERS_LIST_ENDPOINT, params, UsersDataResponse.class);
    }

    @Override
    public AirdropDateResponse airdrop(final double amount, final AirdropListType airdropListType) {

        TreeMap<String, String> params = new TreeMap<>();
        params.put("amount", Double.toString(amount));
        params.put("list_type", airdropListType.value());
        return signAndExecutePostRequest(AIRDROP_ENDPOINT, params, AirdropDateResponse.class);
    }

    @Override
    public AirdropDateResponse airdropStatus(final String airdropUuid) {

        TreeMap<String, String> params = new TreeMap<>();
        params.put("airdrop_uuid", airdropUuid);
        return signAndExecuteGetRequest(AIRDROP_STATUS_ENDPOINT, params, AirdropDateResponse.class);
    }

    @Override
    public TransactionsTypeResponse createTransactionType(
            final String name, final TransactionTypeKind transactionTypeKind,
            final CurrencyType currencyType, final long currencyValue, final float commissionPercent) {

        TreeMap<String, String> params = new TreeMap<>();
        params.put("name", name);
        params.put("kind", transactionTypeKind.value());
        params.put("currency_type", currencyType.value());
        params.put("currency_value", Long.toString(currencyValue));
        params.put("commission_percent", Float.toString(commissionPercent));
        return signAndExecutePostRequest(TRANSACTION_TYPE_CREATE_ENDPOINT, params, TransactionsTypeResponse.class);
    }

    @Override
    public TransactionsTypeResponse editTransactionType(
            final long clientTransactionId, final String name, final TransactionTypeKind transactionTypeKind,
            final CurrencyType currencyType, final long currencyValue, final float commissionPercent) {

        TreeMap<String, String> params = new TreeMap<>();
        params.put("client_transaction_id", Long.toString(clientTransactionId));
        params.put("name", name);
        params.put("kind", transactionTypeKind.value());
        params.put("currency_type", currencyType.value());
        params.put("currency_value", Long.toString(currencyValue));
        params.put("commission_percent", Float.toString(commissionPercent));
        return signAndExecutePostRequest(TRANSACTION_TYPE_EDIT_ENDPOINT, params, TransactionsTypeResponse.class);
    }

    @Override
    public TransactionsTypeResponse listTransactionTypes() {

        return signAndExecuteGetRequest(TRANSACTION_TYPE_LIST_ENDPOINT,
                new TreeMap<>(), TransactionsTypeResponse.class);
    }

    public TransactionsTypeExecutionResponse executeTransactionType(
            final String fromUuid, final String toUuid, final String transactionKindName) {

        TreeMap<String, String> params = new TreeMap<>();
        params.put("from_uuid", fromUuid);
        params.put("to_uuid", toUuid);
        params.put("transaction_kind", transactionKindName);
        return signAndExecutePostRequest(TRANSACTION_TYPE_EXECUTE_ENDPOINT, params,
                TransactionsTypeExecutionResponse.class);
    }

    @Override
    public TransactionsTypeExecutionResponse executeTransactionTypeCompanyToUser(
            String userUuid, String transactionKindName) {

        return executeTransactionType(getOstConfiguration().getUuid(), userUuid, transactionKindName);
    }

    @Override
    public TransactionsTypeExecutionResponse executeTransactionTypeUserToCompany(
            String userUuid, String transactionKindName) {

        return executeTransactionType(userUuid, getOstConfiguration().getUuid(), transactionKindName);
    }

}
