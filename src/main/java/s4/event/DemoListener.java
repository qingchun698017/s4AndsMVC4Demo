package s4.event;

import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

/**
 * DemoListener
 * 事件监听器
 * @author wqc
 * @create 2017-12-13 14:31
 **/
@Component
public class DemoListener implements ApplicationListener<DemoEvent> {
    @Override
    public void onApplicationEvent(DemoEvent event) {
        String msg = event.getMsg();
        System.out.println("DemoListener接收到了bean-demoPublisher发布的消息："+msg);
    }
}
