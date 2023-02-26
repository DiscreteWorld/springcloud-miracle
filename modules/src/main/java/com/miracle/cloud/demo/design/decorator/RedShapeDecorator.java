package com.miracle.cloud.demo.design.decorator;

/**
 * @Author:徐塬峰
 * @Date: 2023/2/26  14:37
 * @Version 1.0
 */
public class RedShapeDecorator extends ShapeDecorator{

    public RedShapeDecorator(Shape decoratedShape) {
        super(decoratedShape);
    }

    @Override
    public void draw() {
        decoratedShape.draw();
        setRedBorder(decoratedShape);
    }

    private void setRedBorder(Shape decoratedShape){
        System.out.println("Border Color: Red");
    }
}
