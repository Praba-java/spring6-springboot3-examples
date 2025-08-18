package com.example.SpringJDBCEx.service;


import com.example.SpringJDBCEx.model.Student;
import com.example.SpringJDBCEx.reposistory.StudentReposistory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    @Autowired
    StudentReposistory sturepo;

    public void addStudents(Student stu) {

        sturepo.save(stu);
    }



    public List<Student> findAllStudents() {
        return sturepo.findAll();
    }



}
