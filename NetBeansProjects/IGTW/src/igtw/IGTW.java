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
public class IGTW {

    
    public static void main(String[] args) {
//Run Clock(unsynced)
        //DemoClass timer = new DemoClass();
        //timer.start();
        

//Run Alarm
        System.out.println("Alarm (Format H|M|S)\n");
        Countdown alarm = new Countdown();
        alarm.start();
    }

}
/*
    public static void main(String[] args) {
       System.out.println("Hello World");
        DemoClass demo = new DemoClass();
        TimerTask task = demo.task;
        
    }
}
    */
 

