package com.kodilla.patterns.enums;

public class Application {
    public static void main(String[] args) {
        UserSelection userSelection = UserDialogs.getUserSelection();
        System.out.println(userSelection);

        if(userSelection == UserSelection.SCISSORS) {
            System.out.println("Your selection is Scissors");
        } else if(userSelection == UserSelection.ROCK) {
            System.out.println("Your selection is Rock");
        } else {
            System.out.println("Your selection is Paper");
        }
    }
}
