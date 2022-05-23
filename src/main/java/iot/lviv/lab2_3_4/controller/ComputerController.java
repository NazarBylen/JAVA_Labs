package iot.lviv.lab2_3_4.controller;
import iot.lviv.lab2_3_4.appliances.Computer;
import iot.lviv.lab2_3_4.service.ComputerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@ComponentScan("iot.lviv.lab2_3_4")
public class ComputerController{

    @Autowired
    ComputerService cs;

    @PostMapping(value="/computer")
    public Computer computer(@RequestBody Computer computer){
        return cs.getComputer(computer);
    }

    @GetMapping(value="/empty")
    public Computer computer(){
        return new Computer();
    }
}
