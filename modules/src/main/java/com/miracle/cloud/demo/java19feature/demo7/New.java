package com.miracle.cloud.demo.java19feature.demo7;

/**
 * record pattern matching
 * Sure, Java has a powerful record pattern matching feature. It allows you to match a pattern against a record and extract the values
 * that match the pattern. For example, you can use the match keyword to match a record against a pattern and extract the values that match the pattern.
 *
 * java
 * Copy code
 * record Person(String name, int age) {
 *     public Person(String name, int age) {
 *         this.name = name;
 *         this.age = age;
 *     }
 * }
 *
 * Person p = new Person("John", 25);
 *
 * if (p instanceof Person person) {
 *     String name = person.name;
 *     int age = person.age;
 * }
 * @Author:徐塬峰
 * @Date: 2023/2/26  15:37
 * @Version 1.0
 */
public class New {

    public static void main(String[] args) {
        Object obj = blackbox();

        if (obj instanceof Rectangle(Point(int leftX, int topY), Point(int rightX, int bottomY))) {
            var width = rightX - leftX;
            var height = bottomY - topY;
            System.out.println("Width: " + width);
            System.out.println("Height: " + height);
        }

        System.out.println("Fin");
    }

    /**
     *  simulates blackbox - we don't know what exactly will come out
     *
     * @return either String or BigDecimal
     */
    private static Object blackbox() {
        return createRectangle();
    }

    private static Rectangle createRectangle() {
        return new Rectangle(new Point(0, 1), new Point(5, 12));
    }
}
