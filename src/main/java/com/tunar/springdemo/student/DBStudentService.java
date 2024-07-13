package com.tunar.springdemo.student;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DBStudentService implements StudentService {
    private final StudentRepository repository;

    public DBStudentService(StudentRepository repository) {
        this.repository = repository;
    }

    @Override
    public List<Student> findAllStudents() {
        return this.repository.findAll();
    }

    @Override
    public Student findByEmail(String email) {
        return this.repository.findStudentByEmail(email);
    }

    @Override
    public Student save(Student newStudent) {
        return this.repository.save(newStudent);
    }

    @Override
    public Student update(Student updatedStudent) {
        return this.repository.save(updatedStudent);
    }

    @Override
    public void delete(String email) {
        this.repository.deleteStudentByEmail(email);
    }
}
