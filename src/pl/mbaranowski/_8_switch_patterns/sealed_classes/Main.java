package pl.mbaranowski._8_switch_patterns.sealed_classes;

sealed interface Animal permits Cat, Dog, Fish { }
final class Cat implements Animal { }
final class Dog implements Animal { }
final class Fish implements Animal { }

public class Main {

    static void checkAnimal(Animal animal) {
        switch (animal) {
            case Cat ignored -> System.out.println("just cat");
            case Dog ignored -> System.out.println("just dog");
            case Fish ignored ->  System.out.println("just fish");
        }
    }

    public static void main(String[] args) {
        checkAnimal(new Dog());
    }
}
