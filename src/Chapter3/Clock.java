package Chapter3;

public class Clock {
    private int hour;
    private int minute;
    private int second;
    //private final String clockFormat;


    public Clock(int hour, int minute, int second){
        if (hour >= 0) this.hour = hour;
        if (minute >= 0) this.minute = minute;
        if (second >= 0) this.second = second;
       // clockFormat = " ";
    }

    public void setHour(int hour){
        if (hour > 23) this.hour = 0;
    }

    public int getHour(){
        return this.hour;
    }

    public void setMinute(int minute){
        if (minute > 59) this.minute = 0;
    }

    public int getMinute(){
        return this.minute;
    }

    public void setSecond(int second){
        if (second > 59) this.second = 0;
    }

    public int getSecond(){
        return this.second;
    }

    public String displayTime(){
       System.out.printf("%d:%d:%d", this.hour, this.minute, this.second);
        return null;
    }

//    public String displayTime(){
//        return setDisplayTime();
//    }

}


