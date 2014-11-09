/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.wpi.first.wpilibj.templates;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.Button;
import edu.wpi.first.wpilibj.buttons.JoystickButton;

/**
 *
 * @author dvir42
 */
public class JoystickMap {
    
    private static final int JOYSTICK_LEFT_DRIVE_PORT = 1;
    private static final int JOYSTICK_DRIVE_RIGHT_PORT = 2;
    private static final int JOYSTICK_NAV_PORT = 3;    
    
    static final Joystick driveLeft = new Joystick(JOYSTICK_LEFT_DRIVE_PORT);
    static final Joystick driveRight = new Joystick(JOYSTICK_DRIVE_RIGHT_PORT);
    static final Joystick navJoystick = new Joystick(JOYSTICK_NAV_PORT);
    
    static final Button ELEVATOR_UP = new JoystickButton(navJoystick, 2);
    static final Button ELEVATOR_DOWN = new JoystickButton(navJoystick, 3);
    static final Button DOOR_OPEN = new JoystickButton(navJoystick, 4);
    static final Button DOOR_CLOSE = new JoystickButton(navJoystick, 5);
    
    static final Button TANK_STRAIGHT = new JoystickButton(driveRight, 1);
    static final Button TANK_ROTATE = new JoystickButton(driveRight, 2);
    
}
