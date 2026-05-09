/**
 * UC8: Fully Modular Factory Robot Hazard Analyzer
 * -------------------------------------------------
 * Goal:
 *   - Separate UI and business logic
 *   - Follow OOP principles (SRP, Encapsulation)
 */

public class FactoryRobotHazardAnalyzer {

    public static void main(String[] args) {

        // UC8: Creating service layer object
        RobotHazardAuditor auditor = new RobotHazardAuditor();

        try {

            // UC8: Delegating calculation to service class
            double risk = auditor.calculateHazardRisk(80, 30, "Faulty");

            System.out.println("Hazard Risk Score: " + risk);

        } catch (RobotSafetyException e) {

            // UC8: Centralized exception handling
            System.out.println("Error: " + e.getMessage());
        }
    }
}