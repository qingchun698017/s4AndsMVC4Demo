package springMVC4.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import springMVC4.domain.DemoObj;

/**
 * ConverterContronller
 *
 * @author wqc
 * @create 2017-12-20 17:25
 **/
@Controller
public class ConverterContronller {
    @RequestMapping(value = "/converter",method = RequestMethod.POST,produces = {"application/x-wisely"})
    public @ResponseBody DemoObj converter(@RequestBody DemoObj demoObj){
        return demoObj;
    }
}
