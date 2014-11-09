/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package driveComponents;
import edu.wpi.first.wpilibj.*;
/**
 *
 * @author Developer
 */
public class Gearbox {
    
    private Talon front, back;
    
    public Gearbox (Talon front, Talon back){
        this.front= front;
        this.back= back;
    }
    public Gearbox (int frontPort, int backPort){
        this(new Talon(frontPort), new Talon (backPort));
    }
    
    public void setSpeed (double speed){
        front.set(speed);
        back.set(speed);
    }

}
