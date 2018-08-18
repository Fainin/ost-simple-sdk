package com.fainin.sdk.client.v1_1;

import com.fainin.sdk.auth.AuthenticationProvider;
import com.fainin.sdk.client.OSTClientBase;
import com.fainin.sdk.http.OSTHttpClient;
import com.fainin.sdk.config.OSTConfiguration;
import com.fainin.sdk.client.v1_1.response.BalanceResponse;
import com.fainin.sdk.client.v1_1.response.TransactionResponse;
import com.fainin.sdk.client.v1_1.response.UsersDataResponse;

import java.util.TreeMap;

import static com.fainin.sdk.client.v1_1.constant.Endpoints.*;

public class OSTClient extends OSTClientBase implements OST {

    /**
     *
     * @param ostHttpClient
     * @param authenticationProvider
     * @param ostConfiguration
     */
    public OSTClient(OSTHttpClient ostHttpClient, AuthenticationProvider authenticationProvider,
                     OSTConfiguration ostConfiguration) {

        super(ostHttpClient, authenticationProvider, ostConfiguration);
    }

    /**
     *
     * @return
     */
    @Override
    public String companyId() {

        return getOstConfiguration().getUuid();
    }

    /**
     *
     * @param name
     * @return
     */
    @Override
    public UsersDataResponse createUser(final String name) {

        TreeMap<String, String> params = new TreeMap<>();
        params.put("name", name);
        return signAndExecutePostRequest(USERS_CREATE_ENDPOINT, params, UsersDataResponse.class);
    }

    /**
     *
     * @param id
     * @param name
     * @return
     */
    @Override
    public UsersDataResponse updateUser(final String id, final String name) {

        TreeMap<String, String> params = new TreeMap<>();
        params.put("name", name);
        params.put("id", id);
        return signAndExecutePostRequest(
                USERS_EDIT_ENDPOINT.replace("{id}", id), params, UsersDataResponse.class);
    }

    /**
     *
     * @param id
     * @return
     */
    @Override
    public UsersDataResponse retrieveUser(String id) {

        TreeMap<String, String> params = new TreeMap<>();
        params.put("id", id);
        return signAndExecuteGetRequest(
                USERS_RETRIEVE_ENDPOINT.replace("{id}", id), params, UsersDataResponse.class);
    }

    /**
     *
     * @param pageNo
     * @return
     */
    @Override
    public UsersDataResponse listUsers(final int pageNo) {

        TreeMap<String, String> params = new TreeMap<>();
        params.put("page_no", Integer.toString(pageNo));
        return signAndExecuteGetRequest(USERS_LIST_ENDPOINT, params, UsersDataResponse.class);
    }

    /**
     *
     * @param fromId
     * @param toId
     * @param actionId
     * @return
     */
    @Override
    public TransactionResponse executeTransaction(
            final String fromId, final String toId, final Long actionId) {

        TreeMap<String, String> params = new TreeMap<>();
        params.put("from_user_id", fromId);
        params.put("to_user_id", toId);
        params.put("action_id", actionId.toString());
        return signAndExecutePostRequest(TRANSACTION_EXECUTE_ENDPOINT, params,
                TransactionResponse.class);
    }

    /**
     *
     * @param userUuid
     * @param actionId
     * @return
     */
    @Override
    public TransactionResponse executeTransactionCompanyToUser(
            String userUuid, final Long actionId) {

        return executeTransaction(companyId(), userUuid, actionId);
    }

    /**
     *
     * @param userUuid
     * @param actionId
     * @return
     */
    @Override
    public TransactionResponse executeTransactionUserToCompany(
            String userUuid, final Long actionId) {

        return executeTransaction(userUuid, companyId(), actionId);
    }

    /**
     *
     * @param id
     * @return
     */
    @Override
    public TransactionResponse retrieveTransaction(String id) {

        TreeMap<String, String> params = new TreeMap<>();
        params.put("id", id);
        return signAndExecuteGetRequest(
                TRANSACTION_RETRIEVE_ENDPOINT.replace("{id}", id), params, TransactionResponse.class);
    }

    /**
     *
     * @param userId
     * @return
     */
    @Override
    public BalanceResponse retrieveUserBalance(String userId) {

        TreeMap<String, String> params = new TreeMap<>();
        params.put("user_id", userId);
        return signAndExecuteGetRequest(
                BALANCE_RETRIEVE_ENDPOINT.replace("{user_id}", userId), params, BalanceResponse.class);
    }

    /**
     *
     * @param userId
     * @param pageNo
     * @return
     */
    @Override
    public TransactionResponse retrieveUserLedger(String userId, int pageNo) {

        TreeMap<String, String> params = new TreeMap<>();
        params.put("user_id", userId);
        params.put("page_no", Integer.toString(pageNo));
        return signAndExecuteGetRequest(
                LEDGER_RETRIEVE_ENDPOINT.replace("{user_id}", userId), params, TransactionResponse.class);
    }


}
