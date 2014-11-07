package edu.wpi.first.wpilibj.templates;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.Button;
import edu.wpi.first.wpilibj.buttons.DigitalIOButton;
import edu.wpi.first.wpilibj.buttons.JoystickButton;
import edu.wpi.first.wpilibj.templates.commands.*;
import edu.wpi.first.wpilibj.templates.commands.drive.DriveRotate;
import edu.wpi.first.wpilibj.buttons.JoystickButton;
import edu.wpi.first.wpilibj.templates.commands.placeGentely.CloseDoor;
import edu.wpi.first.wpilibj.templates.commands.placeGentely.ElevatorDown;
import edu.wpi.first.wpilibj.templates.commands.placeGentely.ElevatorUp;
import edu.wpi.first.wpilibj.templates.commands.placeGentely.OpenDoor;

/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {

    private static class joy {

        public joy() {
        }
    }
    //// CREATING BUTTONS
    // One type of button is a joystick button which is any button on a joystick.
    // You create one by telling it which joystick it's on and which button
    // number it is.
    // Joystick stick = new Joystick(port);
    // Button button = new JoystickButton(stick, buttonNumber);

    // Another type of button you can create is a DigitalIOButton, which is
    // a button or switch hooked up to the cypress module. These are useful if
    // you want to build a customized operator interface.
    // Button button = new DigitalIOButton(1);
    // There are a few additional built in buttons you can use. Additionally,
    // by subclassing Button you can create custom triggers and bind those to
    // commands the same as any other Button.
    //// TRIGGERING COMMANDS WITH BUTTONS
    // Once you have a button, it's trivial to bind it to a button in one of
    // three ways:
    // Start the command when the button is pressed and let it run the command
    // until it is finished as determined by it's isFinished method.
    // button.whenPressed(new ExampleCommand());
    // Run the command while the button is being held down and interrupt it once
    // the button is released.
    // button.whileHeld(new ExampleCommand());
    // Start the command when the button is released  and let it run the command
    // until it is finished as determined by it's isFinished method.
    // button.whenReleased(new ExampleCommand());
    Joystick joy2 = new Joystick(RobotMap.joystick2Port);
    Button elUp = new JoystickButton(joy2, 2);
    Button elDown = new JoystickButton(joy2, 3);
    Button openDoor = new JoystickButton(joy2, 4);
    Button closeDoor = new JoystickButton(joy2, 5);
    Joystick joy = new Joystick(1);
    Button trigger = new JoystickButton(joy, 1);

    public OI() {
        elUp.whenPressed(new ElevatorUp());
        elDown.whenPressed(new ElevatorDown());
        openDoor.whenPressed(new OpenDoor());
        closeDoor.whenPressed(new CloseDoor());
        trigger.whileHeld(new DriveRotate());
    }

    public double getX() {
        return joy.getX();
    }

    public double getY() {
        return joy.getY();
    }

}
