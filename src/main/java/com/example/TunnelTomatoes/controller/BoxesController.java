package com.example.TunnelTomatoes.controller;

import com.example.TunnelTomatoes.DTO.BoxesDto;
import com.example.TunnelTomatoes.Repository.BoxesRepository;
import com.example.TunnelTomatoes.model.Boxes;
import com.example.TunnelTomatoes.service.BoxesService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/boxes")
public class BoxesController {

    private BoxesService boxesService;

    @Autowired
    public BoxesController(BoxesService boxesService){
        this.boxesService = boxesService;
    }

    @GetMapping(path = "/")
    public String listBoxes(Model model){
        List<BoxesDto> boxes = boxesService.findallboxes();
        model.addAttribute("boxes", boxes);
        return "boxes-list";
    }


}
