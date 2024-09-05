package com.springJDBC.com.springJDBCTest.service;

import com.springJDBC.com.springJDBCTest.RowMapper.StudentRowMapper;
import com.springJDBC.com.springJDBCTest.mode.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {
    private final  JdbcTemplate jdbcTemplate;

    @Autowired
    public StudentService(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public List<Student> findAll()
    {
        String sql = "select * from students";
        return jdbcTemplate.query(sql,new StudentRowMapper());
    }

    public void addStudent(Student student)
    {
        String sql ="INSERT INTO students (name,major) VALUES (?,?)";
        jdbcTemplate.update(sql,student.getName(),student.getMajor());
    }

    public void deleteStudent(int id) {
        String sql = "DELETE FROM students WHERE id = ?";
        jdbcTemplate.update(sql, id);
    }

    public void updateStudent(int id, Student student) {
        String sql = "UPDATE students Set name = ?, major = ? WHERE id = ?";
        jdbcTemplate.update(sql,student.getName(),student.getMajor(),id);
    }
}
