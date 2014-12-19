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
 * @author obama
 */
public class UnblockTubesOverride extends CommandBase{

    public UnblockTubesOverride() {
        requires(blocker);
    }
    
    protected void initialize() {
        setTimeout(RobotMap.BLOCKER_DELAY);
    }

    protected void execute() {
        blocker.unblock();
    }

    protected boolean isFinished() {
       return isTimedOut();
    }

    protected void end() {
        blocker.stop();
    }

    protected void interrupted() {
        end();
    }
    
}
