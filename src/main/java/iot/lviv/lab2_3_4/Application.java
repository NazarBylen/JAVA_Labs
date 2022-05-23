package iot.lviv.lab2_3_4;
import iot.lviv.lab2_3_4.repository.ComputerRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application{

    ComputerRepository cr;

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
        System.out.println("well done");
    }
}
