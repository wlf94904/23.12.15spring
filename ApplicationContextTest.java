package com.itheima;

import com.itheima.config.SpringConfig;
import com.itheima.dao.UserDao;
import com.itheima.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author hhm
 * @version 1.0
 */
public class ApplicationContextTest {
    public static void main(String[] args) {

        System.setProperty("spring.profiles.active","test");


        //xml方式的Spring容器
        //ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        //注解方式去加载Spring的核心配置类
        ApplicationContext applicationContext=new AnnotationConfigApplicationContext(SpringConfig.class);
        /*UserService userService = applicationContext.getBean(UserService.class);
        userService.show();*/
        Object userDao = applicationContext.getBean("userDao2");
        System.out.println(userDao);


//        Object dataSou
//        rce = applicationContext.getBean("dataSource");
//        System.out.println(dataSource);



//        Object dataSource = applicationContext.getBean("dataSource");
//        System.out.println(dataSource);
//        /*UserDao bean = applicationContext.getBean(UserDao.class);
//        bean.show();*/
//        UserService userService = (UserService) applicationContext.getBean("userService");
//        userService.show();
        /*Object userDao = applicationContext.getBean("userDao");
        UserService userService =applicationContext.getBean(UserService.class);
        System.out.println(userService);
        System.out.println(userDao);*/

        //关闭之前执行bean的销毁方法
//        applicationContext.close();
    }
}
