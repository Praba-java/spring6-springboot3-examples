package org.example;

import org.example.config.Appconfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContextExtensionsKt;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    ApplicationContext context=new AnnotationConfigApplicationContext(Appconfig.class);
    Desktop des=context.getBean("first",Desktop.class);
    des.getcode();
    }
}
