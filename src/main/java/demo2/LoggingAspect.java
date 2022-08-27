package demo2;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {

    @Before("execution(* demo2.ShoppingCart.checkout(..))")
    public void logger(JoinPoint jp){
        System.out.println(jp.getSignature());
        String s = jp.getArgs()[0].toString();
        System.out.println("Before Loggers : "+s);
    }

    //* for any return type, * for any package, * for any class
    //.. whatever the number of parameters are there, it will match
    @After("execution(* *.*.checkout(..))")
    public void afterLogger(){
        System.out.println("After Loggers");
    }
    
    @Pointcut("execution(* demo2.ShoppingCart.quantity(..))")
    public void afterReturningPointCut(){

    }

    @AfterReturning(pointcut = "afterReturningPointCut()", returning = "retVal")
    public void afterReturning(String retVal){
        System.out.println("after returning : "+retVal);
    }
}
