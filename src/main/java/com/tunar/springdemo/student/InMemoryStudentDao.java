package com.tunar.springdemo.student;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

@Repository
public class InMemoryStudentDao {
    private final List<Student> students = new ArrayList<>();

    public List<Student> findAllStudents() {
        return students;
    }

    public Student findByEmail(String email) {
        return students.stream()
                .filter(s -> email.equals(s.getEmail()))
                .findFirst()
                .orElse(null);
    }

    public Student save(Student newStudent) {
        students.add(newStudent);
        return newStudent;
    }

    public Student update(Student updatedStudent) {
        int studentIndex = IntStream.range(0, students.size())
                .filter(i -> students.get(i).getEmail().equals(updatedStudent.getEmail()))
                .findFirst()
                .orElse(-1);
        if (studentIndex > -1) {
            students.set(studentIndex, updatedStudent);
            return updatedStudent;
        } else {
            return null;
        }
    }

    public void delete(String email) {
        Student student = findByEmail(email);
        if (student != null) {
            students.remove(student);
        }
    }
}
