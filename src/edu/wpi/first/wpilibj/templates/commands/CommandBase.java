package edu.wpi.first.wpilibj.templates.commands;

import edu.wpi.first.wpilibj.templates.subsystems.DriveTrain;
import driveComponents.Gearbox;
import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj.templates.OI;
import edu.wpi.first.wpilibj.templates.RobotMap;
import edu.wpi.first.wpilibj.templates.subsystems.Door;
import edu.wpi.first.wpilibj.templates.subsystems.Elevator;
import edu.wpi.first.wpilibj.templates.subsystems.PID;

/**
 * The base for all commands. All atomic commands should subclass CommandBase.
 * CommandBase stores creates and stores each control system. To access a
 * subsystem elsewhere in your code in your code use
 * CommandBase.exampleSubsystem
 *
 * @author Author
 */
public abstract class CommandBase extends Command {

    public static OI oi;
    public static DriveTrain driveTrain = new DriveTrain(RobotMap.LEFT_TALON_1, RobotMap.LEFT_TALON_2, RobotMap.RIGHT_TALON_1, RobotMap.RIGHT_TALON_2,RobotMap.DRIVE_ENCODER_1,RobotMap.DRIVE_ENCODER_2,RobotMap.DESTINATION);
    public static PID drivePID=new PID(RobotMap.DESTINATION, RobotMap.DRIVER_KP, RobotMap.DRIVER_KI, RobotMap.DRIVER_KD, RobotMap.DRIVER_DT, driveTrain, driveTrain);
    public static Door door = new Door(RobotMap.doorRelayPort, RobotMap.doorTopPort, RobotMap.doorBottomPort);
    public static Elevator elevator = new Elevator(RobotMap.leftWheelPort, RobotMap.rightWheelPort);

    // Create a single static instance of all of your subsystems
    public static void init() {
        // This MUST be here. If the OI creates Commands (which it very likely
        // will), constructing it during the construction of CommandBase (from
        // which commands extend), subsystems are not guaranteed to be
        // yet. Thus, their requires() statements may grab null pointers. Bad
        // news. Don't move it.
        oi = new OI();

        // Show what command your subsystem is running on the SmartDashboard
    }

    public CommandBase(String name) {
        super(name);

    }

    public CommandBase() {
        super();

    }
}
