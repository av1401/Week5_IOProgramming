package com.basic;

import com.opencsv.CSVWriter;

import java.io.FileWriter;
import java.io.IOException;

public class WriteCsv {
    public static void main(String[] args) {

        String path = "C:\\Users\\abhishek vishwakarma\\Desktop\\Capgemini\\Week5_IOProgramming\\Day1_CsvDataHandling\\src\\main\\resources\\CSVWriter.csv";
        try(CSVWriter writer = new CSVWriter(new FileWriter(path))){
            String[] header = {"Id" , "Name " , "Age " , "Marks"};
            String[] student1 = {"101" , "Abhishek " , "21" , "91"};
            String[] student2 = {"102" , "Vishwakarma " , "20" , "85"};
            writer.writeNext(header);
            writer.writeNext(student1);
            writer.writeNext(student2);
        }
        catch(IOException e){
            e.printStackTrace();
        }
    }
}
