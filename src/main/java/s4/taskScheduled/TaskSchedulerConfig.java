package s4.taskScheduled;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * TaskSchedulerConfig
 *
 * @author wqc
 * @create 2017-12-18 14:14
 **/
@Configuration
@ComponentScan("s4.taskScheduled")
@EnableScheduling//注解开启对计划任务的支持
public class TaskSchedulerConfig {
}
