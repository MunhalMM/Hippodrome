package org.telran.hippodrome;

public class Donkey extends Horse implements Raceable{
    public Donkey(int speed) {
        super(speed);
    }

    @Override
    public void printInformation() {
        System.out.println("Donkey ist winner!!!");

    }
}
