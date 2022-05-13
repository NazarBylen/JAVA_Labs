package iot.lviv.lab2_3_4.appliances;

import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
public class MicrowaveUpdated extends Microwave {

    public int power;
    public int volt = 50;
    public int amp = 50;
    @Getter
    public int year = 1995;
    public int battery = 50;
    public String device = "microwaveUpdated";

    public MicrowaveUpdated(int power){
        super(0);
    }

    public int powerCount() {
        int power = volt * amp;
        return power;
    }

    public int getYear() {
        return year;
    }

    public int getVolt() {
        return volt;
    }

    public String isPluggedIn() {
        return device + " has been plugged in)";
    }

    public String getName() {
        return getClass().getName();
    }

    public String getHeaders(){
        return super.getHeaders() + "," +"device";
    };
    public String toCSV(){
        return super.toCSV() + "," + battery+ "," + device;
    };
}
