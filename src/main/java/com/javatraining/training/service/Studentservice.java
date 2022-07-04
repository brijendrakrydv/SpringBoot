package com.javatraining.training.service;

import com.javatraining.training.model.Student;
import com.javatraining.training.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Service
public class Studentservice {

    @Autowired
    StudentRepository studentRepository;

    @GetMapping("/Student")
    public List<Student> getStudent() {
        return studentRepository.findAll();
    }

    public String saveStudent(Student student)
    {
        if(studentRepository.existsById(student.getRollno())) {
            return "Id already exitts, try for other Id";
        }
        else {
            studentRepository.save(student);
            return "Data Saved Successfully";
        }
    }
}
