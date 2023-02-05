package com.lionword.later.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Arrays;

@Aspect
public class LaterAspect {
    //don't work with lombok (probably), need to switch to load-time weaving
    @Pointcut("call(public * com.lionword.later..*.*(..))")
    public void anyMethod() {}



    @Before("anyMethod()")
    public void logMethod(JoinPoint joinPoint) {
        Logger log = LoggerFactory.getLogger(joinPoint.getTarget().getClass());
        String message = joinPoint.getSignature().getName();
        Object[] args = joinPoint.getArgs();
        if (args.length > 0) {
            message += " " + Arrays.toString(args);
        }
        log.info(message);
    }

}
