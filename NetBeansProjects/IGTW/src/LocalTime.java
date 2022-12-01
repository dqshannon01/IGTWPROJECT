import java.util.ArrayList;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;
import java.util.logging.Level;
import java.util.logging.Logger;

public class LocalTime
{
    int day=1;
    int month=1;
    int year=2022;
    int seconds = 59;
    int minutes = 58;
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
            for (int i=0;i<Alerts.alertsList.size();i++)
            {

                Alerts alert=Alerts.alertsList.get(i);

                int hours=Timezones.timezoneList.get(MainFrame.placeIndex).getHours();
                int minutes=Timezones.timezoneList.get(MainFrame.placeIndex).getMinutes();
                if(MainFrame.currentDate.equals(alert.getDate()) && hours==alert.getHours() && minutes==alert.getMinutes())
                {
                    Alerts.alertsList.remove(alert);
                    new AlertNotificationFrame(alert);
                }
            }
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                Logger.getLogger(LocalTime.class.getName()).log(Level.SEVERE, null, ex);
            }

        }

    };


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
    public String toMilitary(int place) {

        if (seconds > 59)
        {
            seconds = 0;
            //loop through arraylist and update minutes
            if (seconds == 0)
            {

                //add 1 in to each timezone minute
                for(Timezones tz: Timezones.timezoneList)
                {
                    tz.setMinutes(tz.getMinutes()+1);

                }

            }

        }
        for(Timezones tz: Timezones.timezoneList)
        {

            if (tz.getMinutes() >= 60) {

                tz.setMinutes(tz.getMinutes()-60);
                tz.setHours(tz.getHours()+1);

            }

            if (tz.getHours() > 23)
            {
                tz.setDay(tz.getDay()+1);
                day++;
                if(tz.getDay()>30)
                {
                    tz.setDay(tz.getDay()-30);
                    day=day-30;
                    tz.setMonth(tz.getMonth()+1);
                    month++;
                    if(tz.getMonth()>12)
                    {
                        month=month-12;
                        tz.setMonth(tz.getMonth()-12);
                        tz.setYear(tz.getYear()+1);
                        year++;
                    }
                }
                tz.setHours(tz.getHours()-24);

            }
            if(tz.getHours()<0){

                tz.setHours(tz.getHours()+24);


            }
            //System.out.println("Eastern minutes:"+timezoneList.get(Integer.parseInt(place)).getMinutes() + "Eastern Hours"+timezoneList.get(Integer.parseInt(place)).getHours());
        }

        String s = String.format("%02d", seconds);
        String m = String.format("%02d", Timezones.timezoneList.get(place).getMinutes());
        String h = String.format("%02d", Timezones.timezoneList.get(place).getHours());

        return String.format(h + ":" + m + ":" + s);

    }

