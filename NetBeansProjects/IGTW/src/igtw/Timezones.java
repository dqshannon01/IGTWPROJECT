/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package igtw;

import java.util.ArrayList;

/**
 *
 * @author mymac
 */
public class Timezones {
    private int hours;
    private int minutes;
    


Timezones(int hours, int minutes){
this.hours=hours;
this.minutes=minutes;


}

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public int getMinutes() {
        return minutes;
    }

    public void setMinutes(int minutes) {
        this.minutes = minutes;
    }

}