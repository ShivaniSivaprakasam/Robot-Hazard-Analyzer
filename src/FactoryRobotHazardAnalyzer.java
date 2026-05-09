/**
 * UC7: Machinery State Risk Mapping
 * ---------------------------------
 * Goal: Convert machinery state into risk factor
 * Valid States:
 *   - Worn
 *   - Faulty
 *   - Critical
 */

public class FactoryRobotHazardAnalyzer {

    public static void main(String[] args) throws RobotSafetyException {

        double risk = calculateHazardRisk(80, 30, "Faulty");

        System.out.println("Hazard Risk Score: " + risk);
    }

    /**
     * UC7: Risk calculation including machinery mapping
     */
    public static double calculateHazardRisk(double armPrecision,
                                             int workerDensity,
                                             String machineryState)
            throws RobotSafetyException {

        double machineryRisk;

        // UC7: Mapping machinery state to risk values
        if (machineryState.equals("Worn")) {
            machineryRisk = 20;
        } else if (machineryState.equals("Faulty")) {
            machineryRisk = 40;
        } else if (machineryState.equals("Critical")) {
            machineryRisk = 70;
        } else {
            throw new RobotSafetyException("Unsupported Machinery State");
        }

        // Final UC7 risk formula
        return (100 - armPrecision) + workerDensity + machineryRisk;
    }
}