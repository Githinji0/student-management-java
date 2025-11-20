package org.yourcompany.yourproject.dao;

import java.util.List;

import org.yourcompany.yourproject.model.Student;

public interface StudentDao {
    // DAO template methods
    List<Student> findAll();
    Student findById(String id);
    void save(Student s);
    void delete(String id);
}
