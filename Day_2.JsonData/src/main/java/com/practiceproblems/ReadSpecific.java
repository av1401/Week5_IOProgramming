package com.practiceproblems;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.File;

class User {
    private int id;
    private String name;
    private int age;
    private String email;

    // Default constructor (required for Jackson)
    public User() {}

    // Getters & Setters
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public int getAge() { return age; }
    public void setAge(int age) { this.age = age; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }
}

public class ReadSpecific {
    public static void main(String[] args) {
        try {
            ObjectMapper objectMapper = new ObjectMapper();

            //file path
            File file = new File("C:/Users/abhishek vishwakarma/Desktop/Capgemini/Week5_IOProgramming/Day_2.JsonData/src/main/resources/JsonData.json");

            // Read JSON from file and map to User object
            User user = objectMapper.readValue(file, User.class);

            // Display extracted fields
            System.out.println("User Name: " + user.getName());
            System.out.println("Email: " + user.getEmail());
        } catch (Exception e) {
            System.out.println("Error reading JSON: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
