package iot.lviv.lab2_3_4.appliances;

public class Microwave extends Appliances {

    public int power;
    public int volt = 10;
    public int amp = 40;
    public int year = 2000;
    public int battery = 50;
    public String device = "microwave";

    public Microwave(int power) {
        super(0);
    }

    public int powerCount() {
        int power = volt * amp;
        return power;
    }

    public int getYear() {
        return year;
    }

    public String isPluggedIn() {
        return device + " has been plugged in)";
    }

    public String getName() {
        return getClass().getName();
    }

    public String getHeaders() {
        return super.getHeaders() + "," + "device";
    }

    ;

    public String toCSV() {
        return super.toCSV() + "," + device;
    }

    ;

}
