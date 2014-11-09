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
public class DriveRotate extends CommandBase{
    
    public DriveRotate (){
       requires(driveTrain);
    }
    public void execute(){
        driveTrain.rotate(oi.getRightX());
    }
    
    protected boolean isFinished() {
        return false;
    }

    protected void end() {
        driveTrain.rotate(0);
    }

    protected void interrupted() {
        end();
    }

    protected void initialize() {
    }

    
}