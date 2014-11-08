/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.wpi.first.wpilibj.templates.subsystems.placeGentely;

import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.Relay;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.templates.RobotMap;

/**
 *
 * @author eyal
 */
public class Elevator extends Subsystem {
    public DigitalInput top = new DigitalInput(RobotMap.topDIPort);
    public DigitalInput bottom = new DigitalInput(RobotMap.bottomDIPort);    
    Relay rightWheel, leftWheel;
    
    public Elevator(Relay leftWheel, Relay rightWheel){
        this.leftWheel=leftWheel;
        this.rightWheel=rightWheel;
    }
    
    public Elevator(int leftWheelPort, int rightWheelPort){
        this(new Relay(leftWheelPort), new Relay(rightWheelPort));
    }
    
    public void goUp() {
       if(top.get()){
            rightWheel.set(Relay.Value.kForward);
            leftWheel.set(Relay.Value.kForward); 
       }
    }

    public void goDown() {
        if(bottom.get()){
            rightWheel.set(Relay.Value.kReverse);
            leftWheel.set(Relay.Value.kReverse);
        }
    }

    protected void initDefaultCommand() {
        stop();
    }

    public void stop() {
        rightWheel.set(Relay.Value.kOff);
        leftWheel.set(Relay.Value.kOff);        
    }
    
}
