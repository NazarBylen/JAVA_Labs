package iot.lviv.lab2_3_4.service;

import iot.lviv.lab2_3_4.appliances.Computer;
import iot.lviv.lab2_3_4.repository.ComputerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

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
}
