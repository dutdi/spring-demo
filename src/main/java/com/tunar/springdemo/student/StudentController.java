package com.tunar.springdemo.student;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/students")
public class StudentController {
    private final StudentService service;

    public StudentController(@Qualifier("DBStudentService") StudentService service) {
        this.service = service;
    }

    @GetMapping
    public List<Student> findAllStudents() {
        return this.service.findAllStudents();
    }

    @GetMapping("/{email}")
    public Student findByEmail(@PathVariable("email") String email) {
        return this.service.findByEmail(email);
    }

    @PostMapping
    public Student save(@RequestBody Student newStudent) {
        return this.service.save(newStudent);
    }

    @PutMapping
    public Student update(@RequestBody Student updatedStudent) {
        return this.service.update(updatedStudent);
    }

    @DeleteMapping("/{email}")
    public void delete(@PathVariable("email") String email) {
        this.service.delete(email);
    }
}
