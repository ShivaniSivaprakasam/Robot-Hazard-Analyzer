/**
 * UC5: Method Abstraction for Risk Calculation
 * --------------------------------------------
 * Goal: Move logic into reusable method
 * Benefits:
 *   - Cleaner main method
 *   - Reusability
 */

public class FactoryRobotHazardAnalyzer {

    public static void main(String[] args) {

        // UC5: Calling reusable method
        double risk = calculateHazardRisk(80, 30);

        System.out.println("Hazard Risk Score: " + risk);
    }

    /**
     * UC5: Business logic extracted into method
     */
    public static double calculateHazardRisk(double armPrecision, int workerDensity) {

        // Basic validation (still simple version)
        if (armPrecision < 0 || armPrecision > 100) return -1;
        if (workerDensity < 0 || workerDensity > 100) return -1;

        // UC5: Risk calculation logic
        return (100 - armPrecision) + workerDensity;
    }
}