import java.util.ArrayList;

public class Timezones
{

    public static ArrayList<Timezones> timezoneList=new ArrayList<>();
    private int hours;
    private int minutes;
    private int day;
    private int month;
    private int year;
    private String timeZoneName;



    Timezones(String timeZoneName,int hours, int minutes,int day,int month,int year){
        this.hours=hours;
        this.minutes=minutes;
        this.timeZoneName=timeZoneName;
        this.day=day;
        this.month=month;
        this.year=year;
    }

    public String getTimeZoneName() {
        return timeZoneName;
    }

    public void setTimeZoneName(String timeZoneName) {
        this.timeZoneName = timeZoneName;
    }

    public int getHours()
    {
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

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
