package com.example.practica.spring611.repository;

import com.example.practica.spring611.entity.Student;
import org.springframework.data.repository.CrudRepository;

public interface StudentRepositoryDao extends CrudRepository<Student,Integer>{
}
