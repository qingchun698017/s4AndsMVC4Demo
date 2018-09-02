package s4.event;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Main
 * Application Event为Bean与Bean之间的消息通信提供了支持
 * @author wqc
 * @create 2017-12-13 14:24
 **/
public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(EventConfig.class);

        DemoPublisher demoPublisher = context.getBean(DemoPublisher.class);

        demoPublisher.publish("hello world~~~");

        context.close();
    }
}
