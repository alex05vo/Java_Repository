package com.lab9.lab9.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class RadDecayController {

    @GetMapping("/")
    public String index(Model model) {
        return "index";
    }

    @PostMapping("/calculate")
    public String calculate(
            @RequestParam("n0") int n0,
            @RequestParam("lambda") double lambda,
            @RequestParam("t") double t,
            Model model) {

        int n = (int) (n0 * (1 - Math.exp(-lambda * t)));
        model.addAttribute("n", n);
        return "index";
    }
}