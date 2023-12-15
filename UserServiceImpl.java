package com.itheima.service.impl;


import com.itheima.dao.UserDao;
import com.itheima.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

//@Component("userService")
@Service("userService")
/**
 * @author hhm
 * @version 1.0
 */
public class UserServiceImpl implements UserService {
    @Autowired//根据类型进行注入,如果同一类型的Bean有多个，尝试根据名字进行二次匹配，匹配成功则注入，匹配不成功再报错
    //@Qualifier("userDao2")//在此，Qualifier结合Autowired一起使用，作用是根据名称注入相应的Bean
    //@Resource(name = "userDao2")//不指定名称参数时，根据类型注入，指定名称就根据名称注入
    private UserDao userDao;

    /*@Autowired
    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }*/

    @Override
    public void show() {

        System.out.println(userDao);
    }

    @Autowired
    public void xxx(UserDao userDao){

//        System.out.println("xxx:"+userDao);
    }

    @Autowired
    public void yyy(List<UserDao> userDaoList){

//        System.out.println("xxx:"+userDaoList);
    }
}
