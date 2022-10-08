package pl.mbaranowski._8_switch_patterns.nulls;


public class Old {

    static void ratePresentation(Grade grade) {
        if (grade == null) {
            System.out.println("Unfortunately grade is null");
            return;
        }
        int score = switch (grade) {
            case BAD, WORST_EVER -> 1;
            case NEUTRAL -> 3;
            case GREAT, NICE -> {
                System.out.println("Wow!");
                yield 5;
            }
        };
        System.out.println("Presentation score: " + score);
    }

    public static void main(String[] args) {
        ratePresentation(null);
    }
}
