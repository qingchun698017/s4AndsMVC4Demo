package springMVC4.messageconverter;

import org.springframework.http.HttpInputMessage;
import org.springframework.http.HttpOutputMessage;
import org.springframework.http.MediaType;
import org.springframework.http.converter.AbstractHttpMessageConverter;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.http.converter.HttpMessageNotWritableException;
import org.springframework.util.StreamUtils;
import springMVC4.domain.DemoObj;

import java.io.IOException;
import java.nio.charset.Charset;

/**
 * MyMessageConverter
 * HttpMessageConverter:用来处理request和response里的数据
 * 继承AbstractHttpMessageConverter 可实现自定义的HttpMessageConverter
 * @author wqc
 * @create 2017-12-20 16:33
 **/
public class MyMessageConverter extends AbstractHttpMessageConverter<DemoObj> {

    public MyMessageConverter(){
        //新建一个自定义的媒体类型application/x-wisely
        super(new MediaType("application","x-wisely", Charset.forName("UTF-8")));
    }

    //表明本HttpMessageConverter只处理DemoObj类
    @Override
    protected boolean supports(Class<?> aClass) {
        return DemoObj.class.isAssignableFrom(aClass);
    }

    /**
     * 重写此方法，处理请求的数据，此处是处理带-的数据，并转成DemoObj
     */
    @Override
    protected DemoObj readInternal(Class<? extends DemoObj> aClass,
                                   HttpInputMessage httpInputMessage)
            throws IOException, HttpMessageNotReadableException {
        String temp = StreamUtils.copyToString(httpInputMessage.getBody()
                        ,Charset.forName("UTF-8"));
        String[] tempArr = temp.split("-");
        return new DemoObj(new Long(tempArr[0]),tempArr[1]);
    }

    //重写此方法，处理如何输出数据到response。此处在原样输出的前面加hello
    @Override
    protected void writeInternal(DemoObj demoObj, HttpOutputMessage httpOutputMessage)
            throws IOException, HttpMessageNotWritableException {
        String out = "hello:" + demoObj.getId()+"-"+demoObj.getName();
        httpOutputMessage.getBody().write(out.getBytes());
    }
}
