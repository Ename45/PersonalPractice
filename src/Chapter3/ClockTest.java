package Chapter3;

public class ClockTest {
    public static void main(String[] args) {
        Clock clock = new Clock(22,55,50);
        System.out.println(clock.displayTime());
        clock.setHour(22);
        System.out.println(clock.getHour());
        clock.setMinute(55);
        System.out.println(clock.getMinute());
        clock.setSecond(50);
        System.out.println(clock.getSecond());
        System.out.println(clock.displayTime());

    }
}
