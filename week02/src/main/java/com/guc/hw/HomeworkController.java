package com.guc.hw;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeworkController {
    public static School school = new School("Gachon", SchoolType.UNIVERSITY);
    public static Student student = new Student();
    static {
        student.setId("201935044");
        student.setName("Sanghui Park");
        student.setSchool(school);
        student.setDepartment(new Department("SWDM", "Software Department"));
    }

    @GetMapping("/school")
    public School getSchool() {
        return school;
    }

    @GetMapping("/department")
    public Department getDepartment() {
        return student.getDepartment();
    }

    @GetMapping("/student")
    public Student getStudent() {
        return student;
    }
}
