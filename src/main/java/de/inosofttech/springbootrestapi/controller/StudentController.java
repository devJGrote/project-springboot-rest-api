package de.inosofttech.springbootrestapi.controller;

import de.inosofttech.springbootrestapi.bean.Student;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {


    // HTTP GET Request
    // http://localhost:8080/student

    @GetMapping("student")
    public Student getStudent(){
        return new Student(1, "Jens", "Grote");
    }
}
