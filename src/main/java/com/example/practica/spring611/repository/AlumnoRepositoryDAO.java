package com.example.practica.spring611.repository;

import com.example.practica.spring611.entity.Alumno;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import javax.transaction.Transactional;
import java.util.List;

@Transactional
public interface AlumnoRepositoryDAO extends CrudRepository<Alumno,Integer> {

    @Query(value = "Select * from alumnos where dni=:dni and nombre=:nombre", nativeQuery = true)
    List<Alumno> buscarAlumnoPorDniyNombre(@Param("dni") Integer dni,@Param("nombre") String nombre);

    @Query(value = "select * from profesores",nativeQuery = true)
    List<Alumno>mostrarListaDeAlumnos(Alumno alumno);



}
