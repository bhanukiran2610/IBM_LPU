package com.example;

import java.util.UUID;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.example.bean.Image;
import com.example.config.MyAppConfig;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       AnnotationConfigApplicationContext context= new AnnotationConfigApplicationContext(MyAppConfig.class);
       Image image=context.getBean("image",Image.class);
       image.setImageId(UUID.randomUUID().toString());
       image.setImageUrl("demourl.com");
       System.out.println(image);
    }
}
