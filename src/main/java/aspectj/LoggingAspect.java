package aspectj;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;

import java.util.Arrays;

@Aspect
public class LoggingAspect {

    @Around("execution(* service.CustomerService.addCustomerAround(..))")
    public void logAround(ProceedingJoinPoint joinPoint) throws Throwable {

        System.out.println("logAround() is running!");
        System.out.println("перехваченный метод : " + joinPoint.getSignature().getName());
        System.out.println("перехваченные аргументы : " + Arrays.toString(joinPoint.getArgs()));

        System.out.println("Around before is running!");
        joinPoint.proceed();
        System.out.println("Around after is running!");

        System.out.println("******");

    }

}