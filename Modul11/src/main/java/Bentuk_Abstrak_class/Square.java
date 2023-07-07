/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bentuk_Abstrak_class;

/**
 *
 * @author andreferdinan
 */
    class Square extends Shape {
    private double sideLength;

    public Square(double sideLength) {
        this.sideLength = sideLength;
    }

    @Override
    public double getArea() {
        return sideLength * sideLength;
    }

    @Override
    public String getName() {
        return "Square";
    }

    public void displayInformation() {
        System.out.println("This is a square with side length " + sideLength);
    }
}

