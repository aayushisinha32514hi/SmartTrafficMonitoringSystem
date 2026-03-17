package core;

import java.util.Random;

public class DensityCalculator {

    private Random random = new Random();

    public int getVehicleCount() {
        return random.nextInt(20) + 1;
    }
}