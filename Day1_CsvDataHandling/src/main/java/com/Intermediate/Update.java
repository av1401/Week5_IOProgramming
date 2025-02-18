package com.Intermediate;

import com.opencsv.CSVReader;
import com.opencsv.CSVWriter;
import com.opencsv.exceptions.CsvValidationException;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Update {
    public static void main(String[] args) {
        String inputFilePath = "C:\\Users\\abhishek vishwakarma\\Desktop\\Capgemini\\Week5_IOProgramming\\Day1_CsvDataHandling\\src\\main\\resources\\Employees.csv"; // Input CSV file path
        String outputFilePath = "C:\\Users\\abhishek vishwakarma\\Desktop\\Capgemini\\Week5_IOProgramming\\Day1_CsvDataHandling\\src\\main\\resources\\UpdatedSalary.csv"; // Output CSV file path

        try (CSVReader reader = new CSVReader(new FileReader(inputFilePath))) {
            // Create a CSVWriter to write the updated data into a new CSV file
            CSVWriter writer = new CSVWriter(new FileWriter(outputFilePath));

            List<String[]> records = new ArrayList<>();
            String[] header = reader.readNext(); // Read header
            records.add(header); // Add header to records list

            String[] line;
            while ((line = reader.readNext()) != null) {
                // Check if the employee's department is "IT" and modify their salary
                if ("IT".equalsIgnoreCase(line[3])) {  // Assuming the department is in the 4th column (index 3)
                    double salary = Double.parseDouble(line[4]); // Assuming salary is in the 5th column (index 4)
                    double updatedSalary = salary * 1.10; // Increase salary by 10%
                    line[4] = String.valueOf(updatedSalary); // Update the salary in the record
                }
                // Add the record (updated or not) to the list
                records.add(line);
            }

            // Write all records to the new CSV file
            writer.writeAll(records);
            writer.close();
            System.out.println("CSV file updated successfully!");
        } catch (IOException | CsvValidationException e) {
            System.out.println("Error processing the CSV file: " + e.getMessage());
        }
    }
}
