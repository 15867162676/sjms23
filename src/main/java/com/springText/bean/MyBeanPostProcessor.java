package com.springText.bean;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class MyBeanPostProcessor implements BeanPostProcessor {
    //在初始化方法执行之前要执行的内容
    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        if(bean instanceof Person){
            //do string
        }
        System.out.println("postProcessBeforeInitialization:" + beanName);
        return bean;
    }

    //在初始化方法执行之后要执行的内容
    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("postProcessAfterInitialization:" + beanName);
        return bean;
    }
}
