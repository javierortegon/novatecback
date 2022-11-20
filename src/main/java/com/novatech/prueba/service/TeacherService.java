package com.novatech.prueba.service;

import com.novatech.prueba.model.Teacher;

import java.util.List;

public interface TeacherService {
    List<Teacher> getTeachers();

    Teacher saveTeacher(Teacher teacher);

    Teacher getTeacher(Long id);

    Teacher updateTeacher(Teacher teacher);

    void deleteTeacher(Long id);
}
