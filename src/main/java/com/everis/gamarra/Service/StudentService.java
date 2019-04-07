package com.everis.gamarra.Service;

import com.everis.gamarra.Entity.Student;
import com.everis.gamarra.Repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService implements StudentDAO {

    @Autowired
    StudentRepository studentRepository;

    @Override
    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }

    @Override
    public void addStudent(Student obj) {
         studentRepository.save(obj);
    }

    @Override
    public void updateStudent(Student obj) {
        studentRepository.save(obj);
    }

    @Override
    public void deleteStudent(Integer id) {
        studentRepository.deleteById(id);
    }
}
