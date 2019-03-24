package hello;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class NullCheckAspect {

	@Around("execution(* hello.HelloController.nullChecker(String))")
	public Object around(ProceedingJoinPoint pJoinPoint) throws Throwable {
                
        Object[] args = pJoinPoint.getArgs();

        Method method = MethodSignature.class.cast(pJoinPoint.getSignature()).getMethod();
        
        Annotation[][] parametersAnnotations = method.getParameterAnnotations();
        
        Map<String, Object> annotatedParameters = new HashMap<>();
        
        int i = 0;
        for(Annotation[] parameters : parametersAnnotations) {
        		Object arg = args[i];
    			String name = method.getParameters()[i++].getDeclaringExecutable().getName();
        		for(Annotation parameter: parameters) {
        			if ((parameter instanceof NullCheck)) {
            			System.out.println("Found the null checker annotation with name: " + name);
            			System.out.println("Found the null checker annotation with arg:  " + arg);
            			annotatedParameters.put(name, arg);
                }
        		}
        }
        System.out.println(annotatedParameters);
        
		return pJoinPoint.proceed(args);
    }
}
