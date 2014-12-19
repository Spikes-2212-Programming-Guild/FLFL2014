/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.wpi.first.wpilibj.templates.commands.override;

import edu.wpi.first.wpilibj.templates.RobotMap;
import edu.wpi.first.wpilibj.templates.commands.elevator.*;
import edu.wpi.first.wpilibj.templates.commands.CommandBase;

/**
 *
 * @author eyal
 */
public class CloseDoorOverride extends CommandBase {
    
    public CloseDoorOverride(){
        requires(door);
    }

    protected void initialize() {
        setTimeout(RobotMap.DOOR_DELAY);
    }

    protected void execute() {
        door.closeDoor();
    }

    protected boolean isFinished() {
        return isTimedOut();
    }

    protected void end() {
        door.stop();
    }

    protected void interrupted() {
        end();
    }
    
}
