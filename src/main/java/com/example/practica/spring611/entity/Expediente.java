package com.example.practica.spring611.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.util.List;

@Entity
@JsonIgnoreProperties(ignoreUnknown = true)
@Table(name = "expedientes")
public class Expediente {

    /*@OneToMany(cascade = CascadeType.ALL)
    @Column(name = "alumnos")
    private List<Alumno> alumnoList;*/

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer idEstudiante;
    private String fechaInscripcion;
    private Integer calificacion;
    private String fechaFin;

    public Expediente(Integer idEstudiante, String fechaInscripcion, Integer calificacion, String fechaFin) {
        this.idEstudiante = idEstudiante;
        this.fechaInscripcion = fechaInscripcion;
        this.calificacion = calificacion;
        this.fechaFin = fechaFin;
    }

    public Expediente() {
    }

    public Integer getIdEstudiante() {
        return idEstudiante;
    }

    public void setIdEstudiante(Integer idEstudiante) {
        this.idEstudiante = idEstudiante;
    }

    public String getFechaInscripcion() {
        return fechaInscripcion;
    }

    public void setFechaInscripcion(String fechaInscripcion) {
        this.fechaInscripcion = fechaInscripcion;
    }

    public Integer getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(Integer calificacion) {
        this.calificacion = calificacion;
    }

    public String getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(String fechaFin) {
        this.fechaFin = fechaFin;
    }
}
