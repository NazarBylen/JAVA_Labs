package iot.lviv.lab2_3_4.appliances;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Computer extends Appliances {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int power;
    public int volt = 40;
    public int amp = 30;
    public int year = 2015;
    public int battery = 20;
    public String device = "computer";

    public Computer(int power) {
        super(0);
    }

    public int powerCount() {
        int power = volt * amp;
        return power;
    }


    public String isPluggedIn() {
        return device + " has been plugged in)";
    }

    @Override
    public int getYear() {
        return 0;
    }

    @Override
    public String getName() {
        return null;
    }


    public String getHeaders() {
        return super.getHeaders() + "," + "device";
    }

    ;

    public String toCSV() {
        return super.toCSV() + "," + battery + "," + device;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public void setVolt(int volt) {
        this.volt = volt;
    }

    public int getAmp() {
        return amp;
    }

    public void setAmp(int amp) {
        this.amp = amp;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getBattery() {
        return battery;
    }

    public void setBattery(int battery) {
        this.battery = battery;
    }

    public String getDevice() {
        return device;
    }

    public void setDevice(String device) {
        this.device = device;
    }

}
