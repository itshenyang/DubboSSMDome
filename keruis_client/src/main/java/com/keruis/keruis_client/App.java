package com.keruis.keruis_client;

import com.keruis.keruis_pojo.Pojos.User;
import com.keruis.keruis_pojo.Service.Redis4GService;
import com.keruis.keruis_pojo.Service.UserService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Administrator on 2017/10/18.
 */
public class App {
    public static void main(String[] args) {
        //测试常规服务
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("dubbo-consumer.xml");
        context.start();
        System.out.println("consumer start");
        UserService userService = context.getBean(UserService.class);
        //Redis4GService redis4GService =context.getBean(Redis4GService.class);
        System.out.println("consumer");
        User user = new User();
        user.setU_name("admin");
        user.setU_pwd("Cn41IA9abmA44ckp8Ca27n8IQzmPXSFm");
        user.setTag("0");
        //String s = redis4GService.getJedis().getJedis().get("2017wanghuan");
       // System.out.println("==========="+s);
        System.out.println(userService.Login(user).getU_name());
    }
}
