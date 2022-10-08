package pl.mbaranowski._3_textblocks;

public class Main {

    public static void main(String[] args) {
        String str = """
                {
                    "fruit": "%s",
                    "size": "Large",
                    "color": "Red"
                }""".formatted("Orange");

        System.out.println(str);
    }
}
