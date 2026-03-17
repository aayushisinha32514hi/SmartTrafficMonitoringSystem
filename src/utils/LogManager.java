package utils;

import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;

public class LogManager {

    public static void logViolation(String vehicleId, String violationType, String lane) {

        try {

            FileWriter writer = new FileWriter("traffic_violations.txt", true);

            writer.write("Vehicle: " + vehicleId + "\n");
            writer.write("Violation: " + violationType + "\n");
            writer.write("Lane: " + lane + "\n");
            writer.write("Time: " + LocalDateTime.now() + "\n");
            writer.write("-----------------------------\n");

            writer.close();

        } catch (IOException e) {
            System.out.println("Error writing log file.");
        }
    }
}