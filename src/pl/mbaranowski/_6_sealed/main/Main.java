package pl.mbaranowski._6_sealed.main;

sealed class Animal permits Cat {

}

final  class Cat extends Animal {

}
//
//class TrojanHorse extends Animal {
//
//}

public class Main {

    public static void main(String[] args) {
        var cat = new Cat();
        System.out.println(cat);

//        var trojanHorse = new TrojanHorse();
//        System.out.println(trojanHorse);
    }
}
