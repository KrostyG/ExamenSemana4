package com.example.practica.spring611.repository;

import com.example.practica.spring611.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class StudentRepository {

    @Autowired

    StudentRepositoryDao studentRepositoryDao;

    public void creacionEstudiante(Student student) {
        studentRepositoryDao.save(student);
    }
}
