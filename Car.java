package com.syntax.groupProjects;

public class Car {
    double carPrice;
    String color;
    public double calculateSalePrice() {
        return carPrice;
    }
}
class Sedan extends Car{
    double length;
    public double calculateSalePrice() {
        if(length>20){
            return carPrice-(carPrice*.05);
        }else{
            return carPrice-(carPrice*.10);
        }
    }
}
class Truck extends Car{
    double weight;
    public double calculateSalePrice() {
        if(weight>2000){
            return carPrice-(carPrice*.10);
        } else{
            return carPrice-(carPrice*.20);
        }
    }
}
