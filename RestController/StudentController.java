package com.springJDBC.com.springJDBCTest.RestController;

import com.springJDBC.com.springJDBCTest.mode.Student;
import com.springJDBC.com.springJDBCTest.service.StudentService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentController {
    private final StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }
    @GetMapping("/students")
    public List<Student> findAll()
    {
        return studentService.findAll();
    }
    @PostMapping("/addstudent")
    public void addToy(@RequestBody Student student) {
        studentService.addStudent(student);
    }
    @PutMapping("/update/{id}")
    public void updateToy(@PathVariable int id, @RequestBody Student student)
    {
        studentService.updateStudent(id, student);
    }
    @DeleteMapping("/delete/{id}")
    public void deleteStudent(@PathVariable int id)
    {
        studentService.deleteStudent(id);
    }
}
