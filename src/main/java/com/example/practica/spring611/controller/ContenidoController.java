package com.example.practica.spring611.controller;

import com.example.practica.spring611.entity.Alumno;
import com.example.practica.spring611.entity.Contenido;
import com.example.practica.spring611.entity.Expediente;
import com.example.practica.spring611.repository.ContenidoRepository;
import com.example.practica.spring611.repository.ContenidoRepositoryDAO;
import com.example.practica.spring611.service.ContenidoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ContenidoController {
    @Autowired
    ContenidoRepository contenidoRepository;

    @Autowired
    ContenidoRepositoryDAO contenidoRepositoryDAO;

    @Autowired
    ContenidoService contenidoService;

    //(⌐■_■)***GET DE CONTENIDO***(⌐■_■)//
    @GetMapping("/verContenidos")
    public List<Contenido> verContenidos() {
        System.out.println("*******GET*******");
        return contenidoService.getListaContenidos();
    }

    //(⌐■_■)***POST DE CONTENIDO***(⌐■_■)//
    @PostMapping("/agregarContenido")
    public ResponseEntity<Contenido> agregarContenido(@RequestBody Contenido contenido) {
        System.out.println("*******POST*******");
        contenidoService.addContenido(contenido);
        return ResponseEntity.ok(contenido);
    }

    //(⌐■_■)***DELETE DE CONTENIDO***(⌐■_■)//
    @DeleteMapping("/eliminarContenidoPorId/{id}")
    public ResponseEntity<Integer>eliminarContenidoPorId(@PathVariable Integer id){
        System.out.println("*******DELETE*******");
        contenidoRepositoryDAO.deleteById(id);
        return ResponseEntity.ok(id);
    }
    //(⌐■_■)***PUT DE CONTENIDO***(⌐■_■)//
    @PutMapping("/actualizarContenido/{id}")
    public ResponseEntity<Integer>actualizarContenido(@PathVariable Integer id, @RequestBody Contenido contenido){
        contenidoRepository.actualizarContenido(contenido,id);
        return ResponseEntity.ok(id);
    }

}
