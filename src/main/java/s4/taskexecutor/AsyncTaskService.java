package s4.taskexecutor;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

/**
 * AsyncTaskService
 *
 * @author wqc
 * @create 2017-12-15 17:16
 **/
@Service
public class AsyncTaskService {
    @Async
    public void executeAsyncTask(Integer i){
        System.out.println("执行异步任务："+i);
    }

    @Async //异步方法
    public void executeAsyncTaskPlus(Integer integer){
        System.out.println("执行异步任务+1："+(integer+1));
    }

}
