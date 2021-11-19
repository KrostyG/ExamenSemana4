package com.example.practica.spring611.repository;

import com.example.practica.spring611.entity.Alumno;
import com.example.practica.spring611.entity.Contenido;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class ContenidoRepository {
    @Autowired
    ContenidoRepositoryDAO contenidoRepositoryDAO;

    public void crearContenido(Contenido contenido){contenidoRepositoryDAO.save(contenido);}

    public void eliminarContenido(Integer id){contenidoRepositoryDAO.deleteById(id);}

    public  void actualizarContenido(Contenido alumno, Integer id){
        contenidoRepositoryDAO.save(alumno);
        contenidoRepositoryDAO.deleteById(id);
    }
}
