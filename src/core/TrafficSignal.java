package core;

public class TrafficSignal {

    private String color;
    private int duration;

    public TrafficSignal(String color, int duration) {
        this.color = color;
        this.duration = duration;
    }

    public String getColor() {
        return color;
    }

    public int getDuration() {
        return duration;
    }

    public void setSignal(String color, int duration) {
        this.color = color;
        this.duration = duration;
    }

    public void display() {
        System.out.println("Signal: " + color + " | Time Remaining: " + duration + " seconds");
    }
}