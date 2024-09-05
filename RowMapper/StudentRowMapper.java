package com.springJDBC.com.springJDBCTest.RowMapper;

import com.springJDBC.com.springJDBCTest.mode.Student;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class StudentRowMapper implements RowMapper<Student> {
    @Override
    public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
        Student student = new Student();
        student.setId(rs.getInt("id"));
        student.setName(rs.getString("name"));
        student.setMajor(rs.getString("major"));
        return student;
    }
}
