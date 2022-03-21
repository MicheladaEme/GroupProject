package com.syntax.groupProjects;

public interface Shape {
    double calculateArea(double num);

    double calculatePerimeter(double num);
}
 class Circle implements Shape{
    @Override
     public double calculateArea(double num){
         return Math.PI*Math.pow(num,2);
     };
     @Override
    public double calculatePerimeter(double num){
        return Math.PI*(num*2);
     };
 }
 class Square implements Shape{
     @Override
     public double calculateArea(double num){
         return Math.pow(num, 2);
     };

     public double calculatePerimeter(double num){
         return 4*num;
     };

     public static void main(String[] args) {
         Circle circle=new Circle();
         Square square=new Square();
         System.out.println(circle.calculateArea(6));
         System.out.println(circle.calculatePerimeter(8));
         System.out.println(square.calculateArea(9));
         System.out.println(square.calculatePerimeter(5));
     }
 }
