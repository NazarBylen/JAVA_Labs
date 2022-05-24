package iot.lviv.lab2_3_4.service;

import iot.lviv.lab2_3_4.appliances.Computer;
import iot.lviv.lab2_3_4.repository.ComputerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ComputerService {
    @Autowired
    ComputerRepository compRepository;


    public List<Computer> findAllComps() {

        List<Computer> allcomps = compRepository.findAll();
        return allcomps;
    }
    public Computer getComputer(Computer com){
        return compRepository.save(com);
    }

    public Computer getComputerId(int id) {
        return compRepository.findById(id).orElse(null);
    }

    public Computer putComputerId(int id, Computer com) {
        Computer computerPut = compRepository.findById(id).orElse(null);

        computerPut.setAmp(com.getAmp());
        computerPut.setId(id);

        return compRepository.save(computerPut);
    }

    public void deleteComputerId(int id) {
        compRepository.deleteById(id);
    }
}
