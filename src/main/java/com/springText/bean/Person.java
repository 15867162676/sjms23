package com.springText.bean;

import java.util.*;

public class Person {
    private Integer id;

    private Map<String,String> map;

    public Person() {
        System.out.println("Person无参创建了");
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Map<String, String> getMap() {
        return map;
    }

    public void setMap(Map<String, String> map) {
        this.map = map;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", map=" + map +
                '}';
    }
}
