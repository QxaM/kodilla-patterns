package com.kodilla.patterns.enums.generics;

public class Application {
    public static void main(String[] args) {
        String s = "Test message";
        Displayer<String> displayer = new Displayer<>();
        displayer.display(s);

        int n = 10;
        Displayer<Integer> displayer1 = new Displayer<>();
        displayer1.display(n);
    }
}
