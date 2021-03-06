package com.shzhong.exception;

import com.shzhong.enums.ResultEnum;

/**
 * Created by my on 17/4/8.
 */
public class GirlException extends RuntimeException {


    private Integer code;

    public GirlException(ResultEnum resultEnum) {
        super(resultEnum.getMsg());
        this.code = resultEnum.getCode();
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }
}
