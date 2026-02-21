package core;

public class TrafficController {

    private TrafficSignal signal;

    public TrafficController() {
        signal = new TrafficSignal("RED", 10);
    }

    public void startSystem() {

        while (true) {

            runSignal("RED", 10);
            runSignal("GREEN", 8);
            runSignal("YELLOW", 3);
        }
    }

    private void runSignal(String color, int time) {

        signal.setSignal(color, time);

        for (int i = time; i > 0; i--) {
            signal.setSignal(color, i);
            signal.display();
            sleep(1000);
        }

        System.out.println("---------------------------");
    }

    private void sleep(int milliseconds) {
        try {
            Thread.sleep(milliseconds);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}