package com.keruis.keruisService;

import com.keruis.keruisService.utils.L;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * Created by Huan on 2017/2/8.
 */
public class App {

    public static void main( String[] args )
    {

        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext(
                new String[]{"dubbo-provider.xml"}
        );
        applicationContext.start();
        L.d("dubbo-redis-service Application Started !!!");
        try {
            System.in.read();
        } catch (IOException e) {
            e.printStackTrace();
        }
        L.d("dubbo-redis-service Application Over !!!");
    }
}
