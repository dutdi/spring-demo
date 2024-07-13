package com.tunar.springdemo.student;

import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class StudentService {
    public List<Student> findAllStudents() {
        return List.of(
                new Student(
                        "Tunar",
                        "Mahmudov",
                        "tunar@mail.com",
                        26,
                        LocalDate.of(1998, 12, 19)),
                new Student(
                        "Aysel",
                        "Qarayeva",
                        "aysel@mail.com",
                        36,
                        LocalDate.of(1988, 3, 1))
        );
    }
}
