package com.springText.bean;
/**
 * 实例工厂类
 * */
public class PersonFactory {
    public Person getInstance(String name){
        Person p = new Person();
        return p;
    }
}
