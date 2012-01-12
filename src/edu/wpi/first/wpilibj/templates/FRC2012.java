/*----------------------------------------------------------------------------*/
/* Copyright (c) FIRST 2008. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package edu.wpi.first.wpilibj.templates;


import edu.wpi.first.wpilibj.IterativeRobot;

/**
 * The VM is configured to automatically run this class, and to call the
 * functions corresponding to each mode, as described in the IterativeRobot
 * documentation. If you change the name of this class or the package after
 * creating this project, you must also update the manifest file in the resource
 * directory.
 */
public class FRC2012 extends IterativeRobot {
    
    private Input input;
    private Output output;
    private FBW robotThink; 
    /**
     * This function is run when the robot is first started up and should be
     * used for any initialization code.
     */
    public void robotInit() {
        this.input = new Input();
        this.output = new Output();
        this.robotThink = new FBW();
        

    }
    
    public void disabledInit() {
        
    }
    
    public void autonomousInit() {
        
    }
    
    public void teleopInit() {
        
    }
    
    public void disabledPeriodic() {
        
    }

    /**
     * This function is called periodically during autonomous
     */
    public void autonomousPeriodic() {

    }

    /**
     * This function is called periodically during operator control
     */
    public void teleopPeriodic() {
        double leftX;
        double rightX;
        double leftY;
        double rightY;
        leftX = this.input.getAxis(this.input.left, this.input.xAxis);
        rightX = this.input.getAxis(this.input.right, this.input.xAxis);
        leftY = this.input.getAxis(this.input.left, this.input.xAxis);
        rightY = this.input.getAxis(this.input.right, this.input.xAxis);
        this.output.setMotors(leftX, leftY, rightX, rightY);
    }
    
}
