package com.springText.bean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test2 {
    public static void main(String[] args){
//        ApplicationContext context = new ClassPathXmlApplicationContext("ioc.xml");  //会创建bean对象
//
//        Person person = context.getBean("person", Person.class);//获取bean的实例对象  不需要强制转换
//        System.out.println(person);

//        int a = 368;
        double a =  6 * 8;

        System.out.println((int)(a/5));

//        System.out.println(20/365);
    }
}
