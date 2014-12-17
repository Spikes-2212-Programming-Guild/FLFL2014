/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.wpi.first.wpilibj.templates.commands.elevator;

import edu.wpi.first.wpilibj.templates.commands.CommandBase;

/**
 *
 * @author obama
 */
public class UnblockTubes extends CommandBase{

    public UnblockTubes() {
        requires(blocker);
    }
    
    protected void initialize() {
    }

    protected void execute() {
        blocker.unblock();
    }

    protected boolean isFinished() {
       return blocker.isNotBlocking();
    }

    protected void end() {
        blocker.stop();
    }

    protected void interrupted() {
        end();
    }
    
}
