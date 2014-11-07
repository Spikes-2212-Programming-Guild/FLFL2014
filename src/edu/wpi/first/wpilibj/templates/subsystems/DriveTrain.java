/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.wpi.first.wpilibj.templates.subsystems;

import driveComponents.Gearbox;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.templates.commands.drive.DriveStraight;

/**
 *
 * @author Developer
 */
public class DriveTrain extends Subsystem{
    Gearbox left,right;
    public DriveTrain (Gearbox left, Gearbox right){
        this.left= left;
        this.right= right;
    }
    public DriveTrain(int p1, int p2, int p3, int p4) {
        this(new Gearbox(p1, p2),new Gearbox(p3, p4));
    }
    public void straight(double speed){
        left.setSpeed(speed);
        right.setSpeed(-speed);
    }
    public void rotate (double speed){
        left.setSpeed(speed);
        right.setSpeed(speed);
    }

    protected void initDefaultCommand() {
        setDefaultCommand(new DriveStraight());
    }
    
}
