package iot.lviv.lab2_3_4.controller;
import iot.lviv.lab2_3_4.appliances.Computer;
import iot.lviv.lab2_3_4.service.ComputerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.*;

@RestController
@ComponentScan("iot.lviv.lab2_3_4")
public class ComputerController{

    @Autowired
    ComputerService cs;

    @PostMapping(value="/postComputer")
    public Computer postComputer(@RequestBody Computer computer){
        return cs.getComputer(computer);
    }

    @GetMapping(value="/getComputer/{id}")
    public Computer getComputer(@PathVariable int id){
        return cs.getComputerId(id);
    }

    @PutMapping(value="/putComputer/{id}")
    public Computer putComputer(@PathVariable int id, @RequestBody Computer computer){
        return cs.putComputerId(id, computer);
    }

    @DeleteMapping(value="/deleteComputer/{id}")
    public void deleteComputer(@PathVariable int id){
        cs.deleteComputerId(id);
    }
}
