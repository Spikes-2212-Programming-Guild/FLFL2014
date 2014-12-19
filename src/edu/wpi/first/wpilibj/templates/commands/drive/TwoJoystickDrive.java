/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.wpi.first.wpilibj.templates.commands.drive;

import edu.wpi.first.wpilibj.templates.JoystickMap;
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
        if (JoystickMap.driveRight.getRawButton(JoystickMap.ALIGN_BUTTON)) {
            driveTrain.protectedTwoJoystickDrive(oi.getLeftY(), -oi.getRightY());
        } else {
            driveTrain.twoJoystickDrive(oi.getLeftY(), -oi.getRightY());
        }
    }

    protected boolean isFinished() {
//        if aligning and arrived on both sides
        if (JoystickMap.driveRight.getRawButton(JoystickMap.ALIGN_BUTTON)) {
            return driveTrain.arrivedLeft() && driveTrain.arrivedRight();
        }
        return false;
    }

    protected void end() {
        if (JoystickMap.driveRight.getRawButton(JoystickMap.ALIGN_BUTTON)) {
            driveTrain.goBackALittle();
        }
        driveTrain.twoJoystickDrive(0, 0);
    }

    protected void interrupted() {
        end();
    }
}
