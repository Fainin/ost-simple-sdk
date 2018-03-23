package com.fainin.sdk.response.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * Created by hishamaborob on 23-Mar-18.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class TransactionType {

    private Long id;
    private Long clientId;
    private Long clientTransactionId;
    private String name;
    private String kind;
    private String currencyType;
    private Double currencyValue;
    private Float commissionPercent;
    private String status;
    private Long uts;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getClientId() {
        return clientId;
    }

    public void setClientId(Long clientId) {
        this.clientId = clientId;
    }

    public Long getClientTransactionId() {
        return clientTransactionId;
    }

    public void setClientTransactionId(Long clientTransactionId) {
        this.clientTransactionId = clientTransactionId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    public String getCurrencyType() {
        return currencyType;
    }

    public void setCurrencyType(String currencyType) {
        this.currencyType = currencyType;
    }

    public Double getCurrencyValue() {
        return currencyValue;
    }

    public void setCurrencyValue(Double currencyValue) {
        this.currencyValue = currencyValue;
    }

    public Float getCommissionPercent() {
        return commissionPercent;
    }

    public void setCommissionPercent(Float commissionPercent) {
        this.commissionPercent = commissionPercent;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Long getUts() {
        return uts;
    }

    public void setUts(Long uts) {
        this.uts = uts;
    }

    @Override
    public String toString() {
        return "TransactionType{" +
                "id=" + id +
                ", clientId=" + clientId +
                ", clientTransactionId=" + clientTransactionId +
                ", name='" + name + '\'' +
                ", kind='" + kind + '\'' +
                ", currencyType='" + currencyType + '\'' +
                ", currencyValue=" + currencyValue +
                ", commissionPercent=" + commissionPercent +
                ", status='" + status + '\'' +
                ", uts=" + uts +
                '}';
    }
}
