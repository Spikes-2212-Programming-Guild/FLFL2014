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
public class DriveTrain extends Subsystem implements PIDIn, PIDOut {

    private Gearbox left, right;
    private Encoder encoderRight;
    private Encoder encoderLeft;
    private DigitalInput arrivedLeft, arrivedRight;
    private double wheelDiameter;

    public DriveTrain(Gearbox left, Gearbox right, Encoder encoderRight, Encoder encoderLeft, DigitalInput arrivedLeft, DigitalInput arrivedRight, double wheelDiameter) {
        this.left = left;
        this.right = right;
        this.encoderRight = encoderRight;
        this.encoderLeft = encoderLeft;
        this.arrivedLeft = arrivedLeft;
        this.arrivedRight = arrivedRight;
        this.wheelDiameter = wheelDiameter;
    }

    public DriveTrain(int frontLeftPort, int backLeftPort, int frontRightPort, int backRightPort, int encoderRightPort1, int encoderRightPort2, int encoderLeftPort1, int encoderLeftPort2, int arrivedLeftPort, int arrivedRightPort, double wheelDiameter) {
        this(new Gearbox(frontLeftPort, backLeftPort), new Gearbox(frontRightPort, backRightPort),
                new Encoder(encoderRightPort1, encoderRightPort2), new Encoder(encoderLeftPort1, encoderLeftPort2),
                new DigitalInput(arrivedLeftPort), new DigitalInput(arrivedRightPort),
                wheelDiameter);

    }

    public void twoJoystickDrive(double leftSpeed, double rightSpeed) {
        left.setSpeed(-leftSpeed);
        right.setSpeed(-rightSpeed);
    }

    public void protectedTwoJoystickDrive(double leftSpeed, double rightSpeed) {
        // if not arrived at left or not moving forward
        if (arrivedLeft() || leftSpeed > 0) {
            left.setSpeed(-leftSpeed);
        } else {
            left.setSpeed(0);
        }
        // if not arrived at right or not moving forward
        if (arrivedRight() || rightSpeed < 0) {
            right.setSpeed(-rightSpeed);
        } else {
            right.setSpeed(0);
        }
    }

    public void straight(double speed) {
        twoJoystickDrive(speed, -speed);
    }

    public void protectedStraight(double speed) {
        protectedTwoJoystickDrive(speed, -speed);
    }

    public void rotate(double speed) {
        left.setSpeed(speed);
        right.setSpeed(speed);
    }

    public boolean arrivedLeft() {
        return !arrivedLeft.get();
    }

    public boolean arrivedRight() {
        return !arrivedRight.get();
    }

    protected void initDefaultCommand() {
        setDefaultCommand(new TwoJoystickDrive());
    }

    public void goBackALittle() {
        long currentTime = System.currentTimeMillis();
        while (currentTime - System.currentTimeMillis() < RobotMap.A_LITTLE_BACKWARDS_TIMEOUT) {
            straight(-0.2);
        }
    }

    public double get() {
        return (encoderRight.get() / RobotMap.ENCODER_TICKS_IN_CYCLE) * (Math.PI * wheelDiameter);
    }

    public void set(double output) {
        protectedStraight(output);
    }

}
