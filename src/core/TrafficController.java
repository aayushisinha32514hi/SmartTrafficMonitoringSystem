package core;

import utils.VideoSimulator;

public class TrafficController {

    private TrafficSignal signal;
    private DensityCalculator densityCalculator;
    private VideoSimulator camera;
    private ViolationDetector detector;

    public TrafficController() {
        signal = new TrafficSignal("RED", 5);
        densityCalculator = new DensityCalculator();
        camera = new VideoSimulator();
        detector = new ViolationDetector();
    }

    public void startSystem() {

        while (true) {

            // STEP 1 — Capture Vehicle
            Vehicle vehicle = camera.captureVehicle();

            // STEP 2 — Violation Checks
            detector.checkOverspeed(vehicle);
            detector.checkRedLightViolation(vehicle, signal.getColor());
            detector.checkEmergencyVehicle(vehicle);

            // STEP 3 — Emergency Handling
            if (vehicle.getType().equals("AMBULANCE")) {

                System.out.println("🚑 Emergency Vehicle Detected in Lane: " + vehicle.getLane());
                System.out.println("🚦 Switching signal to GREEN for emergency!");

                signal.setSignal("GREEN", 5);
                signal.display();
            }

            // STEP 4 — Lane Status
            System.out.println("\n===== TRAFFIC LANES STATUS =====");

            int laneA = densityCalculator.getVehicleCount();
            int laneB = densityCalculator.getVehicleCount();
            int laneC = densityCalculator.getVehicleCount();
            int laneD = densityCalculator.getVehicleCount();

            System.out.println("Lane A vehicles: " + laneA);
            System.out.println("Lane B vehicles: " + laneB);
            System.out.println("Lane C vehicles: " + laneC);
            System.out.println("Lane D vehicles: " + laneD);

            // STEP 5 — Signal Cycle
            runSignal("RED", 5);
            runSignal("GREEN", 7);
            runSignal("YELLOW", 2);
        }
    }

    private void runSignal(String color, int time) {

        signal.setSignal(color, time);

        for (int i = time; i > 0; i--) {

            signal.setSignal(color, i);
            signal.display();

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println("------------------------------");
    }
}