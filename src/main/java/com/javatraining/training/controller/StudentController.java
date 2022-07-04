package com.javatraining.training.controller;

import com.javatraining.training.model.Student;
import com.javatraining.training.repository.StudentRepository;
import com.javatraining.training.service.Studentservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class StudentController {

    @Autowired
    Studentservice studentservice;

    @GetMapping("/Student")
    public List<Student> getStudent() {
        return studentservice.getStudent();
    }

    @PostMapping("/addnew")
    public String saveStudent(@RequestBody Student student) {
        return studentservice.saveStudent(student);
    }
}
