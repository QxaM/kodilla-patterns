package com.kodilla.patterns.builder.checkers;

public class FigureFactory {

    public static final String PAWN = "PAWN";
    public static final String QUEEN = "QUEEN";

    public static Figure makeFigure(String figureType, String color) {
        return switch (figureType) {
            case PAWN -> new Pawn(color);
            case QUEEN -> new Queen(color);
            default -> throw new IllegalStateException("Type of figure should be pawn or queen!");
        };
    }
}
