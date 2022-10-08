package pl.mbaranowski._5_records;

public record Main(boolean isAwesome, String title) {

    public static void main(String[] args) {
        var main = new Main(true, "awesome");
        System.out.println(main);
    }
}
