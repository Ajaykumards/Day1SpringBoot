package com.example.Day1REST.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class HelloController
{
    @GetMapping("/hello")
    public Map<String,String> hello()
    {
        Map<String,String> response = new HashMap<>();
        response.put("message","Hello Ajay");
        return response;
    }

    @GetMapping("/ping")
    public String ping()
    {
        return "Ping";
    }

    @GetMapping("/time")
    public Map<String,String> getTime()
    {
        Map<String,String> res = new HashMap<>();
        res.put("time",java.time.LocalDate.now().toString());
        return res;
    }

}
