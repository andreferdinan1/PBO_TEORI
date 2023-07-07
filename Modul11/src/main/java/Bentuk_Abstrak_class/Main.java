/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bentuk_Abstrak_class;

/**
 *
 * @author andreferdinan
 */
public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(5);
        System.out.println("Area of the " + circle.getName() + ": " + circle.getArea());
        circle.displayInformation();

        Square square = new Square(7);
        System.out.println("Area of the " + square.getName() + ": " + square.getArea());
        square.displayInformation();
    }
}

