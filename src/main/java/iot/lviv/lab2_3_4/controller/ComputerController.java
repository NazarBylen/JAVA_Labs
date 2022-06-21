package iot.lviv.lab2_3_4.controller;
import iot.lviv.lab2_3_4.appliances.Computer;
import iot.lviv.lab2_3_4.service.ComputerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.ws.rs.Consumes;
import javax.ws.rs.Produces;


@RequestMapping(value="/Computer")
@RestController
@ComponentScan("iot.lviv.lab2_3_4")
@Produces("application/json")
@Consumes("application/json")
public class ComputerController{
    @Autowired
    private ComputerService service;

    @PostMapping(value="/post")
    public Computer computer(@RequestBody Computer computer){
        return service.postComputer(computer);
    }

    @GetMapping(value = "/get/{id}")
    public Computer getComputer(@PathVariable int id){
        return service.getComputerId(id);
    }

    @PutMapping(value = "/put/{id}")
    public ResponseEntity<Object> putComputer(@PathVariable int id, @RequestBody Computer computer){
        return service.putComputerId(id, computer);
    }

    @DeleteMapping(value = "/delete/{id}")
    public void deleteComputer(@PathVariable int id){
        service.deleteComputerId(id);
    }
}
