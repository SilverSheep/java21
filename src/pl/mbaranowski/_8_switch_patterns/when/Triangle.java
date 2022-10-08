package pl.mbaranowski._8_switch_patterns.when;

import java.util.Random;

class Triangle extends Shape {
    int calculateArea() {
        return new Random().nextInt(50, 150);
    }
}
