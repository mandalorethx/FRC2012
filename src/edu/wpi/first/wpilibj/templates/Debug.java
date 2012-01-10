/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.wpi.first.wpilibj.templates;

import edu.wpi.first.wpilibj.DriverStationLCD;
import edu.wpi.first.wpilibj.Timer;

/**
 *
 * @author Matt
 */
public class Debug {
    
    // Timers
    private Timer timer;
    private Timer autonTimer;
    
    // LCD display
    private DriverStationLCD display;
    private int lastLineNum;

    //Constants for timers
    static final int k_normalTimer = 0;
    static final int k_autonTimer = 1;

    public Debug() {
        this.timer = new Timer();
        this.autonTimer = new Timer();
        this.display = DriverStationLCD.getInstance();
        this.lastLineNum = 0;
    }
    
    void startTimer(int period) {
        // start a timer
        switch (period) {
            case k_normalTimer:
                timer.start();
                break;
            case k_autonTimer:
                autonTimer.start();
                break;
            default:
                writeToScreen("Bad Timer passed");
                break;
        }
    }

    double getTimer(int period) {
        // get the value from a timer
        double time = 0;
        switch (period) {
            case k_normalTimer:
                time = this.timer.get();
                break;
            case k_autonTimer:
                time = this.autonTimer.get();
                break;
            default:
                writeToScreen("Bad Timer passed");
                break;
        }
        time /= 1000000;
        return time;
    }
    void stopTimer(int period) {
        //stop a timer
        switch (period) {
            case k_normalTimer:
                timer.stop();
                break;
            case k_autonTimer:
                autonTimer.stop();
                break;
            default:
                writeToScreen("Bad Timer passed");
                break;
        }
    }

    void resetTimer(int period) {
        // reset a timer
        switch (period) {
            case k_normalTimer:
                timer.reset();
                break;
            case k_autonTimer:
                autonTimer.reset();
                break;
            default:
                writeToScreen("Bad Timer passed");
                break;
        }
    }

  void writeToScreen(String msg) {
      //write a message to the next available line on the LCD screen
      lastLineNum += 1;
      if (lastLineNum > 5) {
          lastLineNum = 0;
      }
      switch (lastLineNum) {
          case 0:
              display.println(DriverStationLCD.Line.kMain6, 1, msg);
              break;
          case 1:
              display.println(DriverStationLCD.Line.kUser2, 1, msg);
              break;
          case 2:
              display.println(DriverStationLCD.Line.kUser3, 1, msg);
              break;
          case 3:
              display.println(DriverStationLCD.Line.kUser4, 1, msg);
              break;
          case 4:
              display.println(DriverStationLCD.Line.kUser5, 1, msg);
              break;
          case 5:
              display.println(DriverStationLCD.Line.kUser6, 1, msg);
              break;
          default:
              display.println(DriverStationLCD.Line.kUser2, 1, "BAD LINE PASSED");
              break;
      }
      display.updateLCD();
  }
  
  void writeToScreen(String msg, int linenum) {
      // write a message to a specified line on the LCD screen
      switch (linenum) {
          case 0:
              display.println(DriverStationLCD.Line.kMain6, 1, msg);
              lastLineNum = 0;
              break;
          case 1:
              display.println(DriverStationLCD.Line.kUser2, 1, msg);
              lastLineNum = 1;
              break;
          case 2:
              display.println(DriverStationLCD.Line.kUser3, 1, msg);
              lastLineNum = 2;
              break;
          case 3:
              display.println(DriverStationLCD.Line.kUser4, 1, msg);
              lastLineNum = 3;
              break;
          case 4:
              display.println(DriverStationLCD.Line.kUser5, 1, msg);
              lastLineNum = 4;
              break;
          case 5:
              display.println(DriverStationLCD.Line.kUser6, 1, msg);
              lastLineNum = 5;
              break;
          default:
              display.println(DriverStationLCD.Line.kUser2, 1, "BAD LINE PASSED");
              break;
      }
      display.updateLCD();
  }

    void clearScreen() {
        // clear the screen
        display.println(DriverStationLCD.Line.kUser2, 1, "                              ");
        display.println(DriverStationLCD.Line.kUser3, 1, "                              ");
        display.println(DriverStationLCD.Line.kUser4, 1, "                              ");
        display.println(DriverStationLCD.Line.kUser5, 1, "                              ");
        display.println(DriverStationLCD.Line.kUser6, 1, "                              ");
        display.println(DriverStationLCD.Line.kMain6, 1, "                              ");
        display.updateLCD();
    }

    /*
     * End of Class
     */
}
