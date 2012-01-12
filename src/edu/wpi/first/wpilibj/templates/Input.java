/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.wpi.first.wpilibj.templates;

import edu.wpi.first.wpilibj.Joystick;

/**
 *
 * @author Matt
 */
public class Input {
    private Joystick leftJoystick;
    private Joystick rightJoystick;
    
    static final public int yAxis = 0;
    static final public int xAxis = 1;
    static final public int right = 2;
    static final public int left = 3;
    
    public Input(){
        this.leftJoystick = new Joystick(1);
        this.rightJoystick = new Joystick(2);
    }
    
    public double getAxis(int joystick,int axis ){
        Joystick curJoystick;
        switch(joystick){
            case left:
                curJoystick = this.leftJoystick;
                break;
            case right:
                curJoystick = this.rightJoystick;
                break;
            default:
                System.out.println("Unexpected joystick value");
                return -1;
                
        }
        
        switch(axis){
            case xAxis:
                return curJoystick.getX() *-1;
            case yAxis:
                return curJoystick.getY() *-1;
            default:
                System.out.println("Unexpected joystick value");
                return -1;
        }
        
    }
}
