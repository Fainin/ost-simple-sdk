package com.fainin.sdk.constant;

/**
 * Created by hishamaborob on 23-Mar-18.
 */
public enum CurrencyType {

    USD("USD"),
    BT("BT");

    private final String type;

    CurrencyType(String type) {
        this.type = type;
    }

    public String value() {
        return type;
    }
}
