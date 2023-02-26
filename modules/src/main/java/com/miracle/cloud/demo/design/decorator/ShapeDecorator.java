package com.miracle.cloud.demo.design.decorator;

/**
 * @Author:徐塬峰
 * @Date: 2023/2/26  14:37
 * @Version 1.0
 */
public abstract class ShapeDecorator implements Shape{
    protected Shape decoratedShape;

    public ShapeDecorator(Shape decoratedShape){
        this.decoratedShape = decoratedShape;
    }

    public void draw(){
        decoratedShape.draw();
    }
}
