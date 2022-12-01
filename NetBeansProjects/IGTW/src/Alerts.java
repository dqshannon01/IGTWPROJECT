import java.util.ArrayList;

public class Alerts
{
    public static ArrayList<Alerts> alertsList=new ArrayList<>();

    private String date;
    private int  hours,minutes;
    private String note;
    public Alerts(String date,int hours,int minutes,String note)
    {
        this.date=date;
        this.hours=hours;
        this.minutes=minutes;
        this.note=note;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
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

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }
}
