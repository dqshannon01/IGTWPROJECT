/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package igtw;

import java.util.Timer;
import java.util.TimerTask;
import java.util.Scanner;

/**
 *
 * @author mymac
 */
public class Countdown {

    Scanner input = new Scanner(System.in);
    int hours   = input.nextInt();  
    int minutes = input.nextInt();
    int seconds = input.nextInt();
 


    Timer alarm = new Timer();
    TimerTask task = new TimerTask() {

        public void run() {
Ï
           
            String s = String.format("%02d", seconds);
            String m = String.format("%02d", minutes);
            String h = String.format("%02d", hours);
            System.out.println(h + ":" + m + ":" + s);
            System.out.println("\n");
            
            if (minutes + seconds + hours == 0) {
                return;
            }
            if (minutes == 0 && hours >= 1 && seconds == 0) {
                hours--;
                minutes = 59;
                seconds = 60;
            }
            if (seconds == 0) {
                minutes--;
                seconds = 60;
            }
            if ((seconds == 0 && (minutes >= 1))) {
                seconds = 60;

            }
            seconds--;
        }

    };
    
    public void start() {
        alarm.scheduleAtFixedRate(task, 1000, 1000);
    }

    public static void main(String[] args) {
        Countdown alarm = new Countdown();
        alarm.start();

    }

}
