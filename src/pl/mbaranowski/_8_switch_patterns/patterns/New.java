package pl.mbaranowski._8_switch_patterns.patterns;

import java.math.BigDecimal;
import java.util.List;
import java.util.Random;

public class New {

    public static void main(String[] args) {
        Object obj = blackbox();

        switch(obj) {
            case BigDecimal bigDecimal -> System.out.println("Big decimal: " + bigDecimal.add(BigDecimal.ONE));
            case String str -> System.out.println("String: " + str.toUpperCase());
            case null, default -> System.out.println("World is unexpected!");
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