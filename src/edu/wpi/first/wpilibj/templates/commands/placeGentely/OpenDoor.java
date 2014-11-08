/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.wpi.first.wpilibj.templates.commands.placeGentely;

import edu.wpi.first.wpilibj.templates.RobotMap;
import edu.wpi.first.wpilibj.templates.commands.CommandBase;
import edu.wpi.first.wpilibj.templates.subsystems.placeGentely.Door;

/**
 *
 * @author eyal
 */
public class OpenDoor extends CommandBase{

    public OpenDoor(){
        requires(door);
    }
    
    protected void initialize() {
    }

    protected void execute() {
        door.openDoor();
    }

    protected boolean isFinished() {
        return Door.doorTop.get();
    }

    protected void end() {
        door.stop();
    }

    protected void interrupted() {
        end();
    }

}
