/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package igtw;

import java.util.Timer;
import java.util.TimerTask;

/**
 *
 * @author mymac
 */
class DemoClass {
    
    int seconds = 0;
    int minutes = 0;
    int hours = 0;

    
    
    
    Timer countdownGlobal = new Timer();
    TimerTask task = new TimerTask() {
        public void run() {
            seconds++; 
            
            System.out.println("24 Hour Time\n");
            String s = String.format("%02d", seconds);
            String m = String.format("%02d", minutes);
            String h = String.format("%02d", hours);
            System.out.println(h + ":" + m + ":" + s);
            System.out.println("\n");

            if (seconds == 59) {
                seconds = 0;

                if (seconds == 0) {
                    minutes++;
                    seconds = -1;
                }
                if (minutes == 60) {
                    hours++;
                    minutes = 0;
                }
                if (hours == 24) {
                    hours = 0;
                }
            }

        }

    };

    public void start() {
        countdownGlobal.scheduleAtFixedRate(task, 1000, 1000);
    }

    public static void main(String[] args) {
        
        DemoClass timer = new DemoClass();
        
        timer.start();
    }

}
