package springMVC4.interceptor;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * DemoInterceptor
 * 自定义拦截器：实现简单功能-计算请求处理时间
 * @author wqc
 * @create 2017-12-19 15:29
 **/
public class DemoInterceptor extends HandlerInterceptorAdapter {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response
            ,Object handler) throws Exception{
        long startTime = System.currentTimeMillis();
        request.setAttribute("startTime",startTime);
        return true;
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response
            , Object handler,ModelAndView modelAndView) throws Exception{
        long startTime = (long) request.getAttribute("startTime");
        request.removeAttribute("startTime");
        long endTime = System.currentTimeMillis();
        request.setAttribute("handlingTime",endTime-startTime);
        System.out.println("本次请求的处理时间："+new Long(endTime-startTime));
    }

}
