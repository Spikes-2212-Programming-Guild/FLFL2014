/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.wpi.first.wpilibj.templates.commands.PIDdrive;

import edu.wpi.first.wpilibj.templates.commands.CommandBase;

/**
 *
 * @author AtidSpikes
 */
public class DriveTo extends CommandBase {
    
    public DriveTo() {
        requires(driveTrain);
        requires(drivePID);
        
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
        drivePID.doPID();
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return drivePID.hasArrived();
    }

    // Called once after isFinished returns true
    protected void end() {
        driveTrain.straight(0);
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
        end();
    }
    
}
