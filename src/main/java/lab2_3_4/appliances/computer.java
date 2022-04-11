package lab2_3_4.appliances;

public class computer extends Appliances {

    public int power;
    public int volt = 40;
    public int amp = 30;
    public int year = 2015;
    public int battery = 20;
    public String device = "computer";

    public computer(int power){
        this.power=power;
    }

    public int powerCount(){
        int power=volt*amp;
        return power;
    }

    public String isPluggedIn(){
        return device + " has been plugged in)";
    }

    public int getYear() {
        return year;
    }
}
