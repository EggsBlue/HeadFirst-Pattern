package com.huage.part1;

/**
 * 主题对象
 */
public interface Subject {

    /**
     * 注册为观察者
     * @param object
     */
    void registerObject(ObServer object);

    /**
     * 移除观察者
     * @param object
     */
    void removeObject(ObServer object);

    /**
     * 通知观察者
     */
    void notifyObjects();
}
