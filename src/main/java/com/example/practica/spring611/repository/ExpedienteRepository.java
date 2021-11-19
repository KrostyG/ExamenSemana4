package com.example.practica.spring611.repository;

import com.example.practica.spring611.entity.Alumno;
import com.example.practica.spring611.entity.Expediente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class ExpedienteRepository {

    @Autowired
    ExpedienteRepositoryDAO expedienteRepositoryDAO;

    public void generarExpediente(Expediente expediente){expedienteRepositoryDAO.save(expediente);}

    public void eliminarExpediente(Integer id){expedienteRepositoryDAO.deleteById(id);}

    public  void actualizarExpediente(Expediente expediente, Integer id){
        expedienteRepositoryDAO.save(expediente);
        expedienteRepositoryDAO.deleteById(id);
    }
}
