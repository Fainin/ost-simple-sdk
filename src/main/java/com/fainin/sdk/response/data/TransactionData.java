package com.fainin.sdk.response.data;

import com.fainin.sdk.response.entity.Transaction;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;

/**
 * Created by hishamaborob on 23-Mar-18.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class TransactionData {

    private String resultType;
    private Transaction transaction;
    private List<Transaction> transactions;

    public String getResultType() {
        return resultType;
    }

    public void setResultType(String resultType) {
        this.resultType = resultType;
    }

    public Transaction getTransaction() {
        return transaction;
    }

    public void setTransaction(Transaction transaction) {
        this.transaction = transaction;
    }

    public List<Transaction> getTransactions() {
        return transactions;
    }

    public void setTransactions(List<Transaction> transactions) {
        this.transactions = transactions;
    }

    @Override
    public String toString() {
        return "TransactionData{" +
                "resultType='" + resultType + '\'' +
                ", transaction=" + transaction +
                ", transactions=" + transactions +
                '}';
    }
}
