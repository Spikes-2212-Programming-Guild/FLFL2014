/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.wpi.first.wpilibj.templates.subsystems;

import driveComponents.Gearbox;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.templates.commands.drive.TwoJoystickDrive;

/**
 *
 * @author Developer
 */
public class DriveTrain extends Subsystem{
    
    private Gearbox left,right;
    
    public DriveTrain (Gearbox left, Gearbox right){
        this.left= left;
        this.right= right;
    }
    
    public DriveTrain(int frontLeftPort, int backLeftPort, int frontRightPort, int backRightPort) {
        this(new Gearbox(frontLeftPort, backLeftPort), new Gearbox(frontRightPort, backRightPort));
    }
    
    public void straight(double speed){
        twoJoystickDrive(speed, -speed);
    }
    
    public void rotate (double speed){
        twoJoystickDrive(speed, speed);
    }
    
    public void twoJoystickDrive(double leftSpeed, double rightSpeed) {
        left.setSpeed(leftSpeed);
        right.setSpeed(rightSpeed);
    }

    protected void initDefaultCommand() {
        setDefaultCommand(new TwoJoystickDrive());
    }
    
}
