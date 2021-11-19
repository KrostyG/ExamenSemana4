package com.example.practica.spring611.repository;

import com.example.practica.spring611.entity.Contenido;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface ContenidoRepositoryDAO extends CrudRepository<Contenido,Integer> {

    @Query(value = "Select * from contenidos where id=:id and nombre=:nombre", nativeQuery = true)
    List<Contenido> buscarContenidoPorIdyNombre(@Param("id") Integer id, @Param("nombre") String nombre);

}
