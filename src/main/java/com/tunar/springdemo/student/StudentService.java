package com.tunar.springdemo.student;

import java.util.List;

public interface StudentService {

    List<Student> findAllStudents();

    Student findByEmail(String email);

    Student save(Student newStudent);

    Student update(Student updatedStudent);

    void delete(String email);
}
