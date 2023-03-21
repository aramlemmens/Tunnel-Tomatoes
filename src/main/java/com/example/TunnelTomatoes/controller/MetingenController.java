package com.example.TunnelTomatoes.controller;

import com.example.TunnelTomatoes.Repository.MetingenRepository;
import com.example.TunnelTomatoes.model.Metingen;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RestController
public class MetingenController {

    private MetingenRepository metingenRepository;

    public MetingenController(MetingenRepository metingenRepository){
        this.metingenRepository = metingenRepository;
    }

    @GetMapping(path = "/Metingen")
    public List<Metingen> getMetingen(){
        return metingenRepository.findAll();
    }

}
