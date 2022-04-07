package lab2_3_4.appliances;

public abstract class Appliances {
    public int power;
    public int volt;
    public int amp;
    public int year;
    public int battery;
    public String device;

    public abstract int powerCount();
    public abstract String isPluggedIn();

    public int getYear() {
        return year;
    }
}


