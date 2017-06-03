package com.deepread;

import com.deepread.forhead.config.*;
import org.slf4j.*;
import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;
import org.springframework.boot.builder.*;
import org.springframework.boot.web.support.*;
import org.springframework.context.annotation.*;

import javax.servlet.*;

@Configuration
@EnableAutoConfiguration
@ComponentScan("com.deepread")
public class Application extends SpringBootServletInitializer{
    private static Logger log = LoggerFactory.getLogger(Application.class);

    @Override
    protected SpringApplicationBuilder configure(
            SpringApplicationBuilder application) {
        log.info("=============Spring容器启动（Spring Boot Container Start...）=============");
        return application.sources(WebConfig.class);
    }

    /**
     * Config ServletListener, ServletFilter
     */
    @Override
    public void onStartup(ServletContext servletContext)
            throws ServletException {
        log.info("=============Servlet容器启动（Web Container Servtlet Start...）============");


        super.onStartup(servletContext);
    }
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

}