//Convert time to 12 hour

    public String to12Hour(int place)
    {
        if (seconds > 59)
        {
            seconds = 0;
            //loop through arraylist and update minutes
            if (seconds == 0)
            {

                //add 1 in to each timezone minute
                for(Timezones tz: Timezones.timezoneList)
                {
                    tz.setMinutes(tz.getMinutes()+1);

                }

            }

        }
        for(Timezones tz: Timezones.timezoneList)
        {

            if (tz.getMinutes() >= 60) {

                tz.setMinutes(tz.getMinutes()-60);
                tz.setHours(tz.getHours()+1);

            }

            if (tz.getHours() > 23) {
                tz.setDay(tz.getDay()+1);
                if(tz.getDay()>30)
                {
                    tz.setDay(tz.getDay()-30);
                    tz.setMonth(tz.getMonth()+1);
                    if(tz.getMonth()>12)
                    {
                        tz.setMonth(tz.getMonth()-12);
                        tz.setYear(tz.getYear()+1);
                    }
                }
                tz.setHours(tz.getHours()-24);

            }
            if(tz.getHours()<0){

                tz.setHours(tz.getHours()+24);


            }
            //System.out.println("Eastern minutes:"+timezoneList.get(Integer.parseInt(place)).getMinutes() + "Eastern Hours"+timezoneList.get(Integer.parseInt(place)).getHours());
        }


            if (Timezones.timezoneList.get(place).getHours() >= 0 && Timezones.timezoneList.get(place).getHours() <= 11)
            {

                String s = String.format("%02d", seconds);
                String m = String.format("%02d", Timezones.timezoneList.get(place).getMinutes());
                String h = String.format("%02d", Timezones.timezoneList.get(place).getHours());

                String h12 = String.format("%02d", twelfthHour);

                if (Timezones.timezoneList.get(place).getHours() == 0) {
                    return String.format(h12 + ":" + m + ":" + s + " AM");
                }
                if (Timezones.timezoneList.get(place).getHours() != 0) {
                    return String.format(h + ":" + m + ":" + s + " AM");
                }
            }
            int twelveHour = Timezones.timezoneList.get(place).getHours() - 12;

            if (Timezones.timezoneList.get(place).getHours() >= 13 && Timezones.timezoneList.get(place).getHours() <= 24)
            {

                String s = String.format("%02d", seconds);
                String m = String.format("%02d", Timezones.timezoneList.get(place).getMinutes());
                String h = String.format("%02d", Timezones.timezoneList.get(place).getHours()-12);
                String h12 = String.format("%02d", twelveHour);

                if (Timezones.timezoneList.get(place).getHours()  == 24) {
                    return String.format(h12 + ":" + m + ":" + s + " AM");

                }
                return String.format(h + ":" + m + ":" + s + " PM");

            }

            if (Timezones.timezoneList.get(place).getHours() == 12) {
                String s = String.format("%02d", seconds);
                String m = String.format("%02d", Timezones.timezoneList.get(place).getMinutes());
                String h = String.format("%02d", Timezones.timezoneList.get(place).getHours());

                String h12 = String.format("%02d", twelfthHour);

                return String.format(h12 + ":" + m + ":" + s + " PM");
            }

        return null;
    }
    public void start() {


        Timezones easternTime = new Timezones("Eastern Daylight (USA)",hours, minutes,day,month,year);
        Timezones.timezoneList.add(easternTime);
        Timezones pacificTime = new Timezones("Pacific Daylight (USA)",pacificHours, pacificMinutes,day,month,year);
        Timezones.timezoneList.add(pacificTime);
        Timezones mountainTime = new Timezones("Mountain Daylight (USA)",mountainHours, mountainMinutes,day,month,year);
        Timezones.timezoneList.add(mountainTime);
        Timezones centralTime = new Timezones("Central Daylight (USA)",centralHours, centralMinutes,day,month,year);
        Timezones.timezoneList.add(centralTime);
        Timezones rioTime = new Timezones("Rio de Janeiro (BRT)",rioHours, rioMinutes,day,month,year);
        Timezones.timezoneList.add(rioTime);
        Timezones utcTime = new Timezones("Coordinated Universal Time (UTC)",utcHours, utcMinutes,day,month,year);
        Timezones.timezoneList.add(utcTime);
        Timezones londonTime = new Timezones("London (GMT)",londonHours, londonMinutes,day,month,year);
        Timezones.timezoneList.add(londonTime);
        Timezones berlinTime = new Timezones("Berlin (GMT+1)",berlinHours, berlinMinutes,day,month,year);
        Timezones.timezoneList.add(berlinTime);
        Timezones moscowTime = new Timezones("Moscow (GMT+3)",moscowHours, moscowMinutes,day,month,year);
        Timezones.timezoneList.add(moscowTime);
        Timezones dubaiTime = new Timezones("Dubai (GMT+4)",dubaiHours, dubaiMinutes,day,month,year);
        Timezones.timezoneList.add(dubaiTime);
        Timezones mumbaiTime = new Timezones("Mumbai (GMT+5:30)",mumbaiHours, mumbaiMinutes,day,month,year);
        Timezones.timezoneList.add(mumbaiTime);
        Timezones singaporeTime = new Timezones("Singapore (GMT+8)",singaporeHours, singaporeMinutes,day,month,year);
        Timezones.timezoneList.add(singaporeTime);
        Timezones beijingTime = new Timezones("Beijing (GMT+8)",beijingHours, beijingMinutes,day,month,year);
        Timezones.timezoneList.add(beijingTime);
        Timezones chinaTime = new Timezones("China (GMT+8)",chinaHours, chinaMinutes,day,month,year);
        Timezones.timezoneList.add(chinaTime);
        Timezones tokyoTime = new Timezones("Tokyo (GMT+9)",tokyoHours, tokyoMinutes,day,month,year);
        Timezones.timezoneList.add(tokyoTime);
        Timezones sydneyTime = new Timezones("Sydney (GMT+11)",sydneyHours, sydneyMinutes,day,month,year);
        Timezones.timezoneList.add(sydneyTime);
        Timezones aucklandTime = new Timezones("Auckland (GMT+13)",aucklandHours, aucklandMinutes,day,month,year);
        Timezones.timezoneList.add(aucklandTime);

        countdownGlobal.scheduleAtFixedRate(task, 1000, 1000);


    }

}
