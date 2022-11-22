package org.telran.hippodrome;


public abstract class Participant implements Runnable {

    protected static long startTime;
    protected static long finishTime;
    private int finishPosition;
    protected int speed;
    private int currentPosition = 0;
    protected int result;


    public Participant(int speed) {
        this.speed = speed;
    }

    public void setFinishPosition(int finishPosition) {
        this.finishPosition = finishPosition;
    }


    public void setCurrentPosition(int currentPosition) {
        this.currentPosition = currentPosition;
    }

    public int getCurrentPosition() {
        return currentPosition;
    }

    @Override
    public void run() {
        startTime = System.currentTimeMillis();
        while (!isFinished()) {
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            step();
        }
        finishTime = System.currentTimeMillis();
        result = (int) (finishTime - startTime);
        System.out.println(result + " " + Thread.currentThread().getName());
    }

    public void step() {
        currentPosition += speed;
    }

    private boolean isFinished() {
        return currentPosition >= finishPosition;
    }


}
