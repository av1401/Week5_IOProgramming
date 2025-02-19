package com.practiceproblems;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.practiceproblems.Users;

import java.util.Arrays;
import java.util.List;

public class ListToJson {
    public static void main(String[] args) {
        try {
            // Create a list of User objects
            List<Users> users = Arrays.asList(
                    new Users("Amrit", 25, "Amrit@example.com"),
                    new Users("Anchal", 30, "Anchal@example.com"),
                    new Users("Gopal", 22, "gopal12@example.com")
            );

            // Convert list to JSON array
            ObjectMapper objectMapper = new ObjectMapper();
            String jsonArray = objectMapper.writeValueAsString(users);

            // Print JSON output
            System.out.println(jsonArray);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
