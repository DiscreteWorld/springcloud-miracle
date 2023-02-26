package com.miracle.cloud.demo.design.factory;

/**
 * @Author:徐塬峰
 * @Date: 2023/2/26  14:49
 * @Version 1.0
 */
public class Demo {
    public static void main(String[] args) {
        Shape shape1 = ShapeFactory.getShape("CIRCLE");
        shape1.draw();
        Shape shape2 = ShapeFactory.getShape("SQUARE");
        shape2.draw();
    }
}
