package com.shzhong.enums;

/**
 * Created by my on 17/4/8.
 */
public enum ResultEnum {
    UNNKONW_ERROR(-1, "未知错误"),
    SUCCESS(0, "成功"),
    PRIMARY_SCHOOL(100, "小学生"),
    MIDDLE_GIRL(101, "少女"),
    ;

    private Integer code;
    private String msg;

    ResultEnum(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public Integer getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }
}
