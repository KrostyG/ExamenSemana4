package com.example.practica.spring611.service;

import com.example.practica.spring611.entity.Alumno;
import com.example.practica.spring611.entity.Expediente;
import com.example.practica.spring611.repository.ExpedienteRepository;
import com.example.practica.spring611.repository.ExpedienteRepositoryDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ExpedienteService {

    @Autowired
    ExpedienteRepository expedienteRepository;

    @Autowired
    ExpedienteRepositoryDAO expedienteRepositoryDAO;

    public void generarExpedient (Expediente expediente){
        expedienteRepository.generarExpediente(expediente);
    }
    public List<Expediente> getListaExpedientes(){
        return (List<Expediente>) expedienteRepositoryDAO.findAll();
    }

    public void eliminarExpediente(Integer id){
        expedienteRepository.eliminarExpediente(id);
    }


}
