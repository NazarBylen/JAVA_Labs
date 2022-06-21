package iot.lviv.lab2_3_4.service;

import iot.lviv.lab2_3_4.appliances.Computer;
import iot.lviv.lab2_3_4.repository.ComputerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;


@Service
public class ComputerService {
    @Autowired
    ComputerRepository compRepository;

    public Computer postComputer(Computer com){
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

    public ResponseEntity<Object> putComputerId(int id, Computer com) {

        if (compRepository.findById(id).isEmpty()) {
            throw new NullPointerException("Parameter Type cannot be null");
        } else {
            Computer com2 = compRepository.findById(id).get();
            com2.setId(id);
            com2.setDevice(com.getDevice());
            com2.setAmp(com.getAmp());
            com2.setBattery(com.getBattery());
            com2.setVolt(com.getVolt());
            return new ResponseEntity<Object>(compRepository.save(com2), HttpStatus.OK);
        }
    }
    public void deleteComputerId(int id) {
        compRepository.deleteById(id);
    }
}
