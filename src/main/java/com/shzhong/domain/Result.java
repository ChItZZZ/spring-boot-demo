package com.shzhong.domain;

/**
 * Created by my on 17/4/8.
 */


import lombok.Data;

/**
 * http请求返回的最外层对象
 */

@Data
public class Result<T> {
    //    错误码
    private Integer code;

    //    提示信息
    private String msg;

    //    具体内容
    private T data;

}
