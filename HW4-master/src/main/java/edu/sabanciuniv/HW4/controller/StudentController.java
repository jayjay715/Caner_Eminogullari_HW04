package edu.sabanciuniv.HW4.controller;

import edu.sabanciuniv.HW4.service.StudentService;
import edu.sabanciuniv.HW4.model.*;

import java.util.List;

public class StudentController {
    public StudentService service = new StudentService();
    public List<Student> findAllStudents() {
        return service.findAll();
    }
    public Student findStudent(int studentId) {
        return service.find(studentId);
    }
    public void saveStudent(Student student) {
        service.save(student);
    }
    public void deleteStudent(Student student) {
        service.delete(student);
    }
}

