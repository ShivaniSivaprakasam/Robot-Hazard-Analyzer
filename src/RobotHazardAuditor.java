/**
 * UC8: Business Logic Layer (RobotHazardAuditor)
 * ----------------------------------------------
 * Responsibility:
 *   - Validate inputs
 *   - Compute hazard risk
 *   - Map machinery state
 */

public class RobotHazardAuditor {

    /**
     * UC8: Main business method
     */
    public double calculateHazardRisk(double armPrecision,
                                      int workerDensity,
                                      String machineryState)
            throws RobotSafetyException {

        // UC8: Validate inputs first
        validateInputs(armPrecision, workerDensity);

        // UC8: Get machinery risk factor
        double machineryRisk = getMachineryRisk(machineryState);

        // UC8: Final risk formula
        return (100 - armPrecision) + workerDensity + machineryRisk;
    }

    /**
     * UC8: Input validation logic
     */
    private void validateInputs(double armPrecision, int workerDensity)
            throws RobotSafetyException {

        if (armPrecision < 0 || armPrecision > 100) {
            throw new RobotSafetyException("Arm Precision must be 0–100");
        }

        if (workerDensity < 0 || workerDensity > 100) {
            throw new RobotSafetyException("Worker Density must be 0–100");
        }
    }

    /**
     * UC8: Machinery state mapping logic
     */
    private double getMachineryRisk(String state)
            throws RobotSafetyException {

        switch (state) {
            case "Worn":
                return 20;

            case "Faulty":
                return 40;

            case "Critical":
                return 70;

            default:
                throw new RobotSafetyException("Invalid Machinery State");
        }
    }
}