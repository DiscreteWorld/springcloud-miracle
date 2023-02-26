package com.miracle.cloud.demo.design.singleton;

/**
 * @Author:徐塬峰
 * @Date: 2023/2/26  16:50
 * @Version 1.0
 */
public class SingletonSync {
    private volatile static SingletonSync instance;

    private SingletonSync() {
    }

    public static SingletonSync getInstance() {
        if (instance == null) {
            synchronized (SingletonSync.class) {
                if (instance == null) {
                    instance = new SingletonSync();
                }
            }
        }
        return instance;
    }
}
