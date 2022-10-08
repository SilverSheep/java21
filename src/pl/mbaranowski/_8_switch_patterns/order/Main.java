package pl.mbaranowski._8_switch_patterns.order;

public class Main {

    static void error(Object o) {
        switch (o) {
            case CharSequence cs ->
                    System.out.println("A sequence of length " + cs.length());
//            Lines below commented out, because they won't compile - String pattern is dominated by CharSequence pattern
//            case String s ->
//                    System.out.println("A string: " + s);
            default -> {}
        }
    }

    public static void main(String[] args) {
        error("string");
    }
}