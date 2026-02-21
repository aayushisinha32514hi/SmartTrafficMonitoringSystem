package ui;

import core.TrafficController;

public class Main {

    public static void main(String[] args) {

        System.out.println("=== SMART TRAFFIC MONITORING SYSTEM ===");
        System.out.println("System Starting...\n");

        TrafficController controller = new TrafficController();
        controller.startSystem();
    }
}