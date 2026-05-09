/**
 * UC6: Exception Handling Integration
 * -----------------------------------
 * Goal:
 *   - Throw custom exception for invalid input
 *   - Handle using try-catch block
 */

public class FactoryRobotHazardAnalyzer {

    public static void main(String[] args) {

        try {

            // UC6: Risk calculation call
            double risk = calculateHazardRisk(120, 30);

            System.out.println("Hazard Risk Score: " + risk);

        } catch (RobotSafetyException e) {

            // UC6: Exception handling output
            System.out.println("Exception Occurred: " + e.getMessage());
        }
    }

    /**
     * UC6: Business logic with exception handling
     */
    public static double calculateHazardRisk(double armPrecision, int workerDensity)
            throws RobotSafetyException {

        // UC6: Validation with exception throwing
        if (armPrecision < 0 || armPrecision > 100) {
            throw new RobotSafetyException("Invalid Arm Precision (0-100 allowed)");
        }

        if (workerDensity < 0 || workerDensity > 100) {
            throw new RobotSafetyException("Invalid Worker Density (0-100 allowed)");
        }

        return (100 - armPrecision) + workerDensity;
    }
}