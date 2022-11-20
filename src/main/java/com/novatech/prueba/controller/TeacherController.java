package com.novatech.prueba.controller;

import com.novatech.prueba.model.Teacher;
import com.novatech.prueba.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins ="*")
@RestController
@RequestMapping("api")
public class TeacherController {

    @Autowired
    private TeacherService teacherService;

    @GetMapping("/teacher/all")
    public List<Teacher> getAll(){
        return teacherService.getTeachers();
    }

    @PostMapping("/teacher/new")
    public Teacher save(@RequestBody Teacher newTeacher){
        return teacherService.saveTeacher(newTeacher);
    }

    @GetMapping("/teacher/{id}")
    public Teacher getById(@PathVariable long id){
        return teacherService.getTeacher(id);
    }

    @PostMapping("/teacher/update/{id}")
    public Teacher update(@RequestBody Teacher teacher, @PathVariable long id){
        teacher.setId(id);
        return teacherService.updateTeacher(teacher);
    }

    @DeleteMapping("/teacher/delete/{id}")
    public void delete(@PathVariable long id){
        teacherService.deleteTeacher(id);
    }
}
