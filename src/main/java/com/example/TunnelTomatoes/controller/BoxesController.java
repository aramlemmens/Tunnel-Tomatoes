package com.example.TunnelTomatoes.controller;

import com.example.TunnelTomatoes.Repository.BoxesRepository;
import com.example.TunnelTomatoes.Repository.SensorRepository;
import com.example.TunnelTomatoes.model.Boxes;
import com.example.TunnelTomatoes.service.BoxesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class BoxesController {


    @Autowired
    private BoxesRepository boxesRepository;
    @Autowired
    private SensorRepository sensorRepository;


    public BoxesController(BoxesRepository boxesRepository){
        this.boxesRepository = boxesRepository;
    }

    @GetMapping(path = "/Boxes")
    public List<Boxes> getBoxes(){
        return boxesRepository.findAll();
    }

    @Autowired
    private BoxesService boxesService;

    @GetMapping(path = "/test")
    public String listBoxes(Model model) {
        List<Boxes> boxes = boxesRepository.findAll();
        model.addAttribute("boxes", boxes);
        return "niks";
    }

//    @RequestMapping(value="/list", method = RequestMethod.GET)
//    public String boxesList(Model model) {
//        model.addAttribute("list", boxesRepository.findAll());
//        return "thymeleafTemplate";
//    }

    @RequestMapping(value="/Boxestest", method = RequestMethod.GET)
    public String sensorList(Model model) {
        model.addAttribute("list", boxesRepository.findAll());
        model.addAttribute("list", sensorRepository.findAll());
        return "thymeleafTemplate";
    }

}
