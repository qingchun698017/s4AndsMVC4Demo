package s4.taskScheduled;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import s4.taskexecutor.TaskExecutorConfig;

/**
 * Main
 * Spring 的计划任务：在配置类注解@EnableScheduling来开启对计划任务的支持，
 *                  然后在要执行的任务方法上注解@Scheduled声明这是一个计划任务。
 *
 * @author wqc
 * @create 2017-12-18 11:20
 **/
public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(TaskSchedulerConfig.class);
        context.close();
    }
}
