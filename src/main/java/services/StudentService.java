package services;

import entities.Student;
import reposotories.StudentRepository;

import java.util.List;
import java.util.stream.Collectors;


public class StudentService {
 StudentRepository studentRepository;
    public List<Student> getStudents() {
        return studentRepository.findAll();

    }
}
