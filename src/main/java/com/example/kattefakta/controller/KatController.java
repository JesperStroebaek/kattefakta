package com.example.kattefakta.controller;

import com.example.kattefakta.Services.KatCode;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class KatController {
    KatCode katCode = new KatCode();

    @GetMapping("/")
    @ResponseBody

    public String katKode(){
        return "Davs"+katCode;
    }
}
