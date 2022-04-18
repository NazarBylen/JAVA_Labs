package iot.lviv.lab2_3_4.appliances;

public abstract class Appliances {
    public int power;
    public int volt;
    public int amp;
    public int year;
    public int battery;
    public String device;

    public Appliances(int power){
        this.power=power;
    }

    public abstract int powerCount();
    public abstract String isPluggedIn();

    public abstract int getYear();
}

