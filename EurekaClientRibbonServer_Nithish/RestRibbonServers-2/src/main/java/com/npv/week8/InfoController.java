package com.npv.week8;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.LinkedHashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class InfoController {
    @Autowired Environment env;
    
    @GetMapping("/")
    public Map<String, Object> info() {
        Map<String, Object> m = new LinkedHashMap<>();
        m.put("date", LocalDate.now().toString());
        m.put("time", LocalTime.now().toString());
        m.put("port", env.getProperty("local.server.port"));
        m.put("applicationName", env.getProperty("spring.application.name"));
        return m;
    }

    @GetMapping("/backend")
    public String backend() {
        return "Date: " + LocalDate.now()
             + ", Time: " + LocalTime.now()
             + ", Port: " + env.getProperty("local.server.port")
             + ", App: " + env.getProperty("spring.application.name");
    }
}
