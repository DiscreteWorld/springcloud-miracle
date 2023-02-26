package com.miracle.cloud.demo.java19feature.demo4;

import java.math.BigDecimal;
import java.util.List;
import java.util.Random;

/**
 * @Author:徐塬峰
 * @Date: 2023/2/26  15:01
 * @Version 1.0
 */
public class Main {
    public static void main(String[] args) {
        Object obj = blackbox();

        if (obj instanceof String str) {
            System.out.println(str.toUpperCase());
        }
        else if (obj instanceof BigDecimal bigDecimal && bigDecimal.compareTo(BigDecimal.ONE) == 0) {
            var bigInteger = bigDecimal.toBigInteger();
            System.out.println(bigInteger);
        }
    }

    /**
     *  simulates blackbox - we don't know what exactly will come out
     *
     * @return either String or BigDecimal
     */
    private static Object blackbox() {
        List<Object> objects = List.of("result", BigDecimal.ONE);

        var index = new Random().nextInt(0, objects.size());

        return objects.get(index);
    }
}
