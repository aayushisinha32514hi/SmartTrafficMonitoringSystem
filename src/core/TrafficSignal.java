package core;

public class TrafficSignal {

    private String color;
    private int timer;

    public TrafficSignal(String color, int timer) {
        this.color = color;
        this.timer = timer;
    }

    public String getColor() {
        return color;
    }

    public int getTimer() {
        return timer;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setTimer(int timer) {
        this.timer = timer;
    }

    public void display() {
        System.out.println("Signal: " + color + " | Time: " + timer + " seconds");
    }
}
