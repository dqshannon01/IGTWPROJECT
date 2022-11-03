/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package igtw;

import java.util.Timer;
import java.util.TimerTask;
import javax.swing.JLabel;

/**
 *
 * @author Team 13
 */
public class IGTW {


    
    public static void main(String[] args) throws InterruptedException {
        
        Timezones tz;
        MainFrame nf = new MainFrame();
        LocalTime timer = new LocalTime();
        GlobalTimesFrame gtf = new GlobalTimesFrame();
        
        timer.start();

        int i=0;
        gtf.setVisible(true);
        nf.setVisible(true);
        
       //Military time
      /*   while (i < 1) {
           nf.setjLabelTime(timer.toMilitary());
           System.out.println(timer.toMilitary());
           gtf.setjLabelEST(timer.toMilitary());
  
         }}} */
    
       //24 hour time
         while (i < 1) {
             nf.setjLabelTime(timer.toMilitary("0"));
             gtf.setjLabelEST(timer.toMilitary("0"));
             gtf.setjLabelPDT(timer.toMilitary("1"));
             gtf.setjLabelRio(timer.toMilitary("2"));
             gtf.setjLabelMum(timer.toMilitary("3"));
             gtf.setjLabelDub(timer.toMilitary("4"));
             gtf.setjLabelSin(timer.toMilitary("5"));
             gtf.setjLabelUK(timer.toMilitary("6"));
             gtf.setjLabelUTC(timer.toMilitary("7"));
             gtf.setjLabelMos(timer.toMilitary("8"));
             gtf.setjLabelMDT(timer.toMilitary("9"));
             gtf.setjLabelCST(timer.toMilitary("10"));
             gtf.setjLabelBer(timer.toMilitary("11"));
             gtf.setjLabelBei(timer.toMilitary("12"));
             gtf.setjLabelChi(timer.toMilitary("13"));
             gtf.setjLabelTok(timer.toMilitary("14"));
             gtf.setjLabelSyd(timer.toMilitary("15"));
             gtf.setjLabelAuc(timer.toMilitary("16"));
             
         }
          /*   
                      while (i < 1) {
             nf.setjLabelTime(timer.to12Hour("0"));
             gtf.setjLabelEST(timer.to12Hour("0"));
             gtf.setjLabelPDT(timer.to12Hour("1"));
             gtf.setjLabelRio(timer.to12Hour("2"));
             gtf.setjLabelMum(timer.to12Hour("3"));
             gtf.setjLabelDub(timer.to12Hour("4"));
             gtf.setjLabelSin(timer.to12Hour("5"));
             gtf.setjLabelUK(timer.to12Hour("6"));
             gtf.setjLabelUTC(timer.to12Hour("7"));
             gtf.setjLabelMos(timer.to12Hour("8"));
             gtf.setjLabelMDT(timer.to12Hour("9"));
             gtf.setjLabelCST(timer.to12Hour("10"));
             gtf.setjLabelBer(timer.to12Hour("11"));
             gtf.setjLabelBei(timer.to12Hour("12"));
             gtf.setjLabelChi(timer.to12Hour("13"));
             gtf.setjLabelTok(timer.to12Hour("14"));
             gtf.setjLabelSyd(timer.to12Hour("15"));
             gtf.setjLabelAuc(timer.to12Hour("16"));
         }
             */

             
        //   System.out.println(timer.to12Hour("0"));
        //   gtf.setjLabelEST(timer.to12Hour("2"));

            
        }}  
    
















   // }
    //    int i = 0;
//Run Clock(unsynced)
     //   LocalTime timer = new LocalTime();
      //  timer.start();
        //Military time
       // while (i < 1) {
        //    Thread.sleep(1000);
        //    System.out.println(timer.toMilitary());
     //   }
        //12 hour time
       // while (i < 1) {
        //    Thread.sleep(1000);
       //     System.out.println(timer.to12Hour());
//} 

//Run Alarm
        //      System.out.println("Alarm (Format H|M|S)\n");
        //      Countdown alarm = new Countdown();
        //     alarm.start();

    
