package edu.sabanciuniv.HW4.initilizer;

import edu.sabanciuniv.HW4.controller.StudentController;
import edu.sabanciuniv.HW4.model.Student;
import edu.sabanciuniv.HW4.repository.CrudRepository;

import java.util.Calendar;
import java.util.Date;
import edu.sabanciuniv.HW4.service.StudentService;

public class StudentDataInitilizer {

    public static void main(String[] args) {

        Student std1 = new Student("Britney Spears","female","California",new Date(1981, Calendar.DECEMBER,2),808);
        StudentController studentController = new StudentController();

        studentController.saveStudent(std1);

        System.out.println("All students"+studentController.findAllStudents());

        //System.out.println("studentId"+studentController.findStudent(424));

        StudentService studentService = new StudentService();
        System.out.println("studentId"+studentService.find(808));
        studentService.delete(2);

    }
}

