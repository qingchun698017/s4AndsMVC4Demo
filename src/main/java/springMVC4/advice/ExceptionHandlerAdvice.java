package springMVC4.advice;

import org.springframework.ui.Model;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.ModelAndView;

import javax.jws.WebResult;

/**
 * ExceptionHandlerAdvice
 * 通过@ControllerAdvice，可以将全局的控制器配置放置在同一个位置上
 * @author wqc
 * @create 2017-12-20 9:42
 **/
@ControllerAdvice//声明一个控制器建言，@ControllerAdivce组合了@Component注解，所以自动注册为Spring的Bean
public class ExceptionHandlerAdvice {

    @ExceptionHandler(value = Exception.class)//在此处定义全局的处理，通过此注解的Value可过滤拦截的条件，此处是拦截所有的Exception
    public ModelAndView exception(Exception exception, WebRequest request){
        ModelAndView modelAndView = new ModelAndView("/error");
        modelAndView.addObject("errorMessage",exception.getMessage());
        return modelAndView;
    }

    @ModelAttribute//原作用是绑定键值对到Model里，此处是让全局的@RequestMapping都能获得在此处设置的键值对
    public void addAttributes(Model model){
        model.addAttribute("msg","额外信息");
    }

    @InitBinder
    public void initBinder(WebDataBinder webDataBinder){
        //WebDataBinder 用来自动绑定前台请求的参数到Model中
        webDataBinder.setDisallowedFields("id");
    }
}
