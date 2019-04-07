package com.everis.gamarra.Controller;

import com.everis.gamarra.Entity.Student;
import com.everis.gamarra.Service.StudentDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1.0")
public class StudentController {

    @Autowired
    private StudentDAO studentDAO;

    @GetMapping("/students")
    public List<Student> getAllStudents(){
       return studentDAO.getAllStudents();
    }

    @PostMapping("/students")
    public void addStudent(@RequestBody Student obj){
        studentDAO.addStudent(obj);
    }

    @PutMapping("/students")
    public void updateStudent(@RequestBody Student obj){
        studentDAO.updateStudent(obj);
    }

    @DeleteMapping("/students/{id}")
    public void deleteStudent(@PathVariable("id") Integer id){
        studentDAO.deleteStudent(id);
    }
}
