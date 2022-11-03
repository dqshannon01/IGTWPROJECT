/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package igtw;

import java.util.ArrayList;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Team 13
 */
class LocalTime {


    private List<Timezones> timezoneList = new ArrayList();
    
    int seconds = 49;
    int minutes = 59;
    int hours = 23;
    int twelfthHour = 12;
    int pacificMinutes = minutes;
    int pacificHours = hours - 3;
    int mountainMinutes = minutes;
    int mountainHours = hours - 2;
    int centralMinutes = minutes;
    int centralHours = hours - 1;
    int rioMinutes = minutes;
    int rioHours = hours + 1;
    int utcMinutes = minutes;
    int utcHours = hours + 4;
    int londonMinutes = minutes;
    int londonHours = hours + 5;
    int berlinMinutes = minutes;
    int berlinHours = hours + 6;
    int moscowMinutes = minutes;
    int moscowHours = hours + 7;
    int dubaiMinutes = minutes;
    int dubaiHours = hours + 8;
    int mumbaiMinutes = minutes + 30;
    int mumbaiHours = hours + 9;
    int singaporeMinutes = minutes;
    int singaporeHours = hours + 12;
    int beijingMinutes = minutes;
    int beijingHours = hours + 12;
    int chinaMinutes = minutes;
    int chinaHours = hours + 12;
    int tokyoMinutes = minutes;
    int tokyoHours = hours + 13;
    int sydneyMinutes = minutes;
    int sydneyHours = hours + 15;
    int aucklandMinutes = minutes;
    int aucklandHours = hours + 17;

    Timer countdownGlobal = new Timer();

    //Global Counter variable in seconds
    TimerTask task = new TimerTask() {
        public void run() {

            seconds++;

            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                Logger.getLogger(LocalTime.class.getName()).log(Level.SEVERE, null, ex);
            }

        }

    };

//Time Zone Converter
    public void timeZonePacific() {
    Timezones tz = new Timezones(pacificHours, pacificMinutes);
    
    }

    public void timeZoneMountain() {
        if (hours >= 24) {
            hours += hours - 24;
        }

        if (hours <= -1) {
            hours = hours + 24;
        }

    }

    public void timeZoneCentral() {
        if (hours >= 24) {
            hours += hours - 24;
        }

        if (hours <= -1) {
            hours = hours + 24;
        }

    }

    public void timeZoneEastern() {
        if (hours >= 24) {
            hours += hours - 24;
        }

        if (hours <= -1) {
            hours = hours + 24;
        }

    }

    public void timeZoneRio() {
        if (hours >= 24) {
            hours += hours - 24;
        }

        if (hours <= -1) {
            hours = hours + 24;
        }

    }

    public void timeZoneUTC() {
        if (hours >= 24) {
            hours += hours - 24;
        }

        if (hours <= -1) {
            hours = hours + 24;
        }

    }

    public void timeZoneLondon() {
        if (hours >= 24) {
            hours += hours - 24;
        }

        if (hours <= -1) {
            hours = hours + 24;
        }

    }

    public void timeZoneBerlin() {
        if (hours >= 24) {
            hours += hours - 24;
        }

        if (hours <= -1) {
            hours = hours + 24;
        }

    }

    public void timeZoneMoscow() {
        if (hours >= 24) {
            hours += hours - 24;
        }

        if (hours <= -1) {
            hours = hours + 24;
        }

    }

    public void timeZoneDubai() {
        if (hours >= 24) {
            hours += hours - 24;
        }

        if (hours <= -1) {
            hours = hours + 24;
        }

    }

    public void timeZoneMumbai() {

    }

    public void timeZoneSingapore() {
        if (hours >= 24) {
            hours += hours - 24;
        }

        if (hours <= -1) {
            hours = hours + 24;
        }

    }

    public void timeZoneBeijing() {
        if (hours >= 24) {
            hours += hours - 24;
        }

        if (hours <= -1) {
            hours = hours + 24;
        }

    }

    public void timeZoneChinaTime() {
        if (hours >= 24) {
            hours += hours - 24;
        }

        if (hours <= -1) {
            hours = hours + 24;
        }

    }

    public void timeZoneTokyo() {
        if (hours >= 24) {
            hours += hours - 24;
        }

        if (hours <= -1) {
            hours = hours + 24;
        }

    }

    public void timeZoneSydney() {
        if (hours >= 24) {
            hours += hours - 24;
        }

        if (hours <= -1) {
            hours = hours + 24;
        }

    }

    public void timeZoneAuckland() {
        if (hours >= 24) {
            hours += hours - 24;
        }

        if (hours <= -1) {
            hours = hours + 24;
        }

    }

    public int military(int hr, int min) {
        return 0;

    }

