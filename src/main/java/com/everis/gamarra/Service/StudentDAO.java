package com.everis.gamarra.Service;

import com.everis.gamarra.Entity.Student;

import java.util.List;

public interface StudentDAO {

    public List<Student> getAllStudents();
    public void addStudent(Student obj);
    public void updateStudent(Student obj);
    public void deleteStudent(Integer id);
}
