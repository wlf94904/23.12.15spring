package com.itheima.config;

import com.alibaba.druid.pool.DruidDataSource;
import com.itheima.beans.OtherBean;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.*;

import javax.sql.DataSource;

/**
 * @author hhm
 * @version 1.0
 */

@Configuration//①标注当前类是一个配置类（替代配置文件）+②@Component
//<context:component-scan base-package="com.itheima"/>
@ComponentScan("com.itheima")
//<context:property-placeholder location="classpath:jdbc.properties"/>
@PropertySource("classpath:jdbc.properties")
//<import resource=""></import>
@Import(OtherBean.class)
public class SpringConfig {

    @Bean
    public DataSource dataSource(
            @Value("${jdbc.driver}") String driver
            @Value("${jdbc.url}") String url,
            @Value("${jdbc.username}") String username,
            @Value("${jdbc.password}") String password
    ){
        DruidDataSource dataSource=new DruidDataSource();
        //设置dataSource内部的4个必要的属性
        dataSource.setDriverClassName(driver);
        dataSource.setUrl(url);
        dataSource.setUsername(username);
        dataSource.setPassword(password);
        return dataSource;
    }

    public SqlSessionFatoryBean sqlSessionFatoryBean(){

    }
}
