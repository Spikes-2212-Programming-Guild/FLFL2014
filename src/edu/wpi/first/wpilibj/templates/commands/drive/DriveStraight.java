/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.wpi.first.wpilibj.templates.commands.drive;

import edu.wpi.first.wpilibj.templates.JoystickMap;
import edu.wpi.first.wpilibj.templates.commands.CommandBase;

/**
 *
 * @author Developer
 */
public class DriveStraight extends CommandBase {

    public DriveStraight() {
        requires(driveTrain);
    }

    public void execute() {
        if (JoystickMap.RIGHT_ALIGN.get()) {
            driveTrain.protectedStraight(oi.getRightY());
        } else {
            driveTrain.straight(oi.getRightY());
        }
    }

    protected boolean isFinished() {
        return false;
    }

    protected void end() {
        if (JoystickMap.RIGHT_ALIGN.get()) {
            driveTrain.goBackALittle();
        }
        driveTrain.straight(0);
    }

    protected void interrupted() {
        end();
    }

    protected void initialize() {
    }
}
