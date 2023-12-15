package com.itheima.dao.impl;

import com.itheima.dao.UserDao;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Profile;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

//    <bean id="userDao" class="com.itheima.dao.impl.UserDaoImpl"></bean>
//@Component("userDao")
@Repository("userDao")
//@Scope("singleton")
//@Lazy(false)
@Profile("test")
public class UserDaoImpl implements UserDao{

    @Value("${jdbc.driver}")
    private String username;

//    @Value("lisi")
    private  void setUsername(String username){
        this.username=username;
    }
   /* public void setUsername(String username) {
        this.username = username;
    }*/



    //    //无参构造，可以看出他什么时候创建对象
//    public UserDaoImpl(){
//        System.out.println("userDao创建");
//    }
//
//    //初始化方法
//    @PostConstruct
//    public void init(){
//        System.out.println("userDao的初始化方法");
//    }
//
//
//    //销毁方法
//    @PreDestroy
//    public void destroy(){
//        System.out.println("userDao的销毁方法");
//    }
//
    @Override
    public void show() {
        System.out.println(username);
    }
}
