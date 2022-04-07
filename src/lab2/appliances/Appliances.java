package lab2.appliances;

import static lab2.manager.Manager.sortingByPower;
import static lab2.manager.Manager.sortingByYear;

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


