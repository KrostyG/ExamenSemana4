package com.example.practica.spring611.service;

import com.example.practica.spring611.entity.Alumno;
import com.example.practica.spring611.repository.AlumnoRepository;
import com.example.practica.spring611.repository.AlumnoRepositoryDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AlumnoService {

    @Autowired
    AlumnoRepository alumnoRepository;

    @Autowired
    AlumnoRepositoryDAO alumnoRepositoryDAO;

    public void addAlumno(Alumno alumno){
        alumnoRepository.crearAlumno(alumno);
    }
    public void eliminarAlumno(Integer dni){
        alumnoRepository.eliminarAlumno(dni);
    }

    public List<Alumno> getAlumnoDniNombre(Integer dni, String nombre){
        return alumnoRepositoryDAO.buscarAlumnoPorDniyNombre(dni,nombre);
    }
    public List<Alumno>getListaAlumnos(){
        return (List<Alumno>) alumnoRepositoryDAO.findAll();
    }
}
