package ui;

import core.TrafficController;

public class Main {

    public static void main(String[] args) {

        TrafficController controller = new TrafficController();

        controller.showSignal();

        controller.changeSignal("GREEN", 15);
        controller.showSignal();

        controller.changeSignal("YELLOW", 5);
        controller.showSignal();
    }
}