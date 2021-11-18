package com.example.practica.spring611.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;


@Entity

@JsonIgnoreProperties(ignoreUnknown = true)
@Table(name = "Profesores")
public class Teacher {

    @OneToMany(cascade = {CascadeType.ALL})
    @Column(name = "curso")
    private List<Curso> cursoList;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String nombre;
    private String direccion;
    private Integer edad;


    public Teacher(List<Curso> cursoList, Integer id, String nombre, String direccion, Integer edad) {
        this.cursoList = cursoList;
        this.id = id;
        this.nombre = nombre;
        this.direccion = direccion;
        this.edad = edad;
    }

    public Teacher() {

    }

    public Teacher(List<Curso> cursoList, String nombre, String direccion, Integer edad) {
        this.cursoList = cursoList;
        this.nombre = nombre;
        this.direccion = direccion;
        this.edad = edad;
    }

    public List<Curso> getCursoList() {
        return cursoList;
    }

    public void setCursoList(List<Curso> cursoList) {
        this.cursoList = cursoList;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }
}