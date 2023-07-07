/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Menangkap_Exception_2;

/**
 *
 * @author andreferdinan
 */
public class TestExceptions2 {
    public static void main(String[] args) {
        try {
            for (int i = 0; true; i++) {
                System.out.println("args[" + i + "]=" + args[i]);
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception caught:");
            System.out.println(e);
            System.out.println("Quitting...");
        } finally {
            System.out.println("Program execution completed.");
        }
    }
}

