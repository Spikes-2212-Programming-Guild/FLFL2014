/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.wpi.first.wpilibj.templates.commands.drive;

import edu.wpi.first.wpilibj.templates.commands.CommandBase;

/**
 *
 * @author dvir42
 */
public class TwoJoystickDrive extends CommandBase {

    public TwoJoystickDrive() {
        requires(driveTrain);
    }
    
    protected void initialize() {
    }

    protected void execute() {
        driveTrain.twoJoystickDrive(oi.getLeftY(), oi.getRightY());
    }

    protected boolean isFinished() {
        return false;
    }

    protected void end() {
        driveTrain.twoJoystickDrive(0, 0);
    }

    protected void interrupted() {
        end();
    }
    
}
