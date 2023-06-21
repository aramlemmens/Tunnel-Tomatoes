package com.example.TunnelTomatoes.controller;

import com.example.TunnelTomatoes.Repository.BoxesRepository;
import com.example.TunnelTomatoes.Repository.MetingenRepository;
import com.example.TunnelTomatoes.model.Boxes;
import com.example.TunnelTomatoes.model.Metingen;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class BoxesController {

    private BoxesRepository boxesRepository;

    public BoxesController(BoxesRepository boxesRepository){
        this.boxesRepository = boxesRepository;
    }

    @GetMapping(path = "/Boxes")
    public List<Boxes> getBoxes(){
        return boxesRepository.findAll();
    }

}
