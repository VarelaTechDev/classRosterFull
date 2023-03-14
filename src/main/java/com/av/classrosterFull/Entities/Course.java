package com.av.classrosterFull.Entities;

import lombok.Data;

import java.util.List;

@Data
public class Course {
    private int id;
    private String name;
    private String description;
    private Teacher teacher;
    private List<Student> students;
}
