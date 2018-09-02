package s4.prepost;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * JSR250WayService
 *
 * @author wqc
 * @create 2017-12-06 14:35
 **/
public class JSR250WayService {
    public JSR250WayService(){
        super();
        System.out.println("初始化构造函数--JSR250WayService");
    }

    @PostConstruct
    public void init(){
        System.out.println("JSR250-init-method");
    }

    @PreDestroy
    public void destroy(){
        System.out.println("JSR250-destory-method");
    }
}
