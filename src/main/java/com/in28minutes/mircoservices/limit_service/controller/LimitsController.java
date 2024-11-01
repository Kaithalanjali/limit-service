package com.in28minutes.mircoservices.limit_service.controller;

import com.in28minutes.mircoservices.limit_service.configuration.Configuration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LimitsController {

    @Autowired
    private Configuration configuration;

    @GetMapping("/limits")
    public Limits retrieveLimits() {
        return new Limits(Configuration.getMaximum(), Configuration.getMinimum());
    }
}
