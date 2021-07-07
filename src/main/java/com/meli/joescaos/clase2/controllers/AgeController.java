package com.meli.joescaos.clase2.controllers;

import com.meli.joescaos.clase2.handlers.AgeHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/age")
public class AgeController {
    @GetMapping("/{day}/{month}/{year}")
    public String getAge(@PathVariable Integer day, @PathVariable Integer month, @PathVariable Integer year){

        return "Tu edad es: " + AgeHandler.getAge(day, month, year);
    }
}
