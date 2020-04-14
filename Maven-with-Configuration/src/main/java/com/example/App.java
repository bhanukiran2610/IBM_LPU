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
       @SuppressWarnings("resource")
       AnnotationConfigApplicationContext context= new AnnotationConfigApplicationContext(MyAppConfig.class);
       Image imageObj=context.getBean("image",Image.class);
       imageObj.setImageId(UUID.randomUUID().toString());
       imageObj.setImageUrl("demourl.com");
       System.out.println(imageObj);
    }
}
