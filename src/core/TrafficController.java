package core;

public class TrafficController {

    private TrafficSignal signal;

    public TrafficController() {
        signal = new TrafficSignal("RED", 30);
    }

    public void changeSignal() {

        if (signal.getColor().equals("RED")) {
            signal.setColor("GREEN");
            signal.setTimer(20);

        } else if (signal.getColor().equals("GREEN")) {
            signal.setColor("YELLOW");
            signal.setTimer(5);

        } else {
            signal.setColor("RED");
            signal.setTimer(30);
        }

        signal.display();
    }

    public void startSystem() {
        signal.display();
        changeSignal();
        changeSignal();
        changeSignal();
    }
}