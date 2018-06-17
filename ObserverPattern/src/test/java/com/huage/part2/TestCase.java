package com.huage.part2;

import com.huage.part2.observers.TeacherLu;
import com.huage.part2.observers.TeacherWang;
import com.huage.part2.subject.ClassRoom;
import org.junit.Test;

/**
 * 观察者模式测试用例
 * author: 蛋蛋的忧伤
 * date: 2018年6月17日 12:34:37
 */
public class TestCase {

    @Test
    public void test1(){
        //先创建主题对象
        ClassRoom classRoom = new ClassRoom();
        //再创建多个观察者对象
        TeacherLu lu = new TeacherLu();
        TeacherWang wang = new TeacherWang();
        classRoom.addObserver(lu);
        classRoom.addObserver(wang);

        classRoom.addStudent("蛋蛋",20,"男");
        System.out.println("=============");
        classRoom.addStudent("wendal",33,"男");
    }

}
