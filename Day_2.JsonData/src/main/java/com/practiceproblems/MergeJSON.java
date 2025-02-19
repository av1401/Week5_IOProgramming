package com.practiceproblems;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;

import java.io.File;
import java.io.IOException;

public class MergeJSON {
    public static void main(String[] args) {
        try{
            // Read the JSON file
            ObjectMapper objectMapper = new ObjectMapper();
            JsonNode file1 = objectMapper.readTree(new File("C:\\Users\\abhishek vishwakarma\\Desktop\\Capgemini\\Week5_IOProgramming\\Day_2.JsonData\\src\\main\\resources\\JsonData.json"));
            JsonNode  file2 = objectMapper.readTree(new File("C:\\Users\\abhishek vishwakarma\\Desktop\\Capgemini\\Week5_IOProgramming\\Day_2.JsonData\\src\\main\\resources\\JSONData2.json"));

            // Merge JSON objects.
            ObjectNode mergedJson = objectMapper.createObjectNode();
            mergedJson.setAll((ObjectNode) file1);
            mergedJson.setAll((ObjectNode) file2);

            // Print the merged JSON
            System.out.println("Merged JSON: " + mergedJson.toString());

            // Write to a new file
            objectMapper.writeValue(new File("C:\\Users\\abhishek vishwakarma\\Desktop\\Capgemini\\Week5_IOProgramming\\Day_2.JsonData\\src\\main\\resources\\Merged.json"), mergedJson);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

