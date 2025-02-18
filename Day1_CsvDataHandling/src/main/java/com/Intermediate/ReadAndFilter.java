package com.Intermediate;

import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvValidationException;
import java.io.FileReader;
import java.io.IOException;

public class ReadAndFilter {
    public static void main(String[] args) {
        // Path to the CSV file
        String path = "C:\\Users\\abhishek vishwakarma\\Desktop\\Capgemini\\Week5_IOProgramming\\Day1_CsvDataHandling\\src\\main\\resources\\CSV.csv";

        // Try-with-resources to ensure the CSVReader is closed automatically after use
        try (CSVReader reader = new CSVReader(new FileReader(path))) {
            String[] line; // Array to hold each row of the CSV file

            // Loop through each row of the CSV file
            while ((line = reader.readNext()) != null) {
                // Convert the fourth column (marks) to a double and filter records where marks >= 80
                if (Double.parseDouble(line[3]) >= 80) {
                    // Print the filtered student details
                    System.out.println("ID: " + line[0] +  // Student ID
                            ", Name: " + line[1] +        // Student Name
                            ", Age: " + line[2] +         // Student Age
                            ", Marks: " + line[3]         // Student Marks
                    );
                }
            }
        }
        // Catch block to handle exceptions that may occur while reading the file
        catch (IOException | CsvValidationException e) {
            e.printStackTrace(); // Print the error stack trace if an exception occurs
        }
    }
}
