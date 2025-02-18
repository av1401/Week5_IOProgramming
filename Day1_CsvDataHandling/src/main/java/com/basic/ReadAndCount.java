package com.basic;

import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvValidationException;
import java.io.FileReader;
import java.io.IOException;

public class ReadAndCount {
    public static void main(String[] args) {

        // Path to the CSV file
        String path = "C:\\Users\\abhishek vishwakarma\\Desktop\\Capgemini\\Week5_IOProgramming\\Day1_CsvDataHandling\\src\\main\\resources\\CSV.csv";

        int count = 0; // Variable to store the number of lines in the CSV file

        // Try-with-resources to automatically close the reader after use
        try (CSVReader reader = new CSVReader(new FileReader(path))) {

            String[] line; // Array to hold each line read from the CSV

            // Loop through the CSV file and count the number of lines
            while ((line = reader.readNext()) != null) {
                count++; // Increment count for each line read
            }

        } catch (IOException | CsvValidationException e) {
            e.printStackTrace();
        }

        // Print the total number of lines in the CSV file
        System.out.println("Total number of lines: " + count);
    }
}
