package com.example.practica.spring611.repository;

import com.example.practica.spring611.entity.Teacher;
import com.example.practica.spring611.entity.Teacher2;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
public interface TeacherRepositoryDao extends CrudRepository<Teacher, Integer> {
    public List<Teacher> findTeacherByNombreAndAndEdad(String name, Integer edad);

    @Query(value = "Select * from profesores where nombre=:nombre and edad=:edad", nativeQuery = true)
    public List<Teacher> findTeacherByNombreAndAndEdadPorQueryNativa(@Param("nombre") String name, Integer edad);

    @Query(value = "Select t from Teacher t where t.nombre=:nombre and t.edad=:edad")
    public List<Teacher> findTeacherByNombreAndAndEdadPorJPQueryN(@Param("nombre") String name, Integer edad);

    @Query(value = "Select t.nombre from Teacher t where t.edad=:edad")
    public List<String> findTeacherByNombreAndAndEdadPorJPQueryN2(Integer edad);

    @Query(value = "Select new com.example.practica.spring611.entity.Teacher2(t.nombre, t.direccion) from Teacher t where t.edad=:edad")
    public List<Teacher2> findTeacherByNombreAndAndEdadPorJPQueryN3(Integer edad);


    @Query(value = "Select t from Teacher t join t.cursoList c where c.nombre=:nombre")
    public List<Teacher> findTeacherByNombreJoinCurso(String nombre);

}