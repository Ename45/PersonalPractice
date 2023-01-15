package tdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AirConditionerTest {
    @Test
    public void acIsOn(){
        //I have an AC;
        AirConditioner ac = new AirConditioner("Panasonic");
        //when turned on;
        ac.setOn(true);
        //check its on;
        //assertEquals(true, ac.isOn());
        assertTrue(ac.isOn());
    }

    @Test
    public void acIsOff(){
        //I have an AC that is On;
        AirConditioner ac = new AirConditioner("Panasonic", true);
        //when turned off;
        ac.setOn(false);
        //check its off;
        //assertEquals(false, ac.isOn());
        assertFalse(ac.isOn());
    }

    @Test
    public void whenTempIsIncreased(){
        //I have an AC on at temperature 18;
        AirConditioner ac = new AirConditioner(18, "Panasonic", true);
        //when temp is increased to 23;
        ac.increaseTemperature(23);
        //check temp is 23
        int temperature = ac.getTemperature();
        assertEquals(23, temperature);
    }

    @Test
    public void whenTempIsDecreased(){
        //I have an AC on at temp 21;
        AirConditioner ac = new AirConditioner(21, "Panasonic", true);
        //when temp is decreased to 19;
        ac.decreaseTemperature(19);
        //check temp is 19;
        int temperature = ac.getTemperature();
        assertEquals(19, temperature);
    }

    @Test
    public void increaseTempPast30(){
        //I have an AC on at 22;
        AirConditioner ac = new AirConditioner(22, "Panasonic", true);
        //when I try increasing temp past 30;
        ac.increaseTemperature(31);
        //check that temp remains 30;
        int temperature = ac.getTemperature();
        assertEquals(30, temperature);
    }

    @Test
    public void decreaseTempPast16(){
        //I have an AC on at 25;
        AirConditioner ac = new AirConditioner(25, "Panasonic", true);
        //when I try decreasing temp past 16;
        ac.decreaseTemperature(15);
        //check that temp remains 16;
        int temperature = ac.getTemperature();
        assertEquals(16, temperature);
    }
}
