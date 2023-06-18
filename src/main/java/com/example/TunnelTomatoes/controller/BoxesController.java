package com.example.TunnelTomatoes.controller;

import com.example.TunnelTomatoes.Repository.BoxesRepository;
import com.example.TunnelTomatoes.Repository.MetingenRepository;
import com.example.TunnelTomatoes.Repository.SensorRepository;
import com.example.TunnelTomatoes.model.Boxes;
import com.example.TunnelTomatoes.service.BoxesService;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
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
//    @Autowired
//    private MetingenRepository metingenRepository;
    @Autowired
    private MetingenRepository metingenRepository;
    @Autowired
    public BoxesController(MetingenRepository metingenRepository) {
        this.metingenRepository = metingenRepository;
    }

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

    @RequestMapping(value="/meting", method = RequestMethod.GET)
    public String sensorList(Model model) {
//        model.addAttribute("list", boxesRepository.findAll());
        model.addAttribute("meting", sensorRepository.findAll());
        model.addAttribute("meting", metingenRepository.findAll());
        return "meting";
    }

//    @GetMapping("/meting")
//    public String customersPage(HttpServletRequest request, Model model) {
//
//        int page = 0; //default page number is 0 (yes it is weird)
//        int size = 150; //default page size is 10
//
//        if (request.getParameter("page") != null && !request.getParameter("page").isEmpty()) {
//            page = Integer.parseInt(request.getParameter("page")) - 1;
//        }
//
//        if (request.getParameter("size") != null && !request.getParameter("size").isEmpty()) {
//            size = Integer.parseInt(request.getParameter("size"));
//        }
//
//        model.addAttribute("meting", sensorRepository.findAll());
//
//        model.addAttribute("meting", metingenRepository.findAll(PageRequest.of(page, size)));
//        return "meting";
//    }
}
