package springMVC4.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import springMVC4.domain.DemoObj;

/**
 * AdviceController
 *
 * @author wqc
 * @create 2017-12-20 10:14
 **/
@Controller
public class AdviceController {

    @RequestMapping("/advice")
    public String getSomething(@ModelAttribute("msg") String msg,DemoObj demoObj){
        throw new IllegalArgumentException("非常抱歉，参数有误/"+"来自@ModelAttribute："+msg);
    }

}
