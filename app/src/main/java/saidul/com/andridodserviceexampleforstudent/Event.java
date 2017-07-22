package saidul.com.andridodserviceexampleforstudent;

/**
 * Created by Kazi Md. Saidul Email: Kazimdsaidul@gmail.com  Mobile: +8801675349882 on 7/22/17.
 */

public class Event {
    private  String message;
    private  int totalCoount;

    public Event(String message, int totalCoount) {
        this.message = message;
        this.totalCoount = totalCoount;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public int getTotalCoount() {
        return totalCoount;
    }

    public String getMessage() {
        return message;
    }

    public void setTotalCoount(int totalCoount) {
        this.totalCoount = totalCoount;
    }
}
