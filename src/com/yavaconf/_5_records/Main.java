package com.yavaconf._5_records;

public record Main(boolean isAwesome, String name) {

    public static void main(String[] args) {
        var main = new Main(true, "Awesome!");
        System.out.println(main);
    }

}
