package com.devworld.pcf;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PcfArchitectureDemo {


    @GetMapping(value="/welcome")
    public String welcome(){
        return "Welcome to PCF world";
    }
}
