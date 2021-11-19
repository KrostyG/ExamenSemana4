package com.example.practica.spring611.repository;

import com.example.practica.spring611.entity.Teacher;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.criteria.CriteriaBuilder;
import java.util.List;

public class TeacherRepositoryImp {
    @PersistenceContext
    private EntityManager entityManager;

    /*  Pendiente por terminar
    public List<Teacher> findTeacherByAddress(String name, String address){
        CriteriaBuilder criteriaBuilder = entityManager.getCriteriaBuilder();
        CriteriaBuilder teacherCriteriaBuilder;

    }*/
}
