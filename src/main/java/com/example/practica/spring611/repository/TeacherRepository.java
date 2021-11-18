package com.example.practica.spring611.repository;

import com.example.practica.spring611.entity.Teacher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class TeacherRepository {

        @Autowired
        TeacherRepositoryDao teacherRepositoryDao;


        public void creacionMaestros(Teacher teacher) {
            teacherRepositoryDao.save(teacher);
        }
    }