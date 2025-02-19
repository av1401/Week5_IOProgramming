package com.practiceproblems;

import org.json.JSONArray;
import org.json.JSONObject;

public class Student {
    public static void main(String[] args) {

        //Create a json object
        JSONObject student = new JSONObject();
        student.put("name", "John Doe"); //add name and age
        student.put("age", 25);

        // Create a  json array
        JSONArray subjects = new JSONArray();
        subjects.put("Math");
        subjects.put("Science");
        subjects.put("English");
        //add array to the student
        student.put("subjects", subjects);

        System.out.println(student.toString());
    }
}
