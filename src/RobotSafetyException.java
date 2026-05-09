/**
 * UC6–UC8: Custom Exception Class
 * ------------------------------
 * Used across system for safety violations
 */

public class RobotSafetyException extends Exception {

    public RobotSafetyException(String message) {
        super(message);
    }
}