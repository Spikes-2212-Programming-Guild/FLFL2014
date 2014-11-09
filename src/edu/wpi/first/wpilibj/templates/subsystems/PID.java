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

    private final double KP, KI, KD, dest;
    private double error, prevError, p, i, d;
    private final long dt;
    private final In in;
    private final Out out;
    // Put methods for controlling this subsystem
    // here. Call these from Commands.

    public PID(double dest, double kp, double ki, double kd, long dt, In in, Out out) {
        this.error = this.dest = dest;
        this.KP = kp;
        this.KI = ki;
        this.KD = kd;
        this.dt = dt;
        this.in = in;
        this.out = out;
    }

    public void doPID() {
        prevError = error;
        error = dest - in.get();
        p = KP * error;
        i += KI * dt * error;
        d = (error - prevError) / dt * KD;
        out.set(p + i + d);
        try {
            Thread.sleep(dt);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
    }

    public boolean hasArrived() {
        return Math.abs(error) < RobotMap.DRIVE_PID_TOLERANCE;
    }

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
    
}
