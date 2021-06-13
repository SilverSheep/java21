package com.yavaconf._6_sealed.old;

class Animal {

}

class Cat extends Animal {

}

class TrojanHorse extends Animal {

}

public class Old {

    public static void main(String[] args) {
        var cat = new Cat();
        System.out.println(cat);

        var trojanHorse = new TrojanHorse();
        System.out.println(trojanHorse);
    }
}
