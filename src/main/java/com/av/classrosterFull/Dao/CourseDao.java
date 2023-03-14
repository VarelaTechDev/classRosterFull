package com.av.classrosterFull.Dao;

import com.av.classrosterFull.Entities.Course;
import com.av.classrosterFull.Entities.Student;
import com.av.classrosterFull.Entities.Teacher;

import java.util.List;

public interface CourseDao {
    Course getCourseById(int id);
    List<Course> getAllCourses();
    Course addCourse(Course course);
    void updateCourse(Course course);
    void deleteCourseById(int id);

    List<Course> getCoursesForTeacher(Teacher teacher);
    List<Course> getCoursesForStudent(Student student);
}
