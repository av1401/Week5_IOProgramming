package com.advance;

import com.opencsv.CSVWriter;

import java.io.FileWriter;
import java.io.IOException;
import java.sql.*;

public class GenerateCsv {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/your_database"; // provide path of the database
        String username = "root"; //provide the root
        String password = "password";
        String query = "SELECT EmployeeID, Name, Department, Salary FROM Employees"; //select the requirede fields

        try (Connection connection = DriverManager.getConnection(url, username, password);
             PreparedStatement statement = connection.prepareStatement(query);
             ResultSet resultSet = statement.executeQuery();
             CSVWriter writer = new CSVWriter(new FileWriter("employee_report.csv"))) {

            // Write header to CSV
            writer.writeNext(new String[]{"Employee ID", "Name", "Department", "Salary"});

            // Write records to CSV
            while (resultSet.next()) {
                String[] record = {
                        resultSet.getString("EmployeeID"),
                        resultSet.getString("Name"),
                        resultSet.getString("Department"),
                        resultSet.getString("Salary")
                };
                writer.writeNext(record);
            }
        } catch (SQLException | IOException e) {
            e.printStackTrace();
        }
    }
}

