package hello;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class TimeTrackerAspect {
	
	@Around("@annotation(hello.TimeTracker)")
    public Object around(ProceedingJoinPoint pJoinPoint) throws Throwable {
		Long startTime = System.currentTimeMillis();
        System.out.println("Before class: TimeTrackerAspect : " + pJoinPoint.getSignature() + startTime.toString());
        Object obj = pJoinPoint.proceed();
        System.out.println("Total milli seconds in execution of method: " + pJoinPoint.getSignature() + " is :" + (System.currentTimeMillis()-startTime));
        return obj;
	}
}
