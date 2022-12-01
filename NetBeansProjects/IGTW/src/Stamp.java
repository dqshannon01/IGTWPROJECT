import java.util.ArrayList;

public class Stamp
{
    public static ArrayList<Stamp> stamps=new ArrayList<>();
    private String time;
    private String date;
    private String note;

    public Stamp(String time, String date, String note) {
        this.time = time;
        this.date = date;
        this.note = note;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }
}
