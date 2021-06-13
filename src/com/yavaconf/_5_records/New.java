package com.yavaconf._5_records;


public record New(boolean isAwesome, String title) {

    public static void main(String[] args) {
        New instance = new New(true, "Awesome record");
        System.out.println(instance);
    }
}
