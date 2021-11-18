package com.example.practica.spring611;


import com.example.practica.spring611.entity.Curso;
import com.example.practica.spring611.entity.Teacher;
import com.example.practica.spring611.repository.TeacherRepositoryDao;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;


@SpringBootApplication
public class PracticaSpring16112021Application {

    public static void main(String[] args) {
        SpringApplication.run(PracticaSpring16112021Application.class, args);
    }

    @Bean
    public CommandLineRunner demo(TeacherRepositoryDao teacherRepositoryDao) {
        return args -> {
            Curso curso=new Curso("a");
            Curso cursoA=new Curso("aa");
            Curso cursoB=new Curso("ab");

            Teacher teacher=new Teacher(List.of(curso,cursoA,cursoB), "aaaa", "direc aa",30);
            teacherRepositoryDao.save(teacher);
        };
    }

}
