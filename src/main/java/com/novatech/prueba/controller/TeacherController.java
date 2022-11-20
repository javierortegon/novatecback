package com.novatech.prueba.controller;

import com.novatech.prueba.model.Teacher;
import com.novatech.prueba.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin(origins ="*")
@RestController
@RequestMapping("api")
public class TeacherController {

    @Autowired
    private TeacherService teacherService;

    @GetMapping("/teachers")
    public List<Teacher> getAll(){
        return teacherService.getTeachers();
    }

}
