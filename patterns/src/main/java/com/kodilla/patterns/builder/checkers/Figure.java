package com.kodilla.patterns.builder.checkers;

public class Figure {

    public static final String WHITE = "WHITE";
    public static final String BLACK = "BLACK";
    private final String color;

    public Figure(String color) {
        if (color.equals(WHITE) || color.equals((BLACK))) {
            this.color = color;
        } else {
            try {
                throw new IllegalAccessException("Figures of checkers should be BLACK or WHITE!");
            } catch (IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public String getColor() {
        return color;
    }
}
