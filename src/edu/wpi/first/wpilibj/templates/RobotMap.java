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
//    driveTrain
    public static final int FRONT_LEFT_JAGUAR = 1;
    public static final int BACK_LEFT_JAGUAR = 2;
    public static final int FRONT_RIGHT_JAGUAR = 9;
    public static final int BACK_RIGHT_JAGUAR = 10;
    public static final int DRIVE_ENCODER_RIGHT_1 = 11;
    public static final int DRIVE_ENCODER_RIGHT_2 = 12;
    public static final int DRIVE_ENCODER_LEFT_1 = 13;
    public static final int DRIVE_ENCODER_LEFT_2 = 14;
    public static final int ARRIVED_LEFT_PORT = 6;
    public static final int ARRIVED_RIGHT_PORT = 5;
    public static final double WHEEL_DIAMETER = 8 * 2.54;
//    elevator
    public static final int ELEVATOR_TOP_DI_PORT = 2;
    public static final int ELEVATOR_BOTTOM_DI_PORT = 3;
    public static final int ELEVATOR_WHEEL_PORT = 3;
    public static final double ELEVATOR_UP_SPEED = 0.5;
    public static final double ELEVATOR_DOWN_SPEED = -0.4;
    public static final int ELEVATOR_UP_TIMEOUT = 5;
    public static double ELEVATOR_DOWN_TIMEOUT = 5;

    // blocker
    public static final int BLOCKER_RELAY_PORT = 2;
    public static final int BLOCKER_TOP_DI_PORT = 4;
    public static final int BLOCKER_BOTTOM_DI_PORT = 9;
    public static final int BLOCKER_TIMEOUT = 2;
//    door
    public static final int DOOR_RELAY_PORT = 1;
    public static final int DOOR_TOP_DI_PORT = 8;
    public static final int DOOR_BOTTOM_DI_PORT = 7;
    public static final int DOOR_TIMEOUT = 2;
    public static final long SLEEP_BETWEEN_DOOR_OPEN_AND_CLOSE = 1300;
//    driving PID
    public static final double DRIVE_PID_TOLERANCE = 0;
    public static final double DRIVER_KP = 0;
    public static final double DRIVER_KI = 0;
    public static final double DRIVER_KD = 0;
    public static final long DRIVER_DT = 0;
    public static final double AUTONOMOUS_DRIVE_DESTINATION = 0;
    public static final int ENCODER_TICKS_IN_CYCLE = 70;
    public static final int PID_TIMEOUT = 3;
    public static double BLOCKER_DELAY = 1;
    public static double DOOR_DELAY = 2;
    public static double ELEVATOR_DELAY = 5;
    public static long A_LITTLE_BACKWARDS_TIMEOUT = 500;
    
}
