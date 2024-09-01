package com.kavin.hello.kavin.student;

import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;


@RestController
public class StudentController {
    private final StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping("/students")
    public List<Student> getStudents()
    {
        return studentService.getStudents();
    }
    @GetMapping("/students/{studentId}")
    public Student getStudent(@PathVariable("studentId") Integer id) {
        return studentService.getStudent(id);
    }

    @PostMapping("/students")
    public void addStudent(@RequestBody StudentReq streq)
    {
         studentService.addStudent(streq);
    }

    @DeleteMapping("/students/{studentId}")
    public void deleteStudent(@PathVariable("studentId") Integer id )
    {
        studentService.deleteService(id);
    }

    @PutMapping("/students/{studentId}")
    public void updateStudent(@PathVariable("studentId") Integer id, @RequestBody UpdateReq updreq )
    {
        studentService.updateService(id,updreq);
    }
}
