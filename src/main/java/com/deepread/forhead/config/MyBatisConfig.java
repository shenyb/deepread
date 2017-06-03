package com.deepread.forhead.config;


import org.apache.ibatis.session.*;
import org.mybatis.spring.*;
import org.mybatis.spring.annotation.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.context.annotation.*;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.support.*;

import javax.sql.*;

@Configuration
@MapperScan("com.deepread.forhead.mapper.*Mapper")
public class MyBatisConfig {

    @Autowired
    DataSource dataSource;

    @Bean(name = "sqlSessionFactory")
    public SqlSessionFactory sqlSessionFactoryBean() {
        SqlSessionFactoryBean bean = new SqlSessionFactoryBean();
        bean.setDataSource(dataSource);
//        //miemiedev开发的mybatis物理分页拦截器
//        OffsetLimitInterceptor paginatorPlugin = new OffsetLimitInterceptor();
//        paginatorPlugin.setDialectClass("com.github.miemiedev.mybatis.paginator.dialect.MySQLDialect");
//
//        //添加插件
//        bean.setPlugins(new Interceptor[]{paginatorPlugin});

        //添加XML目录
        ResourcePatternResolver resolver = new PathMatchingResourcePatternResolver();
        try {
            bean.setMapperLocations(resolver.getResources("classpath:mapper/*Mapper.xml"));
            return bean.getObject();
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }

    @Bean
    public SqlSessionTemplate sqlSessionTemplate(SqlSessionFactory sqlSessionFactory) {
        return new SqlSessionTemplate(sqlSessionFactory);
    }
}
