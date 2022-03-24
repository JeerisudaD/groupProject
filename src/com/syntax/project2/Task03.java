package com.syntax.project2;

public class Task03 {
    public static void main(String[] args) {
//4. test code
        new Truck(80000,"red",2500).carSalePrice();
        new Sedan(45000,"black",14).carSalePrice();
    }
}

//1. Create Car class
class Car {
    double carPrice;
    String color;
    Car(double carPrice,String color){
        this.carPrice=carPrice;
        this.color=color;
    }
    double calculateSalePrice(){
        return carPrice;
    }
    void carSalePrice(){
        System.out.println("This car is $" +carPrice);
    }

}
//2. Create a subclass Truck
class Truck extends Car{
    int weight;
    Truck (double carPrice,String color,int weight){
        super(carPrice,color);
        this.weight=weight;
    }
    @Override
    double calculateSalePrice(){
        if (weight > 2000) {
            carPrice=carPrice-carPrice*0.1;
        }else {
            carPrice=carPrice-carPrice*0.2;
        }
        return carPrice;
    }
}

//3. Create a subclass Sedan
class Sedan extends Car{
    int length;
    Sedan (double carPrice,String color,int length){
        super(carPrice,color);
        this.length=length;
    }
    @Override
    double calculateSalePrice(){
        if (length > 20) {
            carPrice=carPrice-carPrice*0.05;
        }else {
            carPrice=carPrice-carPrice*0.1;
        }
        return carPrice;
    }
}