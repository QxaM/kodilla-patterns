package com.kodilla.patterns.enums;

import java.util.Scanner;

public class UserDialogs {

    public static UserSelection getUserSelection() {
        Scanner scanner = new Scanner(System.in);
        while(true) {
            System.out.println("Enter your choice: (S)cissors, (R)ock, (P)aper");
            String s = scanner.nextLine().toUpperCase();
            switch (s) {
                case "S" -> {return UserSelection.SCISSORS;}
                case "R" -> {return UserSelection.ROCK;}
                case "P" -> {return  UserSelection.PAPER;}
                default -> System.out.println("Enter valid selection!");
            }
        }

    }
}
