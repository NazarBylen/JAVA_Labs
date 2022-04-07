package lab2_3_4.appliances;

public class microwave extends Appliances {

    public int power;
    public int volt = 10;
    public int amp = 40;
    public int year = 2000;
    public int battery = 50;
    public String device = "microwave";

    public microwave(int power) {
        this.power = power;
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
