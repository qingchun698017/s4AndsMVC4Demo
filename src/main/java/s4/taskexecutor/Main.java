package s4.taskexecutor;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Main
 * Spring 通过任务执行器（TaskExecutor）来实现多线程和并发编程
 * @author wqc
 * @create 2017-12-15 17:49
 **/
public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(TaskExecutorConfig.class);
        AsyncTaskService asyncTaskService = context.getBean(AsyncTaskService.class);
        for(int i = 0;i<10;i++){
            asyncTaskService.executeAsyncTask(i);
            asyncTaskService.executeAsyncTaskPlus(i);
        }
        context.close();
    }
}
