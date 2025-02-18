package com.Intermediate;

import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvValidationException;

import java.io.FileReader;
import java.io.IOException;

public class ReadAndFilter {
    public static void main(String[] args) {
        String path = "C:\\Users\\abhishek vishwakarma\\Desktop\\Capgemini\\Week5_IOProgramming\\Day1_CsvDataHandling\\src\\main\\resources\\CSV.csv";

        try(CSVReader reader = new CSVReader(new FileReader(path))){
            String[] line;
            while((line = reader.readNext()) != null){
                if(Double.parseDouble(line[3]) >= 80){
                    System.out.println("ID: " + line[0] +
                            ", Name: " + line[1] +
                            ", Age: " + line[2] +
                            ", Marks : " + line[3]
                    );
                }
            }
        }
        catch(IOException | CsvValidationException e){
            e.printStackTrace();
        }
    }
}
