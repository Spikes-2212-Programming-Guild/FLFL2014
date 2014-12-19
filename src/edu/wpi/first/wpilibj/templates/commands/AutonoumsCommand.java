/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.wpi.first.wpilibj.templates.commands;

import edu.wpi.first.wpilibj.command.CommandGroup;
import edu.wpi.first.wpilibj.templates.commands.PIDdrive.DriveTo;
import edu.wpi.first.wpilibj.templates.commands.elevator.ProtectedElevatorUp;
import edu.wpi.first.wpilibj.templates.commands.elevator.ScoreTubes;
import edu.wpi.first.wpilibj.templates.commands.imageProcessing.WriteImage;

/**
 *
 * @author AtidSpikes
 */
public class AutonoumsCommand extends CommandGroup {

    public AutonoumsCommand() {
        addSequential(new WriteImage());
        addParallel(new ProtectedElevatorUp());
        addSequential(new DriveTo());
        addSequential(new ScoreTubes());
    }
    
}
