package com.example.practica.spring611.controller;

import com.example.practica.spring611.entity.Expediente;
import com.example.practica.spring611.repository.ExpedienteRepository;
import com.example.practica.spring611.repository.ExpedienteRepositoryDAO;
import com.example.practica.spring611.service.ExpedienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.persistence.criteria.CriteriaBuilder;
import java.util.List;

@RestController
public class ExpedienteController {

    @Autowired
    ExpedienteRepository expedienteRepository;
    @Autowired
    ExpedienteRepositoryDAO expedienteRepositoryDAO;
    @Autowired
    ExpedienteService expedienteService;

    //📃***POST DE EXPEDIENTE***📃//
    @PostMapping("/generarExpediente")
    public ResponseEntity<Expediente> generarExpediente(@RequestBody Expediente expediente) {
        System.out.println("*******POST*******");
        expedienteService.generarExpedient(expediente);
        return ResponseEntity.ok(expediente);
    }
    //📃***GET DE EXPEDIENTE***📃//
    @GetMapping("/verExpediente")
    public List<Expediente>verExpediente(){
        System.out.println("*******GET*******");
        return expedienteService.getListaExpedientes();
    }

    //📃***DELETE DE EXPEDIENTE***📃//
    @DeleteMapping("/eliminarExpedientePorId/{id}")
    public ResponseEntity<Integer>eliminarExpedientePorId(@PathVariable Integer id){
        System.out.println("*******DELETE*******");
        expedienteRepositoryDAO.deleteById(id);
        return ResponseEntity.ok(id);
    }
    //📃***PUT DE EXPEDIENTE***📃//
    @PutMapping("/actualizarExpediente/{id}")
    public ResponseEntity<Integer>actualizarAlumno(@PathVariable Integer id, @RequestBody Expediente expediente){
        expedienteRepository.actualizarExpediente(expediente,id);
        return ResponseEntity.ok(id);
    }
}
