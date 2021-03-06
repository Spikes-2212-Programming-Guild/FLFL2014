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
 * @author obama
 */
public class BlockTubes extends CommandBase{
    
    public BlockTubes(){
        requires(blocker);
    }
    
    protected void initialize() {
        setTimeout(RobotMap.BLOCKER_TIMEOUT);
    }

    protected void execute() {
       blocker.block();
    }

    protected boolean isFinished() {
        if(overriding)
            return isTimedOut();
        return blocker.isBlocking() || isTimedOut();
    }

    protected void end() {
        blocker.stop();
    }

    protected void interrupted() {
        end();
    }
    
}
