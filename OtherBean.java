package com.itheima.beans;

import com.alibaba.druid.pool.DruidDataSource;
import com.itheima.dao.UserDao;
import com.itheima.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import javax.sql.DataSource;

//@Component
public class OtherBean {



    @Bean("dataSource")
    public DataSource dataSource(
            //注入普通属性用@Value
            @Value("${jdbc.driver}") String driverClassName,
            //根据名称注入用 @Qualifier
            @Qualifier("userDao2") UserDao userDao,
            //根据类型注入用@Autowired,在上面有@Bean时则可以不写这个@Autowired
            UserService userService


            ){

       /* System.out.println(driverClassName);
        System.out.println(userDao);
        System.out.println(userService);*/

        DruidDataSource dataSource=new DruidDataSource();
        //设置4个基本参数...
//        dataSource.setDriverClassName(driverClassName);
        return dataSource;

    }

}
