package com.tunar.springdemo.student;

import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Integer> {
    Student findStudentByEmail(String email);

    void deleteStudentByEmail(String email);
}
