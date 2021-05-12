package com.example.aspects;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class MessageAspect {

    private final Logger logger = LoggerFactory.getLogger(getClass());

    @Before("execution( @com.example.customAnnotations.MySpecialService  * com.example.demodi.*Renderer.render(..))")
//    @Before("execution(@java.lang.Override * render(..))")
    public void logMessage(JoinPoint joinPoint) {
        logger.info("----> aspect: method = {}, target bean = {}",
                joinPoint.getSignature().getName(),
                joinPoint.getTarget()
                );
    }
}
