package com.g_etudiant.service;

import com.g_etudiant.entities.Student;
import com.g_etudiant.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Service
public class StudentService {
    @Autowired
     StudentRepository studentRepository;
    public Student addStudent(Student student) {
        return studentRepository.save(student);

    }
    public List<Student> getAllStudent() {
        return studentRepository.findAll();
    }
    public Student getStudentById(Long id) {
        return studentRepository.findById(id).get();
    }
    public Student updateStudent( Long id, Student student) {
        return studentRepository.save(student);
    }
    public boolean deleteStudentById(@PathVariable Long id) {
        studentRepository.deleteById(id);
        return studentRepository.existsById(id);
    }

}
