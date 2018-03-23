package com.fainin.sdk.constant;

/**
 * Created by hishamaborob on 23-Mar-18.
 */
public enum TransactionTypeKind {

    USER_TO_USER("user_to_user"),
    USER_TO_COMPANY("user_to_company"),
    COMPANY_TO_USER("company_to_user");

    private final String kind;

    TransactionTypeKind(String kind) {
        this.kind = kind;
    }

    public String value() {
        return kind;
    }
}
