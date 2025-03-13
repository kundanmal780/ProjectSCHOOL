  package com.example;

import java.util.ArrayList;
import java.util.List;

public class ProjectSCHOOL {
    public static void main(String[] args) {
        List<String> projects = new ArrayList<>();
        projects.add("Math Homework");
        projects.add("History Project");
        projects.add("Science Fair");

        for (String project : projects) {
            System.out.println(project);
        }
    }
}