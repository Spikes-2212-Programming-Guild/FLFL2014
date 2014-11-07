package edu.wpi.first.wpilibj.templates;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {

    public static final int LEFT_TALON_1 = 0;
    public static final int LEFT_TALON_2 = 0;
    public static final int RIGHT_TALON_1 = 0;
    public static final int RIGHT_TALON_2 = 0;
    // For example to map the left and right motors, you could define the
    // following variables to use with your drivetrain subsystem.
    // public static final int leftMotor = 1;
    // public static final int rightMotor = 2;
    
    // If you are using multiple modules, make sure to define both the port
    // number and the module. For example you with a rangefinder:
    // public static final int rangefinderPort = 1;
    // public static final int rangefinderModule = 1;
    public static final int joystick2Port=2;        
    public static final int topDIPort=7;
    public static final int bottomDIPort=8;
    public static final int leftWheelPort=5;
    public static final int rightWheelPort=6;
    public static final int doorRelayPort=9;
    public static final int doorTopPort=10;
    public static final int doorBottomPort=11;    
}
