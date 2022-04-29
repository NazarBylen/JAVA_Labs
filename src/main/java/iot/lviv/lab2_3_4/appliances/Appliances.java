package iot.lviv.lab2_3_4.appliances;

import lombok.Getter;

public abstract class Appliances {
    public int power;
    public int volt;
    public int amp;
    public int year;
    public int battery;
    public String device;

    public Appliances(int power) {
        this.power = power;
    }

    public abstract int powerCount();

    public abstract String isPluggedIn();

    public abstract int getYear();

    public abstract String getName();

    public String getHeaders() {
        return "power" + "," + "volt" + "," + "amp" + "," + "year" + "," + "battery";
    }

    ;

    public String toCSV() {
        return power + "," + volt + "," + amp + "," + year;
    }

    ;
}


