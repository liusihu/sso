package com.lsh.gateway.ssoclient.enums;

/**
 * 授权方式
 *
 */
public enum GrantTypeEnum {
    //授权码模式
    AUTHORIZATION_CODE("authorization_code");

    private String type;

    GrantTypeEnum(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }
}
