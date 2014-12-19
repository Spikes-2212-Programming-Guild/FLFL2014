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
public class ElevatorUpOverride extends CommandBase{
    
    public ElevatorUpOverride(){
        requires(elevator);
    }
    
    protected void initialize() {
        setTimeout(RobotMap.ELEVATOR_DELAY);
    }

    protected void execute() {
        elevator.goUp();
    }

    protected void end() {
        elevator.stop();
    }
    
    public void interrupted(){
        end();
    }
      
    public boolean isFinished() {
       return isTimedOut();
    } 
    
}
