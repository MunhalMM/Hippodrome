package org.telran.hippodrome;

public class Puma extends Cat implements Raceable {

    public Puma(int speed) {
        super(speed);
    }

    @Override
    public  void printInformation() {
        System.out.println("Puma ist winner!!!");
    }

}
