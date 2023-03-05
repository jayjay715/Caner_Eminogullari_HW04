package edu.sabanciuniv.HW4.repository;

    import edu.sabanciuniv.HW4.model.Student;

    import java.util.List;

    public interface CrudRepository<T>  {
        List<T> findAll();
        T find(int studentId);
        void save(T object);
        void delete(T object);
        void delete(int studentId);
        void update(T object, int studentId);

    }
