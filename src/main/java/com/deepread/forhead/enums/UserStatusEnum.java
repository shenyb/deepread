package com.deepread.forhead.enums;

/**
 * @version : v2.0
 * @Written by :shenyb
 * @Creation Date : ${date} ${time}
 * @Description :
 */
public enum UserStatusEnum {
    LOCKED(1,"锁定"),NORMAL(0,"正常");
    private int type;
    private String desc;
    UserStatusEnum(int type,String desc){
        this.type=type;
        this.desc=desc;
    }

    public int getType() {
        return type;
    }

    public String getDesc() {
        return desc;
    }
}
