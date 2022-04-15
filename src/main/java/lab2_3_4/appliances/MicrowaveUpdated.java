package lab2_3_4.appliances;

public class MicrowaveUpdated extends Microwave {

    public int power;
    public int volt = 50;
    public int amp = 50;
    public int year = 1995;
    public int battery = 50;
    public String device = "microwaveUpdated";

    public MicrowaveUpdated(){
        super(0);
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName();
    }

    public MicrowaveUpdated(int power) {
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
