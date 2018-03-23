package com.fainin.sdk.constant;

/**
 * Created by hishamaborob on 23-Mar-18.
 */
public enum AirdropListType {

    ALL("all"),
    NEVER_AIRDROPPED("never_airdropped");

    private final String listType;

    AirdropListType(String listType) {
        this.listType = listType;
    }

    public String value() {
        return listType;
    }
}
