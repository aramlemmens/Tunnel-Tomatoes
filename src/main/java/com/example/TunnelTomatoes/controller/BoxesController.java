package com.example.TunnelTomatoes.controller;

import com.example.TunnelTomatoes.Repository.BoxesRepository;
import com.example.TunnelTomatoes.model.Boxes;
import com.example.TunnelTomatoes.service.BoxesService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class BoxesController {

    @Autowired
    private BoxesRepository boxesRepository;

    public BoxesController(BoxesRepository boxesRepository){
        this.boxesRepository = boxesRepository;
    }

    @GetMapping(path = "/Boxes")
    public List<Boxes> getBoxes(){
        return boxesRepository.findAll();
    }

}
