package iot.lviv.lab2_3_4.controller;
import iot.lviv.lab2_3_4.appliances.Computer;
import iot.lviv.lab2_3_4.service.ComputerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.*;
import javax.ws.rs.*;


@Consumes("application/json")
@Produces("MediaType.APPLICATION_JSON")
@RequestMapping(value="/Computer")
@RestController
public class ComputerController{
    @Autowired
    private ComputerService service;

    @RequestMapping(value = "/post")
    public Computer postComputer(Computer computer){
            return service.getComputer(computer);
    }

    @RequestMapping(value = "/get/{id}")
    public Computer getComputer(@PathVariable int id){
        return service.getComputerId(id);
    }

    @RequestMapping(value = "/put/{id}")
    public Computer putComputer(@PathVariable int id, Computer computer){
        return service.putComputerId(id, computer);
    }

    @RequestMapping(value = "/delete/{id}")
    public void deleteComputer(@PathVariable int id){
        service.deleteComputerId(id);
    }
}
