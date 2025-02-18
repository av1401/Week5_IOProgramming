package com.Intermediate;

import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvValidationException;

import java.io.FileReader;
import java.io.IOException;

public class Search {
    public static void main(String[] args) {
        // Define the file path of the CSV file
        String path = "C:\\Users\\abhishek vishwakarma\\Desktop\\Capgemini\\Week5_IOProgramming\\Day1_CsvDataHandling\\src\\main\\resources\\Employee.csv";

        // Try-with-resources to automatically close the reader after execution
        try (CSVReader reader = new CSVReader(new FileReader(path))) {

            String[] lines;  // Array to store each row from CSV file

            // Loop through each line in the CSV file
            while ((lines = reader.readNext()) != null) {

                // Extract the employee's name from the second column index 1
                String name = lines[1];

                if (name.equalsIgnoreCase("Abhishek")) {
                    // Print the found employee details
                    System.out.println("Found employee: " + name + ", with ID: " + lines[0] + ", depatment : " + lines[2] + ", Salary :" + lines[3]);
                    break;  // Exit loop once the employee is found
                }
            }
        }
        catch (IOException | CsvValidationException e) {
            // Handle exceptions related to file reading or CSV parsing
            System.out.println("Error reading CSV file: " + e.getMessage());
        }
    }
}
