package com.huage.part2.subject;

import java.util.Observable;

/**
 * 使用jdk自带的观察者类库来做
 * author: 蛋蛋的忧伤
 * date: 2018/6/17 12:29
 */
public class ClassRoom extends Observable {

    private String name;
    private int age;
    private String sex;

    public void addStudent(String name,int age,String sex){
        this.name = name;
        this.age = age;
        this.sex = sex;
        setChanged();
        notifyObservers();
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

}
