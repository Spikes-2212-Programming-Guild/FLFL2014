/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.wpi.first.wpilibj.templates.subsystems;

import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.Relay;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 * @author obama
 */
public class Blocker extends Subsystem{
    
    Relay blockerRelay;
    DigitalInput blockerTop; // assumed true if the Blocker blocks
    DigitalInput blockerBottom; // assumed true if the Blocker doesn't block

    public Blocker(Relay blockerRelay, DigitalInput blockerTop, DigitalInput blockerBottom) {
        this.blockerRelay = blockerRelay;
        this.blockerTop = blockerTop;
        this.blockerBottom = blockerBottom;
    }
    
    public Blocker(int relayPort, int topPort, int bottomPort){
        this(new Relay(relayPort), new DigitalInput(topPort),new DigitalInput(bottomPort));
    }
    
    public void block(){
        blockerRelay.set(Relay.Value.kForward);
    }
    
    public void unblock(){
        blockerRelay.set(Relay.Value.kReverse);
    }
    
    public void stop(){
        blockerRelay.set(Relay.Value.kOff);
    }
    
    public boolean isBlocking(){
        return blockerTop.get();
    }
    
    public boolean isNotBlocking(){
        return blockerBottom.get();
    }
    
    protected void initDefaultCommand() {
    }
    
    
    
}
