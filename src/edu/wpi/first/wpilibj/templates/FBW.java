/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.wpi.first.wpilibj.templates;

/**
 *
 * @author Matt
 */
public class FBW {
    
    public FBW() {
        
    }
    public double[] processVals(double yLeft, double yRight){
                
        if (yLeft < 0) {
            yLeft = yLeft*yLeft*-1;
        }
        else{
            yLeft = yLeft*yLeft;
        }  
        
        if (yRight < 0) {
            yRight = yRight*yRight*-1;
        }
        else{
            yRight = yRight*yRight;
        }
        yLeft *= 0.9;
        yRight *= 0.9;
        double[] toMotors = {yLeft, yRight};
        return toMotors;
    }
    
}
