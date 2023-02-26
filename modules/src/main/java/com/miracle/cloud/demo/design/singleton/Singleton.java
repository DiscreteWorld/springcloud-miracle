package com.miracle.cloud.demo.design.singleton;

/**
 * @Author:徐塬峰
 * @Date: 2023/2/26  16:49
 * @Version 1.0
 */
public class Singleton {
    private static Singleton instance = null;
    private Singleton() {}
    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
}
