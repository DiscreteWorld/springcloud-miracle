package com.miracle.cloud.demo.java19feature.demo6;

/**
 * Java 19 sealed and permitted are two different features of the Java language.
 * Sealed classes and interfaces restrict which other classes or interfaces
 * may extend or implement them. Permitted classes and interfaces are those
 * that are allowed to extend or implement the sealed classes and interfaces.
 * For example, if a class is sealed, only classes that are explicitly permitted can extend it.
 * This helps to ensure that the class is used as intended and that no unexpected behavior occurs.
* @Author:徐塬峰
* @Date: 2023/2/26  15:29
* @Version 1.0
*/
sealed class Animal permits Cat {

}

final  class Cat extends Animal {

}
public class Main {
    public static void main(String[] args) {
        var cat = new Cat();
        System.out.println(cat);
//        var trojanHorse = new TrojanHorse();
//        System.out.println(trojanHorse);
    }
}

