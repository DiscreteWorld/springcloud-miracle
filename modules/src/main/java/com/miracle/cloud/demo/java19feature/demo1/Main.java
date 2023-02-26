package com.miracle.cloud.demo.java19feature.demo1;

/**
 * @Author:徐塬峰
 * @Date: 2023/2/26  15:43
 * @Version 1.0
 */

    class A {
        B b = new B();
    }

    class B {
        C c = new C();
    }

    class C {
        Integer number = 1;
    }

    public class Main {

        public static void main(String[] args) {
            A a = new A();
            System.out.println(a.b.c.number);
        }
}
