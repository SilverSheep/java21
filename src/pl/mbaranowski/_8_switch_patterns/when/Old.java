package pl.mbaranowski._8_switch_patterns.when;

import java.math.BigDecimal;
import java.util.List;
import java.util.Random;

public class Old {

    static void testTriangle(Shape s) {
        switch (s) {
            case null:
                break;
            case Triangle t:
                if (t.calculateArea() > 100) {
                    System.out.println("Large triangle");
                    break;
                }
                // no break here means triangle with area <= 100 will fall into "default"
            default:
                System.out.println("A shape, possibly a small triangle");
        }
    }

    public static void main(String[] args) {
        testTriangle(new Triangle());
    }
}