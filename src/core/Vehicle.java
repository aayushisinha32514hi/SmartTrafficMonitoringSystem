package core;

public class Vehicle {

    private String vehicleId;
    private String type; // CAR, BIKE, TRUCK, AMBULANCE
    private int speed;
    private String lane;

    public Vehicle(String vehicleId, String type, int speed, String lane) {
        this.vehicleId = vehicleId;
        this.type = type;
        this.speed = speed;
        this.lane = lane;
    }

    public String getVehicleId() {
        return vehicleId;
    }

    public String getType() {
        return type;
    }

    public int getSpeed() {
        return speed;
    }

    public String getLane() {
        return lane;
    }

    public void displayVehicle() {
        System.out.println(
                "Vehicle: " + vehicleId +
                        " | Type: " + type +
                        " | Speed: " + speed +
                        " km/h | Lane: " + lane);
    }
}