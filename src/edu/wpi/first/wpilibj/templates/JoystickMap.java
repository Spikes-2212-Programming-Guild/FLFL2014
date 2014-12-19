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
    
    public static final Joystick driveLeft = new Joystick(JOYSTICK_LEFT_DRIVE_PORT);
    public static final Joystick driveRight = new Joystick(JOYSTICK_DRIVE_RIGHT_PORT);
    public static final Joystick navJoystick = new Joystick(JOYSTICK_NAV_PORT);
    
    public static final Button LEFT_ALIGN = new JoystickButton(driveLeft, 2);
    public static final Button RIGHT_ALIGN = new JoystickButton(driveRight, 2);
    
    public static final Button ELEVATOR_UP = new JoystickButton(navJoystick, 1);
    public static final Button ELEVATOR_DOWN = new JoystickButton(navJoystick, 2);
    public static final Button DOOR_OPEN = new JoystickButton(navJoystick, 5);
    public static final Button DOOR_CLOSE = new JoystickButton(navJoystick, 3);
    
    public static final Button TANK_STRAIGHT = new JoystickButton(driveRight, 1);
    public static final Button TANK_ROTATE = new JoystickButton(driveRight, 2);
    
    public static final Button BLOCK_TUBES = new JoystickButton(navJoystick, 6);
    public static final Button UNBLOCK_TUBES = new JoystickButton(navJoystick, 4);
    
    public static final Button SCORE_TUBES = new JoystickButton(navJoystick, 9);
    
}
