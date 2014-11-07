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
       requires(dt);
    }
    public void execute(){
        dt.rotate(oi.getX());
    }
    
    protected boolean isFinished() {
        return false;
    }

    protected void end() {
        dt.rotate(0);
    }

    protected void interrupted() {
        end();
    }

    protected void initialize() {
    }

    
}