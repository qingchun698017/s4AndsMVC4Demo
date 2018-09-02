package s4.event;

import org.springframework.context.ApplicationEvent;
import org.springframework.stereotype.Component;

/**
 * DemoEvent
 * 自定义事件
 * @author wqc
 * @create 2017-12-13 14:27
 **/
public class DemoEvent extends ApplicationEvent {
    private static final long serialVersionUID = 1L;

    private String msg;
    /**
     * Create a new ApplicationEvent.
     *
     * @param demoPublisher
     * @param source the object on which the event initially occurred (never {@code null})
     */
    public DemoEvent(DemoPublisher demoPublisher, String source) {
        super(source);
        msg = source;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
