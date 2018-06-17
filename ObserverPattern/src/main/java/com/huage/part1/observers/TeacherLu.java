package com.huage.part1.observers;

import com.huage.part1.DisplayElement;
import com.huage.part1.ObServer;

/**
 * 陆老师
 */
public class TeacherLu  implements ObServer,DisplayElement {
    private String name;
    private int age;
    private String sex;


    @Override
    public void display() {
        System.out.printf("陆老师说:有一位新同学来报道了,姓名:%s,年龄:%s,性别:%s",name,age,sex);
        System.out.println();
    }

    @Override
    public void update(String name, int age, String sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
        display();
    }
}
