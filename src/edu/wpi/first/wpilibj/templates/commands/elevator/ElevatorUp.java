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
public class ElevatorUp extends CommandBase{
    
    public ElevatorUp(){
        requires(elevator);
    }
    
    protected void initialize() {
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
       return elevator.isUp();
    } 
    
}
