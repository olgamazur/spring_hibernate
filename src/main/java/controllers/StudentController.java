package controllers;

import entities.Student;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import services.StudentService;

import java.util.List;

@RestController
@RequestMapping("/student")
public class StudentController {
    @GetMapping(value = "/list", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Student> getStudents() {
        return StudentService.getStudents();
    }
}
