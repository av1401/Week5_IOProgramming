package com.practiceproblems;

import com.fasterxml.jackson.databind.ObjectMapper;
//Class Car.
class Car{
    public String brand;
    public String model;
    public String type;

    public Car(String brand, String model, String type) {
        this.brand = brand;
        this.model = model;
        this.type = type;
    }
}
public class ObjectIntoJSON {
    public static void main(String[] args) {

        try{
            ObjectMapper objectMapper = new ObjectMapper();
            Car car = new Car("Toyota", "Camry", "SUV"); //creating object
            //concert java object to json string
            String jsonString = objectMapper.writeValueAsString(car);
            System.out.println(jsonString.toString());
        }
        catch (Exception e){
            e.getMessage();
        }
    }
}
