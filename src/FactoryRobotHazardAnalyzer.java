/**
 * UC4: Add Input Validation Using Conditional Logic
 * --------------------------------------------------
 * Goal: Validate input ranges before calculation
 * Rules:
 *   - Arm Precision: 0–100
 *   - Worker Density: 0–100
 */

public class FactoryRobotHazardAnalyzer {

    public static void main(String[] args) {

        double armPrecision = 120; // invalid example
        int workerDensity = 30;

        // UC4: Validate Arm Precision
        if (armPrecision < 0 || armPrecision > 100) {
            System.out.println("Error: Invalid Arm Precision range");
            return;
        }

        // UC4: Validate Worker Density
        if (workerDensity < 0 || workerDensity > 100) {
            System.out.println("Error: Invalid Worker Density range");
            return;
        }

        // UC4: Risk calculation after validation
        double hazardRisk = (100 - armPrecision) + workerDensity;

        System.out.println("Hazard Risk Score: " + hazardRisk);
    }
}