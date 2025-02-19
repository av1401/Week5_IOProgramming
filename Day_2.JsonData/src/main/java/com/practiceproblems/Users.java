package com.practiceproblems;

public class Users {
    private String name;
    private int age;
    private String email;

    // Default Constructor (Required for Jackson)
    public Users() {}

    // Parameterized Constructor
    public Users(String name, int age, String email) {
        this.name = name;
        this.age = age;
        this.email = email;
    }

    // Getters and Setters (Important for Jackson)
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public int getAge() { return age; }
    public void setAge(int age) { this.age = age; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }
}
