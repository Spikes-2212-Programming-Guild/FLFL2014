/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.wpi.first.wpilibj.templates.commands.elevator;

import edu.wpi.first.wpilibj.command.CommandGroup;
import edu.wpi.first.wpilibj.templates.RobotMap;

/**
 *
 * @author AtidSpikes
 */
public class ScoreTubes extends CommandGroup {

    public ScoreTubes() {
        addSequential(new ElevatorUp());
        addSequential(new OpenDoor());
        try {
            Thread.sleep(RobotMap.SLEEP_BETWEEN_DOOR_OPEN_AND_CLOSE);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
        addSequential(new CloseDoor());
        addSequential(new ElevatorDown());
    }
    
}
