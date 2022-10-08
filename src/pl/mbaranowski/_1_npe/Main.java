package pl.mbaranowski._1_npe;

class A {
    B b = new B();
}

class B {
    C c = new C();
}

class C {
    Integer number = 1;
}

public class Main {

    public static void main(String[] args) {
        A a = new A();
        System.out.println(a.b.c.number);
    }
}
