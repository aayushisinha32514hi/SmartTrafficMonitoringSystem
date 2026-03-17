package utils;

import core.Vehicle;
import java.util.Random;

public class VideoSimulator {

    private Random random = new Random();

    private String[] vehicleTypes = {"CAR", "BIKE", "TRUCK", "AMBULANCE"};
    private String[] lanes = {"Lane A", "Lane B", "Lane C", "Lane D"};

    public Vehicle captureVehicle() {

        String vehicleId = "V" + (100 + random.nextInt(900));

        // make ambulance rare
        String type;
        int chance = random.nextInt(10);

        if (chance == 0) {
            type = "AMBULANCE";
        } else {
            type = vehicleTypes[random.nextInt(3)];
        }

        int speed = 40 + random.nextInt(60);

        String lane = lanes[random.nextInt(lanes.length)];

        Vehicle vehicle = new Vehicle(vehicleId, type, speed, lane);

        System.out.println("\n📷 Camera Captured Vehicle:");
        vehicle.displayVehicle();

        return vehicle;
    }
}