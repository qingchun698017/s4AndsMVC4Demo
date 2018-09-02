package s4.conditional;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Main
 * 条件注解
 * @author wqc
 * @create 2017-12-18 14:31
 **/
public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(ConditionConfig.class);
        ListService listService = context.getBean(ListService.class);

        System.out.println(context.getEnvironment().getProperty("os.name")
                +"系统下列表命令为:"+ listService.showListCmd());
        context.close();
    }
}
