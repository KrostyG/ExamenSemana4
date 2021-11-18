package com.example.practica.spring611.service;

import com.example.practica.spring611.entity.Student;
import com.example.practica.spring611.entity.Teacher;
import com.example.practica.spring611.repository.StudentRepository;
import com.example.practica.spring611.repository.TeacherRepositoryDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    @Autowired
    TeacherRepositoryDao teacherRepositoryDao;
    StudentRepository StudentRepo;

    public void AddStudent(Student student) {

        StudentRepo.creacionEstudiante(student);

    }

    public List<Student> getLista() {
        return null;
    }

    public Student getStudent(String name) {
        return null;
    }

}