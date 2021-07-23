package com.springText.bean;
/**
 * 静态工厂类
 * */
public class PersonStaticFactory {
    public static Person getInstance(String name){
        Person p = new Person();
        return p;
    }
}
