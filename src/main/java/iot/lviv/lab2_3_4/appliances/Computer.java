package iot.lviv.lab2_3_4.appliances;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import javax.persistence.*;

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


    public Computer(int power) {
        power = 0;
    }

    public Computer(){};

    public Computer(int id, int power, int amp, int volt, int year, int battery, String device){
        this.id=id;
        this.power=power;
        this.amp=amp;
        this.volt=volt;
        this.year=year;
        this.battery=battery;
        this.device=device;
    };

    public int powerCount() {
        int power = volt * amp;
        return power;
    }


    public String isPluggedIn() {
        return device + " has been plugged in)";
    }

    @Override
    public int getYear() {
        return year;
    }

    @JsonIgnore
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

    public int getVolt() {
        return volt;
    }
}
