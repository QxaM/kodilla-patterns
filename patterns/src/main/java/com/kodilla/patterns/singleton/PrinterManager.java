package com.kodilla.patterns.singleton;

public enum PrinterManager {
    INSTANCE;

    public void print() {
        System.out.println("Test");
    }
}
