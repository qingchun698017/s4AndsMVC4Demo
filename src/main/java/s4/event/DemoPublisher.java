package s4.event;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

/**
 * DemoPublisher
 * 事件发布类
 * @author wqc
 * @create 2017-12-13 14:38
 **/
@Component
public class DemoPublisher {
    @Autowired
    ApplicationContext context;

    public void publish(String msg){
        context.publishEvent(new DemoEvent(this,msg));
    }
}
