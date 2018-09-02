package s4.annotation;

import org.springframework.stereotype.Service;

/**
 * DemoService
 *
 * @author wqc
 * @create 2017-12-18 15:24
 **/
@Service
public class DemoService {
    public void put(){
        System.out.println("组合注解获取bean");
    }
}
