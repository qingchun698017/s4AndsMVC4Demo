package s4.prepost;

/**
 * BeanWayService
 *
 * @author wqc
 * @create 2017-12-06 14:24
 **/
public class BeanWayService {
    public BeanWayService(){
        super();
        System.out.println("初始化构造器--BeanWayService");
    }

    public void init(){
        System.out.println("@Bean-init-method");
    }

    public void destroy(){
        System.out.println("@Bean-destory-method");
    }
}
