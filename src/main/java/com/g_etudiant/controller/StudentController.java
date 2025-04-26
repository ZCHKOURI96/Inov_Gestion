package com.g_etudiant.controller;

import com.g_etudiant.entities.Student;
import com.g_etudiant.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class StudentController {
    @Autowired
    StudentService studentService;
    @PostMapping("addstudent")
    public Student addStudent(@RequestBody Student student) {
        return studentService.addStudent(student);
    }
    @GetMapping("getallstudent")
    public List<Student> getAllStudent() {
        return studentService.getAllStudent();
    }
    @GetMapping("student/{id}")
    public Student getStudentById(@PathVariable Long id) {
        return studentService.getStudentById(id);
    }
    @PutMapping("updatestudent/{id}")
            public Student updateStudent(@PathVariable Long id, @RequestBody Student student)
    {
        return studentService.updateStudent(id, student);
    }
    @DeleteMapping("deletes/{id}")
    public boolean deleteStudentById(@PathVariable Long id) {
        return studentService.deleteStudentById(id);

    }
}
