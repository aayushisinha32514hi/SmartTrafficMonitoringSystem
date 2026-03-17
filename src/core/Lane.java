package core;

public class Lane {

    private String laneName;
    private int vehicleCount;

    public Lane(String laneName, int vehicleCount) {
        this.laneName = laneName;
        this.vehicleCount = vehicleCount;
    }

    public String getLaneName() {
        return laneName;
    }

    public int getVehicleCount() {
        return vehicleCount;
    }

    public void displayLane() {
        System.out.println(laneName + " vehicles: " + vehicleCount);
    }
}