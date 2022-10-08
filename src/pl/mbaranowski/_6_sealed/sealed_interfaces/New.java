package pl.mbaranowski._6_sealed.sealed_interfaces;

sealed interface Shape permits RoundShape, Triangle {
    String hello();
}

sealed interface RoundShape extends Shape {

}

final class Circle implements RoundShape {

    @Override
    public String hello() {
        return "Hello, I'm circle";
    }
}

final class Triangle implements Shape {

    @Override
    public String hello() {
        return "Hello, I'm triangle";
    }
}

// won't compile
//interface Rectangle extends RoundShape {
//}

public class New {

    public static void main(String[] args) {
        var circle = new Circle();
        System.out.println(circle);

        // won't compile
//        var rectangle = new Rectangle();
//        System.out.println(rectangle);
    }
}
