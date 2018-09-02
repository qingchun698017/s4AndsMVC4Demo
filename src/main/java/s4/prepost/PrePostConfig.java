package s4.prepost;

import org.springframework.context.annotation.Bean;

/**
 * PrePostConfig
 *
 * @author wqc
 * @create 2017-12-06 14:47
 **/
public class PrePostConfig {

    @Bean(initMethod = "init",destroyMethod = "destroy")
    BeanWayService beanWayService(){
        return new BeanWayService();
    }

    @Bean
    JSR250WayService jsr250WayService(){
        return new JSR250WayService();
    }
}
