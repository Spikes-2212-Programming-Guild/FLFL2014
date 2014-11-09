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
    
    // Create a single static instance of all of your subsystems    
    public static DriveTrain driveTrain = new DriveTrain(RobotMap.FRONT_LEFT_TALON, RobotMap.BACK_LEFT_TALON, RobotMap.FRONT_RIGHT_TALON, RobotMap.BACK_RIGHT_TALON);
    public static Door door = new Door(RobotMap.DOOR_RELAY_PORT, RobotMap.DOOR_TOP_DI_PORT, RobotMap.DOOR_BOTTOM_DI_PORT);
    public static Elevator elevator = new Elevator(RobotMap.ELEVATOR_LEFT_WHEEL_PORT, RobotMap.ELEVATOR_RIGHT_WHEEL_PORT);

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
