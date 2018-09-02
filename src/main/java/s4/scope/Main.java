package s4.scope;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Main
 *
 * @author wqc
 * @create 2017-12-06 9:51
 **/
public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ScopeConfig.class);
        DemoSingletonService ds1 = context.getBean(DemoSingletonService.class);
        DemoSingletonService ds2 = context.getBean(DemoSingletonService.class);

        DemoPrototypeService dp1 = context.getBean(DemoPrototypeService.class);
        DemoPrototypeService dp2 = context.getBean(DemoPrototypeService.class);

        System.out.println("ds1---ds2:"+ds1.equals(ds2)+"  "+(ds1==ds2));
        System.out.println("dp1---dp2:"+dp1.equals(dp2)+"  "+(dp1==dp2));

        context.close();

    }
}
