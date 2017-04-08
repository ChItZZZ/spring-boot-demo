package com.shzhong.aspect;

import org.aopalliance.intercept.Joinpoint;
import org.apache.log4j.spi.LoggerFactory;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;
import java.util.logging.Logger;

/**
 * Created by my on 17/4/8.
 */

@Aspect

//引入spring容器
@Component
public class HttpAspect {


    //spring内置looger
    private final static org.slf4j.Logger LOGGER = org.slf4j.LoggerFactory.getLogger(HttpAspect.class);

    //定义公用方法
    @Pointcut("execution(public * com.shzhong.controller.GirlController.*(..))")
    public void log() {

    }

    @Before("log()")
    public void doBefore(JoinPoint joinPoint) {
        LOGGER.info("before");

        ServletRequestAttributes attributes = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
        HttpServletRequest request = attributes.getRequest();
        //url
        LOGGER.info("url={}", request.getRequestURL());

        //method
        LOGGER.info("method={}", request.getMethod());

        //ip
        LOGGER.info("ip={}", request.getRemoteAddr());

        //类方法
        LOGGER.info("class_method={}", joinPoint.getSignature().getDeclaringTypeName() + "." + joinPoint.getSignature().getName());

        //参数
        LOGGER.info("arg={}", joinPoint.getArgs());
    }

    @After("log()")
    public void doAfter() {
        LOGGER.info("after");
    }

    @AfterReturning(returning = "object", pointcut = "log()")
    public void doAfterRereturning(Object object) {
//        LOGGER.info("response={}", object.toString());


    }

}