//Convert time to military 24 hour
    public String toMilitary(String place) {

        if (seconds > 59) {
            seconds = 0;
//loop through arraylist and update minutes
            if (seconds == 0) {
                
                //add 1 in to each timezone minute
            for(Timezones tz: timezoneList){
            tz.setMinutes(tz.getMinutes()+1);

            }
                
                }            

            }
         for(Timezones tz: timezoneList){

            if (tz.getMinutes() >= 60) {
               
                tz.setMinutes(tz.getMinutes()-60);
                tz.setHours(tz.getHours()+1);
                
                }            
            
            if (tz.getHours() > 23) {
                tz.setHours(tz.getHours()-24); 
         
            }
            if(tz.getHours()<0){
               
                tz.setHours(tz.getHours()+24);
                
                
                }   
            System.out.println("Eastern minutes:"+timezoneList.get(Integer.parseInt(place)).getMinutes() + "Eastern Hours"+timezoneList.get(Integer.parseInt(place)).getHours());
        }

        String s = String.format("%02d", seconds);
        String m = String.format("%02d", timezoneList.get(Integer.parseInt(place)).getMinutes());
        String h = String.format("%02d", timezoneList.get(Integer.parseInt(place)).getHours());
        
        return String.format(h + ":" + m + ":" + s);
        
          }
    
