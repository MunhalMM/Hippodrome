package org.telran.hippodrome;

import java.util.ArrayList;
import java.util.List;


public class Hippodrome {
    public static void main(String[] args) throws InterruptedException {

        List<Participant> participants = new ArrayList<>();
        participants.add(new Pony(10));
        participants.add(new Puma(15));
        participants.add(new Leopard(25));
        participants.add(new Donkey(5));

        int length = 1000;

        new Thread(new Circle(length, participants)).start();
        Thread.sleep(12000);
    }

    private int generateStartPosition(int size) {
        return 0;

    }
}