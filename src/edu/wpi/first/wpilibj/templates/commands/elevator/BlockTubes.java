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
public class BlockTubes extends CommandBase{
    
    public BlockTubes(){
        requires(blocker);
    }
    
    protected void initialize() {
        
    }

    protected void execute() {
       blocker.block();
    }

    protected boolean isFinished() {
        return blocker.isBlocking();
    }

    protected void end() {
        blocker.stop();
    }

    protected void interrupted() {
        end();
    }
    
}
