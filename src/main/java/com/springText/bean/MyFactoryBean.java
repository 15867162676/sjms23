package com.springText.bean;
import org.springframework.beans.factory.FactoryBean;
/**
 * 必须实现FactoryBean
 * 此方式是spring创建bean方式的一种补充，用户可以按照需求创建对象，
 * 创建的对象交由spring IOC容器来管理，
 * 无论是否是单例，都是在用到的时候才会创建该对象，
 * 没有用到的时候不会创建
 * */
public class MyFactoryBean implements FactoryBean {
    //返回获取的bean
    @Override
    public Object getObject() throws Exception {
        Person p = new Person();
        p.setId(1);
        return p;
    }

    //获取返回bean的类型
    @Override
    public Class<?> getObjectType() {
        return Person.class;
    }

    //判断当前bean是否是单例
    @Override
    public boolean isSingleton() {
        return true;
    }
}
