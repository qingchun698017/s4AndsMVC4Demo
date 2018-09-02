package s4.aware;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Main
 *
 * @author wqc
 * @create 2017-12-13 16:45
 **/
public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(AwareConfig.class);
        AwareService awareService = context.getBean(AwareService.class);
        awareService.outputResult();
        context.close();
    }
}
