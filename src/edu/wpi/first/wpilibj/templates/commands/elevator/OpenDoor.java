/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.wpi.first.wpilibj.templates.commands.elevator;

import edu.wpi.first.wpilibj.templates.RobotMap;
import edu.wpi.first.wpilibj.templates.commands.CommandBase;

/**
 *
 * @author eyal
 */
public class OpenDoor extends CommandBase{

    public OpenDoor(){
        requires(door);
    }
    
    protected void initialize() {
        setTimeout(RobotMap.DOOR_TIMEOUT);
    }

    protected void execute() {
        door.openDoor();
    }

    protected boolean isFinished() {
        if(overriding)
            return isTimedOut();
        return door.isOpen() || isTimedOut();
    }

    protected void end() {
        door.stop();
    }

    protected void interrupted() {
        end();
    }

}
