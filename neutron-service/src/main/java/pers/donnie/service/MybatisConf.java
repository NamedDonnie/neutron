package pers.donnie.service;

import com.github.pagehelper.PageInterceptor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Properties;

/**
 * PageInterceptor
 * Created by liyudong on 2017/9/20.
 */
@Configuration
public class MybatisConf {

    @Bean
    public PageInterceptor pageInterceptor() {
        PageInterceptor pageInterceptor = new PageInterceptor();
        Properties p = new Properties();
        p.setProperty("properties", "param1=value1");
        pageInterceptor.setProperties(p);
        System.out.println("*******************pageInterceptor******************");
        return pageInterceptor;
    }
/*
    @Bean
    public PageHelper pageHelper() {
        System.out.println("MyBatisConfiguration.pageHelper()");
        PageHelper pageHelper = new PageHelper();
        Properties p = new Properties();
        p.setProperty("offsetAsPageNum", "true");
        p.setProperty("rowBoundsWithCount", "true");
        p.setProperty("reasonable", "true");
        pageHelper.setProperties(p);
        System.out.println("-----------------------------pageHelper----------------------");
        return pageHelper;
    }*/
}
