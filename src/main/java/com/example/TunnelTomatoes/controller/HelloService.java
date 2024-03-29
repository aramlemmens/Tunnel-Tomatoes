package com.example.TunnelTomatoes.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;


@Controller
public class HelloService {
    @GetMapping(value = "/Hallotest")
    public String getTemplate(@RequestParam(name="name", required = false, defaultValue = "World")
                              String name, Model model){
        model.addAttribute("name", name);
        return "boxes-list";
    }
}