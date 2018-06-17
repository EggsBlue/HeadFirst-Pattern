package com.huage.part1;

import com.huage.part1.Subject;
import com.huage.part1.observers.TeacherLu;
import com.huage.part1.observers.TeacherWang;
import com.huage.part1.subject.ClassRoom;
import org.junit.Test;

/**
 * 观察者模式测试用例
 * author: 蛋蛋的忧伤
 * date: 2018/6/17 0017 12:23
 */
public class TestCase {

    @Test
    public void test1(){
        //先创建主题对象
        ClassRoom classRoom = new ClassRoom();
        //再创建多个观察者对象
        TeacherLu lu = new TeacherLu();
        TeacherWang wang = new TeacherWang();
        classRoom.registerObject(lu);
        classRoom.registerObject(wang);

        classRoom.addStudent("蛋蛋",20,"男");
        System.out.println("=============");
        classRoom.addStudent("wendal",33,"男");
    }

}
