package core;

public class Violation {

    private String vehicleId;
    private String violationType;
    private String lane;

    public Violation(String vehicleId, String violationType, String lane) {
        this.vehicleId = vehicleId;
        this.violationType = violationType;
        this.lane = lane;
    }

    public String getVehicleId() {
        return vehicleId;
    }

    public String getViolationType() {
        return violationType;
    }

    public String getLane() {
        return lane;
    }

    public void displayViolation() {
        System.out.println(
                "Violation Detected → Vehicle: " + vehicleId +
                        " | Type: " + violationType +
                        " | Lane: " + lane
        );
    }
}