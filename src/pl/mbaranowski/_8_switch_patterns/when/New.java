package pl.mbaranowski._8_switch_patterns.when;

public class New {

    static void testTriangle(Shape s) {
        switch (s) {
            case null -> {}
            case Triangle t
                    when t.calculateArea() > 100 ->
                    System.out.println("Large triangle");
            default ->
                    System.out.println("A shape, possibly a small triangle");
        }
    }

    public static void main(String[] args) {
        testTriangle(new Triangle());
    }
}