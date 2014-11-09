/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.wpi.first.wpilibj.templates.commands.drive;

import edu.wpi.first.wpilibj.templates.commands.CommandBase;

/**
 *
 * @author Developer
 */
public class DriveStraight extends CommandBase{
    
    public DriveStraight (){
       requires(driveTrain);
    }
    public void execute(){
        driveTrain.straight(oi.getRightY());
    }
    
    protected boolean isFinished() {
        return false;
    }

    protected void end() {
        driveTrain.straight(0);
    }

    protected void interrupted() {
        end();
    }

    protected void initialize() {
    }

    
}
