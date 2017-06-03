package com.deepread.forhead.enums;

/**
 * @version : v2.0
 * @Written by :shenyb
 * @Creation Date : ${date} ${time}
 * @Description :
 */
public enum UserStatusEnum {
    LOCKED("LOCKED","锁定"),NORMAL("NORMAL","正常");
    private String type;
    private String desc;
    UserStatusEnum(String type,String desc){
        this.type=type;
        this.desc=desc;
    }

    public String getType() {
        return type;
    }

    public String getDesc() {
        return desc;
    }
}
