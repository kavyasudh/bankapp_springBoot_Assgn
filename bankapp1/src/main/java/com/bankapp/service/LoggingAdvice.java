package com.bankapp.service;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAdvice {

	private static Logger logger=LoggerFactory.getLogger(LoggingAdvice.class);
	   
    @Around("@annotation(Loggable)")
    public Object aroundAdvice(ProceedingJoinPoint pjp) throws Throwable {
        long start =System.currentTimeMillis();
        String methodName=pjp.getSignature().getName();
        Object val=pjp.proceed();
        long end=System.currentTimeMillis();
        logger.info("time taken by method "+ methodName +" is "+ (end-start)+" ms.");
        return val;
    }
}
 