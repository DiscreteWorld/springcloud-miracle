package com.miracle.cloud.demo.design.singleton;

/**
 * @Author:徐塬峰
 * @Date: 2023/2/26  16:50
 * @Version 1.0
 */
public class SingletonHungry {
    private static SingletonHungry instance = new SingletonHungry();
    private SingletonHungry() {}
    public static SingletonHungry getInstance() {
        return instance;
    }
}
