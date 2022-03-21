package com.syntax.groupProjects;

public abstract class Marks {

    public abstract double getPercentage(double...subject);
}
class A extends Marks{

    public double getPercentage(double...subject) {
        return (subject[0]+subject[1]+subject[2])/3;
    }
}
class B extends Marks{
    public double getPercentage(double...subject){
        return (subject[0]+subject[1]+subject[2]+subject[3])/4;
    };

    public static void main(String[] args) {
        A studentA=new A();
        B studentB=new B();
        System.out.println(studentA.getPercentage(95,76,48));
        System.out.println(studentB.getPercentage(56,78,100,94));

    }
}
