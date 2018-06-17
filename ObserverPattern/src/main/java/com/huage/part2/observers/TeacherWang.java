package com.huage.part2.observers;

import com.huage.part1.DisplayElement;
import com.huage.part1.ObServer;
import com.huage.part2.subject.ClassRoom;

import java.util.Observable;
import java.util.Observer;

/**
 * 王老师
 * author: 蛋蛋的忧伤
 * date: 2018/6/17 0017 12:04
 */
public class TeacherWang implements Observer,DisplayElement {
    private String name;
    private int age;
    private String sex;


    @Override
    public void display() {
        System.out.printf("王老师说:有一位新同学来报道了,姓名:%s,年龄:%s,性别:%s",name,age,sex);
        System.out.println();
    }


    @Override
    public void update(Observable o, Object arg) {
        if(o instanceof ClassRoom){
            this.age =  ((ClassRoom) o).getAge();
            this.name = ((ClassRoom) o).getName();
            this.sex = ((ClassRoom) o).getSex();
            display();
        }
    }
}
