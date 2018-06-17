package com.huage.part1.subject;

import com.huage.part1.ObServer;
import com.huage.part1.Subject;

import java.util.ArrayList;
import java.util.List;

/**
 * 自己来做一个观察者模式的实例
 * author: 蛋蛋的忧伤
 * date: 2018/6/17 0017 12:01
 */
public class ClassRoom implements Subject {
    private List<ObServer> obServers;

    private String name;
    private int age;
    private String sex;

    public ClassRoom(){
        obServers = new ArrayList<>();
    }

    @Override
    public void registerObject(ObServer object) {
        obServers.add(object);
    }

    @Override
    public void removeObject(ObServer object) {
        int i = obServers.indexOf(object);
        if(i>0){
            obServers.remove(object);
        }
    }

    @Override
    public void notifyObjects() {
        for (ObServer obServer : obServers){
            obServer.update(name,age,sex);
        }
    }

    public void addStudent(String name,int age,String sex){
        this.name = name;
        this.age = age;
        this.sex = sex;
        notifyObjects();
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
