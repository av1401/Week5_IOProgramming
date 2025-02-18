package com.Intermediate;

import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvException;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class SortCSV{

    public static void main(String[] args) {
        // Path to the CSV file
        String csvFile = "C:\\Users\\abhishek vishwakarma\\Desktop\\Capgemini\\Week5_IOProgramming\\Day1_CsvDataHandling\\src\\main\\resources\\Employees.csv";

        List<String[]> records = new ArrayList<>();

        try (CSVReader reader = new CSVReader(new FileReader(csvFile))) {
            String[] line;

            // Read all records including the header
            records = reader.readAll();
        } catch (IOException | CsvException e) {
            e.printStackTrace(); // Handle exceptions
        }

        // Separate the header from the rest of the records
        String[] header = records.remove(0);

        // Sort the records by Salary in descending order
        records.sort(Comparator.comparingDouble(record -> Double.parseDouble(record[3])));
        records.sort(Comparator.comparingDouble((String[] record) -> Double.parseDouble(record[3])).reversed());

        // Print the top 5 highest-paid employees
        System.out.println("Top 5 highest-paid employees:");
        for (int i = 0; i < Math.min(5, records.size()); i++) {
            String[] record = records.get(i);
            System.out.println("Id: " + record[0] + ", Name: " + record[1] + ", Departemnt: " + record[2] + ", Salary: " + record[3]);
        }
    }
}