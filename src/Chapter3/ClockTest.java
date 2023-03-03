package Chapter3;

public class ClockTest {
    public static void main(String[] args) {
        Clock wallClock = new Clock(54, 60, 61);
        wallClock.setHour(90);
        wallClock.setMinutes(90);
        wallClock.setSecond(90);
        System.out.println(wallClock.displayTime());
    }
}
