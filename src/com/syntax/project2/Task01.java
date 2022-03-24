package com.syntax.project2;

public class Task01 {

    public static void main(String[] args) {
//4.test code
        Circle circle = new Circle(10);
        circle.calculateArea();
        circle.calculatePerimeter();

        Square square=new Square(4);
        square.calculateArea();
        square.calculatePerimeter();
    }
}
// 1.Create an Interface 'Shape' with undefined methods
interface Shape {
        void calculateArea();
        void calculatePerimeter();
    }

// 2.Create Circle class and implements functionality
class Circle implements Shape {
    double radius;
    Circle(double radius){
        this.radius = radius;
    }
    @Override
    public void calculateArea(){
        double area = Math.PI * radius * radius;
        System.out.println("Area of circle is " + area);
    }
    @Override
    public void calculatePerimeter(){
        double circumference= Math.PI * 2*radius;
        System.out.println( "The circumference of the circle is:"+circumference) ;
    }
}

// 3.Create Square class and implements functionality
class Square implements Shape {
    double side;
    Square(double side){
        this.side=side;
    }
    @Override
    public void calculateArea() {
        double area = side*side;
        System.out.println("Area of Square is: "+area);
    }
    @Override
    public void calculatePerimeter() {
        double area = 4*side;
        System.out.println("Perimeter of Square is: "+area);
    }
}

