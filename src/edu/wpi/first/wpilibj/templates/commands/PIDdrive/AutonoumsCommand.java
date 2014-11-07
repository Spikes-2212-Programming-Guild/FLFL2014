/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.wpi.first.wpilibj.templates.commands.PIDdrive;

import edu.wpi.first.wpilibj.command.CommandGroup;
import edu.wpi.first.wpilibj.templates.commands.elevator.ElevatorUp;
import edu.wpi.first.wpilibj.templates.commands.elevator.ScoreTubes;

/**
 *
 * @author AtidSpikes
 */
public class AutonoumsCommand extends CommandGroup {

    public AutonoumsCommand() {
        addParallel(new ElevatorUp());
        addSequential(new DriveTo());
        addSequential(new ScoreTubes());
    }
}
