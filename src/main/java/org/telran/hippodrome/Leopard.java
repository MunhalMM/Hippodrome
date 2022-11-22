package org.telran.hippodrome;

public class Leopard extends Cat implements Raceable {
    public Leopard(int speed) {
        super(speed);
    }

    @Override
    public void printInformation() {
        System.out.println("Leopard ist winner!!!");
    }
}
