package core;

public class TrafficController {

    private TrafficSignal signal;

    public TrafficController() {
        signal = new TrafficSignal("RED", 5);
    }

    public void startSystem() {

        while (true) {

            signal.setColor("RED");
            signal.setTimer(5);
            signal.display();
            sleep();

            signal.setColor("GREEN");
            signal.setTimer(5);
            signal.display();
            sleep();

            signal.setColor("YELLOW");
            signal.setTimer(3);
            signal.display();
            sleep();
        }
    }

    private void sleep() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}