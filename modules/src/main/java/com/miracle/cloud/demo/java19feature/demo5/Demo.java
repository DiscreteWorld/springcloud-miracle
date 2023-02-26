package com.miracle.cloud.demo.java19feature.demo5;
/**
 * @Author:徐塬峰
 * @Date: 2023/2/26  15:27
 * @Version 1.0
 */
public record Demo (boolean isAwesome, String title){
    public static void main(String[] args) {
        Demo instance = new Demo(true, "Awesome record");
        System.out.println(instance);
    }
}
