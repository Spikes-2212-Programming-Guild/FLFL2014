/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.wpi.first.wpilibj.templates.commands.drive;

import edu.wpi.first.wpilibj.templates.commands.CommandBase;
import edu.wpi.first.wpilibj.templates.subsystems.DriveTrain;


/**
 *
 * @author Developer
 */
public class DriveStraight extends CommandBase{
    
    public DriveStraight (){
       requires(dt);
    }
    public void execute(){
        dt.straight(oi.getY());
    }
    
    protected boolean isFinished() {
        return false;
    }

    protected void end() {
        dt.straight(0);
    }

    protected void interrupted() {
        end();
    }

    protected void initialize() {
    }

    
}
