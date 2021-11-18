package com.example.practica.spring611.controller;


import com.example.practica.spring611.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Htmlcontroller {

    @Autowired
    private StudentService service;

  @GetMapping("/homepage")
    public String homepage(Model model) {
        model.addAttribute("yoSoy", "aaaaaaaaa");
        return "home";
    }



    @GetMapping("/listaAlumnos")
    public String listaAlumnos(Model model) {
        model.addAttribute("students", service.getLista());
        return "alumnos"; //Es el mismo nombre del archivo HTML
    }

}


