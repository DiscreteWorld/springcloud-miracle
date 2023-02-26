package com.miracle.cloud.demo.design.factory;

/**
 * @Author:徐塬峰
 * @Date: 2023/2/26  14:49
 * @Version 1.0
 */
public class ShapeFactory {
    public static Shape getShape(String shapeType) {
        if (shapeType == null) {
            return null;
        }
        if (shapeType.equalsIgnoreCase("CIRCLE")) {
            return new Circle();
        } else if (shapeType.equalsIgnoreCase("SQUARE")) {
            return new Square();
        }
        return null;
    }
}
