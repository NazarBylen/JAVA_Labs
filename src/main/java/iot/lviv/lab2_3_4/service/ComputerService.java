package iot.lviv.lab2_3_4.service;

import iot.lviv.lab2_3_4.appliances.Computer;
import iot.lviv.lab2_3_4.repository.ComputerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;


@Component
@Service
public class ComputerService {
    @Autowired
    ComputerRepository compRepository;

    public Computer getComputer(Computer com){
        if (com == null){
            throw new NullPointerException("Parameter Type cannot be null");
        }
        else {
            return compRepository.save(com);
        }
    }

    public Computer getComputerId(int id) {
        return compRepository.findById(id).orElse(null);
    }

    public Computer putComputerId(int id, Computer com) {
        Computer computerPut = compRepository.findById(id).orElse(null);
        //setting new values from code, not JSON
        com.setBattery(45);
        com.setVolt(4568676);
        com.setAmp(4555);
        com.setDevice("Computer2");

        if (compRepository.findById(id).isEmpty()) {
            throw new NullPointerException("Parameter Type cannot be null");
        } else {
            assert computerPut != null;
            computerPut.setAmp(com.getAmp());
            computerPut.setId(id);
            computerPut.setVolt(com.getVolt());
            computerPut.setBattery(com.getBattery());
            computerPut.setDevice(com.getDevice());
            return compRepository.save(computerPut);
        }
    }
    public void deleteComputerId(int id) {
        compRepository.deleteById(id);
    }
}
