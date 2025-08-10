package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) {

//        Alien a = new Alien();
//        a.getcode();

        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        Alien obj1 = (Alien) context.getBean("alien"); //Typecast class
        obj1.getcode();
        obj1.age=21;
        System.out.println(obj1.getAge());

      /*  Alien obj2 = (Alien) context.getBean("alien");
        obj2.getcode();
        System.out.println(obj2.getAge());*/

        Desktop obj3 = context.getBean(Desktop.class); // Type class
        //obj3.getcompile();  //lazy-init is true when we call that time only it should works.
    }
}
