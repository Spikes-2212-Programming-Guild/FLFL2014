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
public class ElevatorDown extends CommandBase{

    public ElevatorDown(){
        requires(elevator);
    }
    
    protected void initialize() {
        setTimeout(RobotMap.ELEVATOR_DOWN_TIMEOUT);
    }

    protected void execute() {
        elevator.goDown();
    }

    protected void end() {
        elevator.stop();
    }
    
    public void interrupted(){
        end();
    }
      
    public boolean isFinished() {
        if(overriding)
            return isTimedOut();
        return elevator.isDown() || isTimedOut();
    } 
    
}
