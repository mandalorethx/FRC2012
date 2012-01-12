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
    public CANJaguar topLeft;
    public CANJaguar topRight;
    public CANJaguar bottomLeft;
    public CANJaguar bottomRight;
    
    public Output(){
        try{
            this.topLeft = new CANJaguar(3);
            this.topRight = new CANJaguar(4);
            this.bottomLeft = new CANJaguar(5);
            this.bottomRight = new CANJaguar(6);
        }catch(CANTimeoutException e){
            System.out.println("Could not initiate jaguars");
        }
       
    }
    
    public void setMotors(double topLeft, double topRight, double bottomLeft, double bottomRight){
        try{
            this.topLeft.setX(topLeft);
            this.topRight.setX(topRight);
            this.bottomLeft.setX(bottomLeft);
            this.bottomRight.setX(bottomRight);
        }catch(CANTimeoutException e){
            System.out.println("Could not set motors");
        }
    }
}
