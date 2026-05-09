/**
 * UC6: Custom Exception for Robot Safety Violations
 * -------------------------------------------------
 * Purpose: Handle invalid robot safety conditions
 */

public class RobotSafetyException extends Exception {

    public RobotSafetyException(String message) {
        super(message); // message handled by parent Exception class
    }
}