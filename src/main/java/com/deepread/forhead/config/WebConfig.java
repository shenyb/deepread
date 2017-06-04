package com.deepread.forhead.config;

import org.slf4j.*;
import org.springframework.boot.autoconfigure.*;
import org.springframework.context.annotation.*;
import org.springframework.web.servlet.config.annotation.*;

/**
 * 此类可以代替spring-mvc.xml中的相关配置，需要自定义配置时，可通过override相关方法实现
 * @author shenyanbin
 */
@SpringBootApplication
@ComponentScan(basePackages = "com.deepread")
@EnableWebMvc  //自己掌控mvc的配置,不采用springboot默认的配置
public class WebConfig extends WebMvcConfigurerAdapter {

    private static Logger logger = LoggerFactory.getLogger(WebConfig.class);

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/static/**").addResourceLocations("classpath:/static/");
        //swagger的配置,可以在线生成REST API javadoc
        registry.addResourceHandler("swagger-ui.html")
                .addResourceLocations("classpath:/META-INF/resources/");
        registry.addResourceHandler("/webjars/**")
                .addResourceLocations("classpath:/META-INF/resources/webjars/");
    }

}

