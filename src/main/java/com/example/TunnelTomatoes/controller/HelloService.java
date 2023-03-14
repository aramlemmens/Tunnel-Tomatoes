//package com.example.TunnelTomatoes.controller;
//
//import org.springframework.web.bind.annotation.*;
//
//
//@RestController
//
//public class HelloService {
//    @GetMapping(path = "/")
//    public String hello(){
//        return "hello";
//    }
//    @PostMapping(path = "/process", produces = "text/plain")
//    public String process(@RequestBody String payload) throws Exception {
//        System.out.println(payload);
//        return "200";
//    }
//
//}