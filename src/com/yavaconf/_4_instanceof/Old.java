package com.yavaconf._4_instanceof;

import java.math.BigDecimal;
import java.util.List;
import java.util.Random;

public class Old {

    public static void main(String[] args) {
        Object obj = blackbox();

        if (obj instanceof String) {
            String result = (String) obj;
            System.out.println("input is String");
            System.out.println(result.toUpperCase());
        } else if (obj instanceof BigDecimal) {
            BigDecimal result = (BigDecimal) obj;
            if (result.equals(BigDecimal.ONE)) {
                System.out.println("input is BigDecimal");
                System.out.println(result.add(BigDecimal.ONE));
            }
        }

        System.out.println("Fin");
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
