package com.sparta.week01.prac;

import java.util.ArrayList;
import java.util.List;

public class Prac {

    public static void main(String[] args) {
        List<String> fruits = new ArrayList<>();

        Course course = new Course();
        course.setTitle("Spring");
        course.setTutor("Jane");
        course.setDays(10);
        System.out.println(course.getTitle());
        System.out.println(course.getTutor());
        System.out.println(course.getDays());

        Course course2 = new Course("React", "James", 20);
        System.out.println(course2.getTitle());
        System.out.println(course2.getTutor());
        System.out.println(course2.getDays());
    }
}
