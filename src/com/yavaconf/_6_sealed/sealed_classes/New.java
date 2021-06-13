package com.yavaconf._6_sealed.sealed_classes;

sealed class Animal permits Cat {

}

final class Cat extends Animal {

}

// won't compile
//class TrojanHorse extends Animal {
//
//}

public class New {

    public static void main(String[] args) {
        var cat = new Cat();
        System.out.println(cat);

        // won't compile
//        var trojanHorse = new TrojanHorse();
//        System.out.println(trojanHorse);
    }
}
