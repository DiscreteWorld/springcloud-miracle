package com.miracle.cloud.demo.java19feature.demo3;

/**
 * @Author:徐塬峰
 * @Date: 2023/2/26  14:59
 * @Version 1.0
 */
public class Demo {
    public static void main(String[] args) {
        String str = """
                {
                    "fruit": "%s",
                    "size": "Large",
                    "color": "Red"
                }""".formatted("Orange");

        System.out.println(str);
    }
}
