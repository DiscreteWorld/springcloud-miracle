package com.miracle.cloud.demo.design.decorator;

/**
 * @Author:徐塬峰
 * @Date: 2023/2/26  14:37
 * @Version 1.0
 */
public class Demo {
    public static void main(String[] args) {
        Shape circle = new Circle();
        Shape redCircle = new RedShapeDecorator(new Circle());
        Shape redRectangle = new RedShapeDecorator(new Rectangle());
        System.out.println("Circle with normal border");
        circle.draw();
        System.out.println("Circle of red border");
        redCircle.draw();
        System.out.println("Rectangle of red border");
        redRectangle.draw();
    }
}
