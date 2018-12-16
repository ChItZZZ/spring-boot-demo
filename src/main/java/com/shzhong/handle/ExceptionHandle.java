package com.shzhong.handle;

import com.shzhong.domain.Result;
import com.shzhong.exception.GirlException;
import com.shzhong.utils.ResultUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by my on 17/4/8.
 */


//
@ControllerAdvice
public class ExceptionHandle {


    private final static Logger LOGGER = LoggerFactory.getLogger(ExceptionHandle.class);
    @ExceptionHandler(value = Exception.class)
    @ResponseBody
    public Result handle(Exception e) {

        if (e instanceof GirlException) {
            GirlException girlException = (GirlException) e;
            return ResultUtil.error(girlException.getCode(), girlException.getMessage());
        } else {
            LOGGER.error("[系统异常] {}",e);
            return ResultUtil.error(-1,"位置错误");
        }
    }
}
