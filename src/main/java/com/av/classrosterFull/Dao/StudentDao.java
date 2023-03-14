package com.av.classrosterFull.Dao;

import com.av.classrosterFull.Entities.Student;

import java.util.List;

public interface StudentDao {
    Student getStudentById(int id);
    List<Student> getAllStudents();
    Student addStudent(Student student);
    void updateStudent(Student student);
    void deleteStudentById(int id);
}
