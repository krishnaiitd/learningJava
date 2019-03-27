package com.example.demo;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class TimeTrackerAspect {
	
	@Around("@annotation(TimeTracker)")
    public Object around(ProceedingJoinPoint pJoinPoint) throws Throwable {
		Long startTime = System.currentTimeMillis();
        Object obj = pJoinPoint.proceed();
        System.out.println("Total milli seconds in execution of method: " + pJoinPoint.getSignature().getName() + " is :" + (System.currentTimeMillis()-startTime));
        return obj;
	}
}
