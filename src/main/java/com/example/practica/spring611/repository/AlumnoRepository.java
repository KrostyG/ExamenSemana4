package com.example.practica.spring611.repository;

import com.example.practica.spring611.entity.Alumno;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class AlumnoRepository {

    @Autowired
    AlumnoRepositoryDAO alumnoRepositoryDAO;

    public void crearAlumno(Alumno alumno){alumnoRepositoryDAO.save(alumno);}

    public void eliminarAlumno(Integer dni){alumnoRepositoryDAO.deleteById(dni);}

    public  void actualizaAlumno(Alumno alumno, Integer dni){
        alumnoRepositoryDAO.save(alumno);
        alumnoRepositoryDAO.deleteById(dni);
    }
}
