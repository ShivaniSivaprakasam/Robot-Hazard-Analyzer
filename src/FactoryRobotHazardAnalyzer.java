/**
 * UC3: Calculate Hazard Risk Score (No Validation)
 * -------------------------------------------------
 * Goal: Compute hazard risk using basic formula
 * Formula:
 *   Risk = (100 - ArmPrecision) + WorkerDensity
 */

public class FactoryRobotHazardAnalyzer {

    public static void main(String[] args) {

        double armPrecision = 70;
        int workerDensity = 30;

        // UC3: Basic risk calculation (no validation yet)
        double hazardRisk = (100 - armPrecision) + workerDensity;

        System.out.println("Hazard Risk Score: " + hazardRisk);
    }
}