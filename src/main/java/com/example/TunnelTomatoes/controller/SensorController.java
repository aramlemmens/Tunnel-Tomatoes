package com.example.TunnelTomatoes.controller;

import com.example.TunnelTomatoes.Repository.BoxesRepository;
import com.example.TunnelTomatoes.Repository.SensorRepository;
import com.example.TunnelTomatoes.model.Boxes;
import com.example.TunnelTomatoes.model.Sensoren;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class SensorController {

    private SensorRepository sensorRepository;

    public SensorController(SensorRepository sensorRepository){
        this.sensorRepository = sensorRepository;
    }

    @GetMapping(path = "/Sensor")
    public List<Sensoren> getSensoren(){
        return sensorRepository.findAll();
    }
}
