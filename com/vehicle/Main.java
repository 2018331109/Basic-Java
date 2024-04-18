package com.vehicle;

public class Main {
    public static void main(String[] args) {
        custom benz = new custom("Benz", true);
        benz.move(40, 0);
        benz.acceleration(20);
    }
}