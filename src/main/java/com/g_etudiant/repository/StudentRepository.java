package com.g_etudiant.repository;

import com.g_etudiant.entities.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {
    public List<Student> findByNameContainingIgnoreCase(String name);
    public List<Student> findByVille(String ville);

}
