import java.util.Scanner;

/**
 * UC2: Accept Robot Hazard Inputs
 * --------------------------------
 * Goal: Read inputs from user for hazard analysis
 * Inputs:
 *   - Arm Precision (double)
 *   - Worker Density (int)
 *   - Machinery State (String)
 */

public class FactoryRobotHazardAnalyzer {

    public static void main(String[] args) {

        System.out.println("Factory Robot Hazard Analyzer");

        Scanner scanner = new Scanner(System.in);

        // UC2: Collecting input from user
        System.out.print("Enter Arm Precision (0-100): ");
        double armPrecision = scanner.nextDouble();

        System.out.print("Enter Worker Density (0-100): ");
        int workerDensity = scanner.nextInt();

        scanner.nextLine(); // consume newline

        System.out.print("Enter Machinery State (Worn/Faulty/Critical): ");
        String machineryState = scanner.nextLine();

        // UC2: Displaying received inputs
        System.out.println("\n--- Input Summary ---");
        System.out.println("Arm Precision: " + armPrecision);
        System.out.println("Worker Density: " + workerDensity);
        System.out.println("Machinery State: " + machineryState);
    }
}