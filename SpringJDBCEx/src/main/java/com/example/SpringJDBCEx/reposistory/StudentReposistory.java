package com.example.SpringJDBCEx.reposistory;


import com.example.SpringJDBCEx.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

@Repository
public class StudentReposistory {

    @Autowired
    private JdbcTemplate jdbc;

    public void save(Student stu) {


        String sql= "insert into student (rollno,name,marks) values (?,?,?)";

          int row=  jdbc.update(sql,stu.getRollNo(),stu.getName(),stu.getMarks());

        System.out.println(+row +"Student Added");
    }

    public List<Student> findAll() {

        String sql="Select * from student";

        RowMapper rowMapper=new RowMapper<Student>() {
            @Override
            public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
                Student s=new Student();
                s.setRollNo(rs.getInt("rollno"));
                s.setName(rs.getString("name"));
                s.setMarks(rs.getInt("marks"));
                return s;
            }
        };

        return jdbc.query(sql,rowMapper);
    }


}
