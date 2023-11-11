package de.inosofttech.springbootrestapi.controller;

import de.inosofttech.springbootrestapi.bean.Student;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("students")
public class StudentController {


    // HTTP GET Request
    // http://localhost:8080/student
    @GetMapping("student")
    public Student getStudent(){
        return new Student(1, "Jens", "Grote");
    }

    // HTTP GET Request
    // http://localhost:8080/studentResponseEntity
    @GetMapping("studentResponseEntity")
    public ResponseEntity<Student> getStudentResponseEntity(){
        Student student = new Student(1, "Jens", "Grote");
        //return new ResponseEntity<>(student, HttpStatus.OK);
        //return  ResponseEntity.ok(student);
        return ResponseEntity.ok().header("custom-header", "jens").body(student);
    }



    // http://localhost:8080/students
    @GetMapping
    public List<Student> getStudents(){
        List<Student> students = new ArrayList<>();
        students.add(new Student(1, "Jens", "Grote"));
        students.add(new Student(2, "John", "Doe"));
        students.add(new Student(3, "Alice", "Johnson"));
        students.add(new Student(4, "Bob", "Smith"));
        students.add(new Student(5, "Eva", "Anderson"));
        students.add(new Student(6, "David", "Brown"));
        students.add(new Student(7, "Sophia", "Lee"));
        students.add(new Student(8, "Michael", "Wilson"));
        students.add(new Student(9, "Olivia", "Garcia"));
        students.add(new Student(10, "William", "Martinez"));
        return students;
    }

    // SPRING BOOT REST API with path Variable
    // http://localhost:8080/students/1
    @GetMapping("{id}")
    public Student studentPathVariable(@PathVariable("id") int studentId){
        return new Student(studentId, "Jens", "Grote");
    }

    // SPRING BOOT REST API with Request Param
    // http://localhost:8080/students/query?id=1
    @GetMapping("query")
    public Student studentRequestVariable(@RequestParam int id){
        return new Student(id, "Jens", "Grote");
    }

    // SPRING BOOT REST API handels post request - create
    // http://localhost:8080/students/create
    @PostMapping("create")
    //@ResponseStatus(HttpStatus.CREATED)
    public ResponseEntity<Student> createStudent(@RequestBody Student student){
        System.out.println(student.getId());
        System.out.println(student.getFirstName());
        System.out.println(student.getLastName());
        return new ResponseEntity<>(student, HttpStatus.CREATED);
    }

    // SPRING BOOT REST API that handles put request - updating
    // http://localhost:8080/students/3/update
    @PutMapping("{id}/update")
    public Student updateStudent(@RequestBody Student student, @PathVariable("id") int studentId) {
        System.out.println(student.getFirstName());
        System.out.println(student.getLastName());
        return student;
    }

    // SPRING BOOT REST API that handles delete request - delete
    // http://localhost:8080/students/3/delete
    @DeleteMapping("{id}/delete")
    public String deleteStudent(@PathVariable("id") int studentId) {
        System.out.println(studentId);
        return "Student deleted";
    }

}
