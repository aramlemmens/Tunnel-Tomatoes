package com.example.TunnelTomatoes.service.impl;

import com.example.TunnelTomatoes.Repository.SensorRepository;
import com.example.TunnelTomatoes.model.Sensoren;
import com.example.TunnelTomatoes.service.SensorenService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class SensorenServiceImpl implements SensorenService {

    private SensorRepository sensorRepository;

    @Override
    public List<Sensoren> findallSensoren() {
        List<Sensoren> sensoren = sensorRepository.findAll();
        return sensoren.stream().map((sensor) -> mapToSensoren(sensor)).collect(Collectors.toList());
    }

    private Sensoren mapToSensoren(Sensoren sensor){
        Sensoren sensoren = Sensoren.builder()
                .sensorid(sensor.getSensorid())
                .boxid(sensor.getBoxid())
                .soort(sensor.getSoort())
                .eenheid(sensor.getEenheid())
                .build();
        return sensoren;
    }
}
