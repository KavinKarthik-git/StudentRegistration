package com.kavin.hello.kavin.student;

import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;


@Repository("jpa")
public class StudentJPADataAccess implements StudentDAO{

    private final StudentRepository studentRepository;
    public StudentJPADataAccess(StudentRepository studentRepository)
    {
        this.studentRepository=studentRepository;
    }

    @Override
    public List<Student> selectAllStudent() {
        return studentRepository.findAll();
    }

    @Override
    public Optional<Student> selectStudentByID(Integer id) {
        return studentRepository.findById(id);
    }

    @Override
    public void addStudent(Student student) {
        studentRepository.save(student);
    }

    @Override
    public boolean isNameExist(String name) {
        return studentRepository.existsByName(name);
    }

    @Override
    public void deleteStudent(Integer id) {
        studentRepository.deleteById(id);
    }

    @Override
    public boolean isIdExist(Integer id) {
        return studentRepository.existsById(id);
    }

    @Override
    public void updateStudent(Student upr) {
         studentRepository.save(upr);
    }




}
