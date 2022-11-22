package org.telran.hippodrome;

public class Pony extends Horse implements Raceable {

    public Pony(int speed) {
        super(speed);
    }

    @Override
    public void printInformation() {
        System.out.println("Pony ist winner!!!");
    }

}
