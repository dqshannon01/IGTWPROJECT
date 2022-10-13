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

    public static void main(String[] args) throws InterruptedException {
        int i = 0;
        int previousSecond;
//Run Clock(unsynced)
        LocalTime timer = new LocalTime();
        timer.start();
        //System.out.println(timer.to12Hour());
        while (i < 1) {
            Thread.sleep(1000);
            System.out.println(timer.toMilitary());
        }

//Run Alarm
        //      System.out.println("Alarm (Format H|M|S)\n");
        //      Countdown alarm = new Countdown();
        //     alarm.start();
    }
}
