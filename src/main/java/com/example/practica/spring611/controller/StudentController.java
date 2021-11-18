package com.example.practica.spring611.controller;

import com.example.practica.spring611.entity.Student;
import com.example.practica.spring611.entity.Teacher;
import com.example.practica.spring611.repository.TeacherRepository;
import com.example.practica.spring611.repository.TeacherRepositoryDao;
import com.example.practica.spring611.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentController {

    @Autowired
    private StudentService service;

    @Autowired
    private TeacherRepositoryDao repositoryDao;


    //Creacion del alumno
    @PostMapping
    public ResponseEntity<Student> addStudent(@RequestBody Student student) {
        System.out.println("Se hizo la solicitud");
        service.AddStudent(student);
        return ResponseEntity.ok(student);
    }

    @GetMapping("/{pornombre}/{nombrevariable}")
    public Student getStudentByName(@PathVariable("nombrevariable") String name) {
        return service.getStudent(name);
    }


}