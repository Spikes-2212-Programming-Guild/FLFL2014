/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.wpi.first.wpilibj.templates.subsystems;

import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.Relay;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.templates.RobotMap;

/**
 *
 * @author eyal
 */
public class Elevator extends Subsystem {
    private DigitalInput top = new DigitalInput(RobotMap.ELEVATOR_TOP_DI_PORT);
    private DigitalInput bottom = new DigitalInput(RobotMap.ELEVATOR_BOTTOM_DI_PORT);    
    private Relay rightWheel, leftWheel;
    
    public Elevator(Relay leftWheel, Relay rightWheel){
        this.leftWheel=leftWheel;
        this.rightWheel=rightWheel;
    }
    
    public Elevator(int leftWheelPort, int rightWheelPort){
        this(new Relay(leftWheelPort), new Relay(rightWheelPort));
    }
    
    public void goUp() {
        rightWheel.set(Relay.Value.kForward);
        leftWheel.set(Relay.Value.kForward);
    }

    public void goDown() {
        rightWheel.set(Relay.Value.kReverse);
        leftWheel.set(Relay.Value.kReverse);
    }

    protected void initDefaultCommand() {
    }

    public void stop() {
        rightWheel.set(Relay.Value.kOff);
        leftWheel.set(Relay.Value.kOff);        
    }
    
    public boolean isUp() {
        return top.get();
    }
    
    public boolean isDown() {
        return bottom.get();
    }
    
}
