package springMVC4.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * HelloController
 *
 * @author wqc
 * @create 2017-12-19 13:52
 **/
@Controller
public class HelloController {
    @RequestMapping("/index")
    public String hello(){
        return "/index";
    }
}
