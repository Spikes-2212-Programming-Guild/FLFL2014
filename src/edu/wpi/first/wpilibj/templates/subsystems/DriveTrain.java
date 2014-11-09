/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.wpi.first.wpilibj.templates.subsystems;

import driveComponents.Gearbox;
import edu.wpi.first.wpilibj.Encoder;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.templates.commands.drive.TwoJoystickDrive;

/**
 *
 * @author Developer
 */
public class DriveTrain extends Subsystem implements In, Out {

    private Gearbox left, right;
    private Encoder encoder;
    private double destination;
    private double wheelDiameter;

    public DriveTrain(Gearbox left, Gearbox right, Encoder encoder, double wheelDiameter) {
        this.left = left;
        this.right = right;
        this.encoder = encoder;
        this.wheelDiameter = wheelDiameter;
        encoder.start();
    }

    public DriveTrain(int left1, int left2, int right1, int right2, int encoder1, int encoder2, double wheelDiameter) {
        this(new Gearbox(left1, left2), new Gearbox(right1, right2), new Encoder(encoder1, encoder2), wheelDiameter);
    }

    public void straight(double speed) {
        left.setSpeed(speed);
        right.setSpeed(-speed);
    }

    public void rotate(double speed) {
        left.setSpeed(speed);
        right.setSpeed(speed);
    }

    protected void initDefaultCommand() {
        setDefaultCommand(new TwoJoystickDrive());
    }

    public double get() {
        return destination-(encoder.get()*(Math.PI*wheelDiameter));
    }

    public void set(double s) {
        straight(s);
    }

    public void setDestination(double destination) {
        this.destination = destination;
    }

}
