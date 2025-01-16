package com.example.fruitapp.controller;

import com.example.fruitapp.model.Root;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/fruit")
public class FruitController {

    private static final String API_URL = "https://www.fruityvice.com/api/fruit/";
    private final RestTemplate restTemplate;
   

    @Autowired
    public FruitController(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @GetMapping("/fetch")
    public String fetchFruitPage() {
        return "fetch-fruit";
    }

    @PostMapping("/fetch")
    public String fetchFruit(@RequestParam String name, Model model) {
        try {
            Root fruit = restTemplate.getForObject(API_URL + name, Root.class);
            model.addAttribute("fruit", fruit);
        } catch (Exception e) {
            model.addAttribute("error", "Fruit not found!");
        }
        return "fruit-details";
    }

}
