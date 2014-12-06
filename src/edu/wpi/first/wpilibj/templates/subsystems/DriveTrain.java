/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.wpi.first.wpilibj.templates.subsystems;

import driveComponents.Gearbox;
import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.Encoder;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.templates.RobotMap;
import edu.wpi.first.wpilibj.templates.commands.drive.TwoJoystickDrive;

/**
 *
 * @author Developer
 */
public class DriveTrain extends Subsystem implements In, Out {

    private Gearbox left, right;
    private Encoder encoder;
    private DigitalInput arrivedLeft, arrivedRight;
    private double wheelDiameter;

    public DriveTrain(Gearbox left, Gearbox right, Encoder encoder, DigitalInput arrivedLeft, DigitalInput arrivedRight, double wheelDiameter) {
        this.left = left;
        this.right = right;
        this.encoder = encoder;
        this.arrivedLeft = arrivedLeft;
        this.arrivedRight = arrivedRight;
        this.wheelDiameter = wheelDiameter;
    }

    public DriveTrain(int frontLeftPort, int backLeftPort, int frontRightPort, int backRightPort, int encoderPort1, int encoderPort2, int arrivedLeftPort, int arrivedRightPort, double wheelDiameter) {
        this(new Gearbox(frontLeftPort, backLeftPort), new Gearbox(frontRightPort, backRightPort),
                new Encoder(encoderPort1, encoderPort2),
                new DigitalInput(arrivedLeftPort), new DigitalInput(arrivedRightPort),
                wheelDiameter);

    }

    public void twoJoystickDrive(double leftSpeed, double rightSpeed) {
//        if not arrived at left or not moving forward
        if (!arrivedLeft.get() || leftSpeed < 0) {
            left.setSpeed(leftSpeed);
        }
//        if not arrived at right or not moving forward
        if (!arrivedRight.get() || rightSpeed > 0) {
            right.setSpeed(rightSpeed);
        }
    }

    public void straight(double speed) {
        twoJoystickDrive(speed, -speed);
    }

    public void rotate(double speed) {
        left.setSpeed(speed);
        right.setSpeed(speed);
    }

    protected void initDefaultCommand() {
        setDefaultCommand(new TwoJoystickDrive());
    }

    public double get() {
        return (encoder.get() / RobotMap.ENCODER_TICKS_IN_CYCLE) * (Math.PI * wheelDiameter);
    }

    public void set(double speed) {
        straight(speed);
    }

}
