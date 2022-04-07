package lab2_3_4.appliances;

public class microwaveUpdated extends microwave {

    public int power;
    public int volt = 50;
    public int amp = 50;
    public int year = 1995;
    public int battery = 50;
    public String device = "microwaveUpdated";

    public microwaveUpdated(int power) {
        super(power);
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
}
