package com.example.ReactAPI;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "http://localhost:3001/")
@RestController

public class ReactController {

    @GetMapping("/backend")
    public String get()
    {
        return"Hi ,I'm Backend";
    }
}
