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
class LocalTime {

    int seconds = 55;
    int minutes = 59;
    int hours = 00;

    int twelfthHour = 12;
    boolean check = true;

    Timer countdownGlobal = new Timer();
    TimerTask task = new TimerTask() {
        public void run() {
            seconds++;

            // System.out.println("24 Hour Time\n");
            //  String s = String.format("%02d", seconds);
            //  String m = String.format("%02d", minutes);
            //  String h = String.format("%02d", hours);
            //  System.out.println(h + ":" + m + ":" + s);
            //  System.out.println("\n");
        }

    };

    public String toMilitary() {

        if (seconds > 59) {
            seconds = 0;

            if (seconds == 0) {
                minutes++;

            }
            if (minutes == 60) {
                hours++;
                minutes = 0;
            }
            if (hours > 23) {
                hours = 0;
            }
        }
        String s = String.format("%02d", seconds);
        String m = String.format("%02d", minutes);
        String h = String.format("%02d", hours);
        return String.format(h + ":" + m + ":" + s);
        //return String.format("00");
    }

    public String to12Hour() {

        if (seconds > 59) {
            seconds = 0;

            if (seconds == 0) {
                minutes++;
                //seconds = -1;
            }
            if (seconds == -1) {
                //seconds =59;
            }
            if (minutes == 60) {
                hours++;
                minutes = 0;
            }
            if (hours == 0) {
                hours = 12;
            }
            if (hours == 0) {
                hours = 12;
            }

            if (hours > 24) {
                hours = 1;
            }

        }
//while(check==true){
        if (hours >= 0 && hours <= 11) {

            String s = String.format("%02d", seconds);
            String m = String.format("%02d", minutes);
            String h = String.format("%02d", hours);

            String h12 = String.format("%02d", twelfthHour);

            if (hours == 0) {
                return String.format(h12 + ":" + m + ":" + s + " AM");
            }
            if (hours != 0) {
                return String.format(h + ":" + m + ":" + s + " AM");
            }
        }
        int twelveHour = hours - 12;

        if (hours >= 13 && hours <= 24) {

            String s = String.format("%02d", seconds);
            String m = String.format("%02d", minutes);
            String h = String.format("%02d", hours);
            String h12 = String.format("%02d", twelveHour);
            if (hours == 24) {
                return String.format(12 + ":" + m + ":" + s + " AM");

            }
            return String.format(h12 + ":" + m + ":" + s + " PM");
        }
        if (hours == 12) {
            String s = String.format("%02d", seconds);
            String m = String.format("%02d", minutes);
            String h = String.format("%02d", hours);

            String h12 = String.format("%02d", twelfthHour);

            return String.format(h12 + ":" + m + ":" + s + " PM");
        }

//}
        //
        String s = String.format("%02d", seconds);
        String m = String.format("%02d", minutes);
        String h = String.format("%02d", hours);

        String h12 = String.format("%02d", twelveHour);
        return String.format(h);
    }

    public void start() {
        countdownGlobal.scheduleAtFixedRate(task, 1000, 1000);
    }

    public static void main(String[] args) {

        LocalTime timer = new LocalTime();

        timer.start();
    }

}
