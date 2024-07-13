package com.tunar.springdemo.student;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InMemoryStudentService implements StudentService {
    private final InMemoryStudentDao dao;

    public InMemoryStudentService(InMemoryStudentDao dao) {
        this.dao = dao;
    }

    @Override
    public List<Student> findAllStudents() {
        return this.dao.findAllStudents();
    }

    @Override
    public Student findByEmail(String email) {
        return this.dao.findByEmail(email);
    }

    @Override
    public Student save(Student newStudent) {
        return this.dao.save(newStudent);
    }

    @Override
    public Student update(Student updatedStudent) {
        return this.dao.update(updatedStudent);
    }

    @Override
    public void delete(String email) {
        this.dao.delete(email);
    }
}
