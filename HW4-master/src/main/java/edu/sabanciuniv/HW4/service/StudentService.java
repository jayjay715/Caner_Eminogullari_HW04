package edu.sabanciuniv.HW4.service;

import edu.sabanciuniv.HW4.model.*;
import edu.sabanciuniv.HW4.Util.EntityManagerUtils;
import edu.sabanciuniv.HW4.repository.*;

import javax.persistence.EntityManager;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

public class StudentService implements CrudRepository<Student> {
    EntityManager entityManager = EntityManagerUtils.getEntityManager("mysqlPU");

    @Override
    public List<Student> findAll() {
        if(!entityManager.isOpen())  entityManager = EntityManagerUtils.getEntityManager("mysqlPU");
        return entityManager.createQuery("SELECT s FROM Student s", Student.class).getResultList();
    }

    @Override
    public Student find(int studentId ) {
        if(!entityManager.isOpen())  entityManager = EntityManagerUtils.getEntityManager("mysqlPU");
        return entityManager.find(Student.class,studentId );
    }

    @Override
    public void save(Student student) {
        try {
            entityManager.getTransaction().begin();
            entityManager.persist(student);
            entityManager.getTransaction().commit();
            System.out.println("Student is saved!");
        } catch (Exception e) {
            entityManager.getTransaction().rollback();
        } finally {
            EntityManagerUtils.closeEntityManager(entityManager);
        }
    }

    @Override
    public void delete(Student student) {
        try {
            if(!entityManager.isOpen())  entityManager = EntityManagerUtils.getEntityManager("mysqlPU");
            entityManager.getTransaction().begin();
            entityManager.remove(student);
            entityManager.getTransaction().commit();
            System.out.println("Student is deleted!");
        } catch (Exception e) {
            entityManager.getTransaction().rollback();
        } finally {
            EntityManagerUtils.closeEntityManager(entityManager);
        }
    }
    @Override
    public void delete(int id) {
    }
    @Override
    public void update(Student object, int id) {

    }
}