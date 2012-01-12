/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.wpi.first.wpilibj.templates;

import edu.wpi.first.wpilibj.CANJaguar;
import edu.wpi.first.wpilibj.can.CANTimeoutException;

/**
 *
 * @author Matt
 */
public class Output {
    
    public CANJaguar left;
    public CANJaguar right;
    
    public Output(){
        try{
            this.left = new CANJaguar(3);
            this.right = new CANJaguar(4);
        }catch(CANTimeoutException e){
            System.out.println("Could not initiate jaguars");
        }
       
    }
    
    public void setMotors(double leftVal, double rightVal){
        try{
            this.left.setX(leftVal);
            this.right.setX(rightVal);
        }catch(CANTimeoutException e){
            System.out.println("Could not set motors");
        }
    }
}
