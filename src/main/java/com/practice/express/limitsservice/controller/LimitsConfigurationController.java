package com.practice.express.limitsservice.controller;

import com.practice.express.limitsservice.controller.model.Configuration;
import com.practice.express.limitsservice.controller.model.LimitsConfiguration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LimitsConfigurationController {

    private Configuration configuration;

    public LimitsConfigurationController(Configuration configuration) {
        this.configuration = configuration;
    }

    @GetMapping("/limits")
    public LimitsConfiguration retrieveLimitsFromConfiguration() {
        return new LimitsConfiguration(configuration.getMaximum(),configuration.getMinimum());
    }
}