//1  A class definition is a template for objects: it specifies what attributes the objects have and what methods can operate on them.Every object belongs to an object type; that is, it is an instance of a class. 
//   The new operator instantiates objects; that is, it creates new instances of a class.
//2 Instance variables in Java are non-static variables which are defined in a class outside any method, constructor or a block. Each instantiated object of the class has a separate copy or instance of that variable.
//  An instance variable belongs to a class.

//4
package com.company;

public class Circle {

    public double radiys;

    public void printSize() {
        System.out.println(String.format("The size = %f ", Math.PI * Math.pow(radiys, 2)));
    }
}

 public static void main(String[] args) {

        Circle circle1 = new Circle();
        Circle circle2 = new Circle();
        circle1.radiys = 5.4;
        circle2.radiys = 8.7;
        circle1.printSize();
        circle2.printSize();
}
