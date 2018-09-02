package s4.taskScheduled;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * ScheduledTaskService
 * fixedRate 两次任务执行的时间间隔是两次任务的起始点
 * fixedDelay 两次任务执行的时间间隔是前一次任务的终点和这一次任务的起点
 * @author wqc
 * @create 2017-12-18 13:54
 **/
@Service
public class ScheduledTaskService {
    private static final SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");

    @Scheduled(fixedRate = 5000)
    public void reportCurrentTime(){
        System.out.println("每隔5秒执行一次："+dateFormat.format(new Date()));
    }

    @Scheduled(fixedDelay = 6000)
    public void printCurrentTime(){
        System.out.println("每隔6秒执行一次："+dateFormat.format(new Date()));
    }
    @Scheduled(cron = "0 22 14 ? * *")
    public void fixTimeExecution(){
        System.out.println("在指定时间："+dateFormat.format(new Date())+"执行");
    }
}
