package com.miracle.cloud.demo.design.decorator;

/**
 * @Author:徐塬峰
 * @Date: 2023/2/26  14:36
 * @Version 1.0
 */
public class Rectangle implements Shape{
    @Override
    public void draw() {
        System.out.println("Drawing a Rectangle");
    }
}
