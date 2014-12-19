/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.wpi.first.wpilibj.templates.subsystems;

import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.Jaguar;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.templates.RobotMap;

/**
 *
 * @author eyal
 */
public class Elevator extends Subsystem {

    private DigitalInput top;
    private DigitalInput bottom;
    private Jaguar wheel;
    
    
    //TOCHACK: there is tow Relays on the robot.
    public Elevator(Jaguar wheel, DigitalInput top, DigitalInput bottom){
        this.wheel = wheel;
        this.top = top;
        this.bottom = bottom;
    }
    
    public Elevator(int wheelPort, int topDIPort, int bottomDIPort){
        this(new Jaguar(wheelPort), new DigitalInput(topDIPort), new DigitalInput(bottomDIPort));
    }
    
    public void goUp() {
        wheel.set(RobotMap.ELEVATOR_UP_SPEED);
    }

    public void goDown() {
        wheel.set(RobotMap.ELEVATOR_DOWN_SPEED);
    }

    protected void initDefaultCommand() {
    }

    public void stop() {
        wheel.set(0);
    }
    
    public boolean isUp() {
        return top.get();
    }
    
    public boolean isDown() {
        return bottom.get();
    }
    
}
