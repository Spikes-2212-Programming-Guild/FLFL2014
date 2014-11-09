/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.wpi.first.wpilibj.templates.commands.elevator;

import edu.wpi.first.wpilibj.templates.commands.CommandBase;

/**
 *
 * @author eyal
 */
public class CloseDoor extends CommandBase {
    
    public CloseDoor(){
        requires(door);
    }

    protected void initialize() {
    }

    protected void execute() {
        door.closeDoor();
    }

    protected boolean isFinished() {
        return door.isClosed();
    }

    protected void end() {
        door.stop();
    }

    protected void interrupted() {
        end();
    }
    
}
