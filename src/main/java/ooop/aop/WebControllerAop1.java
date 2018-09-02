package ooop.aop;

import ooop.httpclient.HttpClient;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * WebControllerAop
 *
 * @author wqc
 * @create 2017-12-11 13:58
 **/
@Aspect
@Component
@Order(1)
public class WebControllerAop1 {


    @Autowired
    private HttpClient httpClient;

    @Pointcut("execution(* ooop.*.*(..))")
    public void webHttp(){}

    @Around("webHttp()")
    public Object around(ProceedingJoinPoint joinPoint) throws Throwable {
        System.out.println("开始11111");
        Object object = joinPoint.proceed();
       // Object object = mtcOkHttpClient.executeGet("https://www.baidu.com/?tn=78040160_5_pg&ch=1");
        //Object object = "DSADAA";
        //跳转请求 https://www.baidu.com/?tn=78040160_5_pg&ch=1
        System.out.println("结束1111111");
        return object;

    }

}
