package com.fainin.sdk.response.data;

import com.fainin.sdk.response.entity.TransactionType;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;

/**
 * Created by hishamaborob on 23-Mar-18.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class TransactionsTypeData {

    private String resultType;
    private Long clientId;
    private List<TransactionType> transactions;
    private List<TransactionType> transactionTypes;

    public String getResultType() {
        return resultType;
    }

    public void setResultType(String resultType) {
        this.resultType = resultType;
    }

    public Long getClientId() {
        return clientId;
    }

    public void setClientId(Long clientId) {
        this.clientId = clientId;
    }

    public List<TransactionType> getTransactions() {
        return transactions;
    }

    public void setTransactions(List<TransactionType> transactions) {
        this.transactions = transactions;
    }

    public List<TransactionType> getTransactionTypes() {
        return transactionTypes;
    }

    public void setTransactionTypes(List<TransactionType> transactionTypes) {
        this.transactionTypes = transactionTypes;
    }

    @Override
    public String toString() {
        return "TransactionsTypeData{" +
                "resultType='" + resultType + '\'' +
                ", clientId=" + clientId +
                ", transactions=" + transactions +
                ", transactionTypes=" + transactionTypes +
                '}';
    }
}
