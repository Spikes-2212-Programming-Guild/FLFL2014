/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.wpi.first.wpilibj.templates.commands.imageProcessing;

import edu.wpi.first.wpilibj.camera.AxisCamera;
import edu.wpi.first.wpilibj.image.ColorImage;
import edu.wpi.first.wpilibj.image.NIVisionException;
import edu.wpi.first.wpilibj.templates.commands.CommandBase;

/**
 *
 * @author dvir42
 */
public class WriteImage extends CommandBase {

    private final AxisCamera camera;
    private boolean done;
    private ColorImage image;
    
    public WriteImage() {
        camera = AxisCamera.getInstance();
        done = false;
    }
    
    protected void initialize() {
        
    }

    protected void execute() {
        try {
            image = camera.getImage();
            image.write("robotframe.png");
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        done = true;
    }

    protected boolean isFinished() {
        return done;
    }

    protected void end() {
        try {
            image.free();
        } catch (NIVisionException ex) {
            ex.printStackTrace();
        }
    }

    protected void interrupted() {
        end();
    }    
}
