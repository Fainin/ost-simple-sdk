package com.fainin.sdk.response.data;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * Created by hishamaborob on 23-Mar-18.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class TransactionTypeExecutionData {

    private String transactionUuid;
    private String transactionHash;
    private String fromUuid;
    private String toUuid;
    private String transactionKind;

    public String getTransactionUuid() {
        return transactionUuid;
    }

    public void setTransactionUuid(String transactionUuid) {
        this.transactionUuid = transactionUuid;
    }

    public String getTransactionHash() {
        return transactionHash;
    }

    public void setTransactionHash(String transactionHash) {
        this.transactionHash = transactionHash;
    }

    public String getFromUuid() {
        return fromUuid;
    }

    public void setFromUuid(String fromUuid) {
        this.fromUuid = fromUuid;
    }

    public String getToUuid() {
        return toUuid;
    }

    public void setToUuid(String toUuid) {
        this.toUuid = toUuid;
    }

    public String getTransactionKind() {
        return transactionKind;
    }

    public void setTransactionKind(String transactionKind) {
        this.transactionKind = transactionKind;
    }

    @Override
    public String toString() {
        return "TransactionTypeExecutionData{" +
                "transactionUuid='" + transactionUuid + '\'' +
                ", transactionHash='" + transactionHash + '\'' +
                ", fromUuid='" + fromUuid + '\'' +
                ", toUuid='" + toUuid + '\'' +
                ", transactionKind='" + transactionKind + '\'' +
                '}';
    }
}
