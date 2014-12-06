package edu.wpi.first.wpilibj.templates;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {

    // For example to map the left and right motors, you could define the
    // following variables to use with your drivetrain subsystem.
    // public static final int leftMotor = 1;
    // public static final int rightMotor = 2;
    // If you are using multiple modules, make sure to define both the port
    // number and the module. For example you with a rangefinder:
    // public static final int rangefinderPort = 1;
    // public static final int rangefinderModule = 1;
    public static final int FRONT_LEFT_TALON = 0;
    public static final int BACK_LEFT_TALON = 0;
    public static final int FRONT_RIGHT_TALON = 0;
    public static final int BACK_RIGHT_TALON = 0;
    public static final int DRIVE_ENCODER_1 = 0;
    public static final int DRIVE_ENCODER_2 = 0;
    public static final double WHEEL_DIAMETER = 0;

    public static final double AUTONOMOUS_DRIVE_DESTINATION = 0;

    public static final int ELEVATOR_TOP_DI_PORT = 7;
    public static final int ELEVATOR_BOTTOM_DI_PORT = 8;
    public static final int ELEVATOR_LEFT_WHEEL_PORT = 5;
    public static final int ELEVATOR_RIGHT_WHEEL_PORT = 6;
    public static final int DOOR_RELAY_PORT = 9;
    public static final int DOOR_TOP_DI_PORT = 10;
    public static final int DOOR_BOTTOM_DI_PORT = 11;

    public static final long SLEEP_BETWEEN_DOOR_OPEN_AND_CLOSE = 2000;

    public static final double DRIVE_PID_TOLERANCE = 0;
    public static final double DRIVER_KP = 0;
    public static final double DRIVER_KI = 0;
    public static final double DRIVER_KD = 0;
    public static final long DRIVER_DT = 0;
    public static final int ENCODER_TICKS_IN_CYCLE = 0;

}
