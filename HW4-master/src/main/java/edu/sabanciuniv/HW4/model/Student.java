package edu.sabanciuniv.HW4.model;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Student {
   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
   @Column
   private String name;
   @Column
    private String gender;
    @Column
    private String address;
    @Column
    private Date birthday;
    @Column
    private int studentId;

    public Student(String name, String gender, String address, Date birthday, int studentId) {
        this.name = name;
        this.gender = gender;
        this.address = address;
        this.birthday = birthday;
        this.studentId = studentId;
    }

    public Student() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", address='" + address + '\'' +
                ", birthday=" + birthday +
                '}';
    }

  }