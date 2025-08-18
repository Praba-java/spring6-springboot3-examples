package com.example.SpringJDBCEx;

import com.example.SpringJDBCEx.model.Student;
import com.example.SpringJDBCEx.service.StudentService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class SpringJdbcExApplication {

	public static void main(String[] args) {
		ApplicationContext context=SpringApplication.run(SpringJdbcExApplication.class, args);
			Student stu=context.getBean(Student.class);

		StudentService stuserv= context.getBean(StudentService.class);

		stuserv.addStudents(stu);


		List<Student> studentList = stuserv.findAllStudents();
		System.out.println("Student Details: " + studentList);

	}

}
