package com.example.practica.spring611.controller;

import com.example.practica.spring611.entity.Alumno;
import com.example.practica.spring611.repository.AlumnoRepository;
import com.example.practica.spring611.repository.AlumnoRepositoryDAO;
import com.example.practica.spring611.service.AlumnoService;
import org.apache.catalina.LifecycleState;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class AlumnoController {

    @Autowired
    AlumnoService service;

    @Autowired
    AlumnoRepositoryDAO alumnoRepositoryDAO;

    @Autowired
    AlumnoRepository alumnoRepository;

    //🧑***POST DE ALUMNO***🧑//
    @PostMapping("/agregarAlumno")
    public ResponseEntity<Alumno> agregarAlumno (@RequestBody Alumno alumno){
        System.out.println("*******POST*******");
        service.addAlumno(alumno);
        return ResponseEntity.ok(alumno);
    }
    //🧑***lISTA DE ALUMNOS DE ALUMNO***🧑//
    @GetMapping("/mostrarAlumnos")
    public List<Alumno> getListaAlumnos(){
        System.out.println("*******GET*******");
        return service.getListaAlumnos();
    }
    @GetMapping("/buscarAlumnoDniNombre/{dni}/{nombre}")
    public List<Alumno> buscarAlumnoDniNombre(@PathVariable Integer dni,@PathVariable String nombre){
        System.out.println("*******GET*******");
        return alumnoRepositoryDAO.buscarAlumnoPorDniyNombre(dni,nombre);
    }
    //🧑***BORRAR ALUMNO***🧑//
    @DeleteMapping("/borrarAlumnoPorDni/{dni}")
    public ResponseEntity<Integer>borrarAlumnoPorDni(@PathVariable Integer dni){
        System.out.println("*******DELETE*******");
        alumnoRepositoryDAO.deleteById(dni);
        return ResponseEntity.ok(dni);
    }

    @PutMapping("/actualizarAlumno/{dni}")
    public ResponseEntity<Integer>actualizarAlumno(@PathVariable Integer dni, @RequestBody Alumno alumno){
        System.out.println("*******PUT*******");
        alumnoRepository.actualizaAlumno(alumno,dni);
        return ResponseEntity.ok(dni);
    }

}
