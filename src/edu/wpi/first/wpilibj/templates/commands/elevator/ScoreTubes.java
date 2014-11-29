/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.wpi.first.wpilibj.templates.commands.elevator;

import edu.wpi.first.wpilibj.command.CommandGroup;
import edu.wpi.first.wpilibj.templates.RobotMap;
import edu.wpi.first.wpilibj.templates.commands.WaitForDoor;

/**
 *
 * @author AtidSpikes
 */
public class ScoreTubes extends CommandGroup {

    public ScoreTubes() {
        addSequential(new ElevatorUp());
        addSequential(new OpenDoor());
        addSequential(new WaitForDoor());
        addSequential(new CloseDoor());
        addSequential(new ElevatorDown());
    }

}
