package core;
import utils.LogManager;

public class ViolationDetector {

    private static final int SPEED_LIMIT = 80;

    public void checkOverspeed(Vehicle vehicle) {

        if (vehicle.getSpeed() > SPEED_LIMIT) {

            Violation violation = new Violation(
                    vehicle.getVehicleId(),
                    "Overspeeding",
                    vehicle.getLane()
            );

            violation.displayViolation();
        }
    }

    public void checkRedLightViolation(Vehicle vehicle, String signalColor) {

        if (signalColor.equals("RED")) {

            Violation violation = new Violation(
                    vehicle.getVehicleId(),
                    "Red Light Crossing",
                    vehicle.getLane()
            );

            violation.displayViolation();
        }
    }

    public void checkEmergencyVehicle(Vehicle vehicle) {

        if (vehicle.getType().equals("AMBULANCE")) {

            System.out.println(
                    "🚑 Emergency Vehicle Detected in Lane: "
                            + vehicle.getLane()
            );

            System.out.println("Priority signal should be activated.");
        }
    }
}