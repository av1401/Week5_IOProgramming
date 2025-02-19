package com.practiceproblems;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.File;
import java.io.IOException;

public class JsonValidation {
    public static void main(String[] args) {
        ObjectMapper objectMapper = new ObjectMapper();
        try {
            // Read JSON file and parse it
            JsonNode jsonNode = objectMapper.readTree(new File("C:\\Users\\abhishek vishwakarma\\Desktop\\Capgemini\\Week5_IOProgramming\\Day_2.JsonData\\src\\main\\resources\\JsonSchema"));
            System.out.println("JSON is well-formed!");
        } catch (IOException e) {
            System.out.println("Invalid JSON: " + e.getMessage());
        }
    }
}