//Convert time to 12 hour

    public String to12Hour(String place) {
        place="1";
for(Timezones tz: timezoneList){
        if (seconds > 59) {
            seconds = 0;

            if (seconds == 0) {
                tz.setMinutes(tz.getMinutes()+1);
                //seconds = -1;
            }
            if (seconds == -1) {
                //seconds =59;
            }
            if (timezoneList.get(Integer.parseInt(place)).getMinutes() == 60) {
                tz.setHours(tz.getHours()+1);
                tz.setMinutes(0); 
            }
            if (timezoneList.get(Integer.parseInt(place)).getHours() == 0) {
                tz.setHours(12);
            }
            
            
           if(timezoneList.get(Integer.parseInt(place)).getHours()<0){
           tz.setHours(tz.getHours()+24);
}

            if (timezoneList.get(Integer.parseInt(place)).getHours() > 24) {
                tz.setHours(tz.getHours()-24);
            }

        }

        if (timezoneList.get(Integer.parseInt(place)).getHours() >= 0 && timezoneList.get(Integer.parseInt(place)).getHours() <= 11) {

            String s = String.format("%02d", seconds);
            String m = String.format("%02d", timezoneList.get(Integer.parseInt(place)).getMinutes());
            String h = String.format("%02d", timezoneList.get(Integer.parseInt(place)).getHours());

            String h12 = String.format("%02d", twelfthHour);

            if (timezoneList.get(Integer.parseInt(place)).getHours() == 0) {
                return String.format(h12 + ":" + m + ":" + s + " AM");
            }
            if (timezoneList.get(Integer.parseInt(place)).getHours() != 0) {
                return String.format(h + ":" + m + ":" + s + " AM");
            }
        }
        int twelveHour = timezoneList.get(Integer.parseInt(place)).getHours() - 12;

        if (timezoneList.get(Integer.parseInt(place)).getHours() >= 13 && timezoneList.get(Integer.parseInt(place)).getHours() <= 24) {

            String s = String.format("%02d", seconds);
            String m = String.format("%02d", timezoneList.get(Integer.parseInt(place)).getMinutes());
            String h = String.format("%02d", timezoneList.get(Integer.parseInt(place)).getHours());
            String h12 = String.format("%02d", twelveHour);
            
            if (timezoneList.get(Integer.parseInt(place)).getHours()  == 24) {
                return String.format(h12 + ":" + m + ":" + s + " AM");

            }
            return String.format(h12 + ":" + m + ":" + s + " PM");
            
        }
        if (timezoneList.get(Integer.parseInt(place)).getHours() == 12) {
            String s = String.format("%02d", seconds);
            String m = String.format("%02d", timezoneList.get(Integer.parseInt(place)).getMinutes());
            String h = String.format("%02d", timezoneList.get(Integer.parseInt(place)).getHours());

            String h12 = String.format("%02d", twelfthHour);

            return String.format(h12 + ":" + m + ":" + s + " PM");
        }

        //
        String s = String.format("%02d", seconds);
        String m = String.format("%02d", timezoneList.get(Integer.parseInt(place)).getMinutes());
        String h = String.format("%02d", timezoneList.get(Integer.parseInt(place)).getHours());

        String h12 = String.format("%02d", twelveHour);
        return String.format(h+":"+m+":"+s+" PM");
    }
        return null;
    }
    public void start() {
        
        
        Timezones easternTime = new Timezones(hours, minutes);
        timezoneList.add(easternTime);
        Timezones pacificTime = new Timezones(pacificHours, pacificMinutes);
        timezoneList.add(pacificTime);
        Timezones mountainTime = new Timezones(mountainHours, mountainMinutes);
        timezoneList.add(mountainTime);
        Timezones centralTime = new Timezones(centralHours, centralMinutes);
        timezoneList.add(centralTime);
        Timezones rioTime = new Timezones(rioHours, rioMinutes);
        timezoneList.add(rioTime);
        Timezones utcTime = new Timezones(utcHours, utcMinutes);
        timezoneList.add(utcTime);
        Timezones londonTime = new Timezones(londonHours, londonMinutes);
        timezoneList.add(londonTime);
        Timezones berlinTime = new Timezones(berlinHours, berlinMinutes);
        timezoneList.add(berlinTime);
        Timezones moscowTime = new Timezones(moscowHours, moscowMinutes);
        timezoneList.add(moscowTime);
        Timezones dubaiTime = new Timezones(dubaiHours, dubaiMinutes);
        timezoneList.add(dubaiTime);
        Timezones mumbaiTime = new Timezones(mumbaiHours, mumbaiMinutes);
        timezoneList.add(mumbaiTime);
        Timezones singaporeTime = new Timezones(singaporeHours, singaporeMinutes);
        timezoneList.add(singaporeTime);
        Timezones beijingTime = new Timezones(beijingHours, beijingMinutes);
        timezoneList.add(beijingTime);
        Timezones chinaTime = new Timezones(chinaHours, chinaMinutes);
        timezoneList.add(chinaTime);
        Timezones tokyoTime = new Timezones(tokyoHours, tokyoMinutes);
        timezoneList.add(tokyoTime);
        Timezones sydneyTime = new Timezones(sydneyHours, sydneyMinutes);
        timezoneList.add(sydneyTime);
        Timezones aucklandTime = new Timezones(aucklandHours, aucklandMinutes);
        timezoneList.add(aucklandTime);

        countdownGlobal.scheduleAtFixedRate(task, 1000, 1000);
        
        
  

   // }
          
    }

    public static void main(String[] args) {

        LocalTime timer = new LocalTime();

        timer.start();
        
    }

}
