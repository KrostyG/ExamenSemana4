package com.example.practica.spring611.service;

import com.example.practica.spring611.entity.Contenido;
import com.example.practica.spring611.repository.ContenidoRepository;
import com.example.practica.spring611.repository.ContenidoRepositoryDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ContenidoService {

    @Autowired
    ContenidoRepository contenidoRepository;

    @Autowired
    ContenidoRepositoryDAO contenidoRepositoryDAO;

    public void addContenido (Contenido contenido){
        contenidoRepository.crearContenido(contenido);
    }
    public void eliminarContenido(Integer id){
        contenidoRepository.eliminarContenido(id);
    }

    public List<Contenido> getContenidoIdNombre(Integer id, String nombre){
        return contenidoRepositoryDAO.buscarContenidoPorIdyNombre(id, nombre);
    }
    public List<Contenido> getListaContenidos(){
        return (List<Contenido>) contenidoRepositoryDAO.findAll();
    }
}
