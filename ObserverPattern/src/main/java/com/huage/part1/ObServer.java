package com.huage.part1;

/**
 * 观察者接口
 */
public interface ObServer {
    /**
     * 更新数据的方法
     * @param name
     * @param age
     * @param sex
     */
    void update(String name,int age,String sex);
}
