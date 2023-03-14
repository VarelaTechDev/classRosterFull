package com.av.classrosterFull.Entities;

import lombok.Data;

@Data // Using lombok to generate our Setters/Getters
public class Teacher {
    private int id;
    private String firstName;
    private String lastName;
    private String specialty;


}
