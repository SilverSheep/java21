package pl.mbaranowski._5_records;

import lombok.Value;

@Value
public class LombokValue {
    boolean isAwesome;
    String title;

    public static void main(String[] args) {
        LombokValue instance = new LombokValue(true, "Awesome record");
        System.out.println(instance.getTitle());
    }

}
