/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.wpi.first.wpilibj.templates.subsystems;

import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.templates.RobotMap;

/**
 *
 * @author AtidSpikes
 */
public class PID extends Subsystem {

    private double kp, ki, kd, error, prevError, p, i, d;
    private long dt;
    In in;
    Out out;
    // Put methods for controlling this subsystem
    // here. Call these from Commands.

    public PID(double dest, double kp, double ki, double kd, long dt, In in, Out out) {
        this.error = dest;
        this.kp = kp;
        this.ki = ki;
        this.kd = kd;
        this.dt = dt;
        this.in = in;
        this.out = out;
    }

    public void PIDed() {
        prevError = error;
        error = in.get();
        p = kp * error;
        i += ki * dt * error;
        d = (error - prevError) / dt * kd;
        out.set(p + i + d);
        try {
            Thread.sleep(dt);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
    }

    public boolean hasArrived() {
        return -RobotMap.DRIVE_PID_TOLERANCE<error&&error<RobotMap.DRIVE_PID_TOLERANCE;
    }

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
}
