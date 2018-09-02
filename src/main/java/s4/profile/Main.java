package s4.profile;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Main
 * Profile为在不同环境下使用不同的配置提供了支持（开发环境和生成环境下的配置肯定是不同的，如，数据库的配置）
 * @author wqc
 * @create 2017-12-12 10:29
 **/
public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
//        context.getEnvironment().setActiveProfiles("prod");
//        context.register(new Class<?>[]{ProfileConfig.class});
//        context.refresh();

        context.getEnvironment().setActiveProfiles("dev");
        context.register(new Class<?>[]{ProfileConfig.class});
        context.refresh();

        DemoBean demoBean = context.getBean(DemoBean.class);

        System.out.println("-----demoBean.Content: "+demoBean.getContent());

        context.close();
    }
}
