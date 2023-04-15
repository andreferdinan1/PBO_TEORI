/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author andreferdinan
 */
public class latihan1 {
    public static void main(String[] args) {
        String[] daysOfWeek = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};

        // using while loop
        int i = 0;
        while (i < daysOfWeek.length) {
            System.out.println(daysOfWeek[i]);
            i++;
        }
        System.out.println(); // print new line

        // using do-while loop
        int j = 0;
        do {
            System.out.println(daysOfWeek[j]);
            j++;
        } while (j < daysOfWeek.length);
        System.out.println(); // print new line

        // using for loop
        for (int k = 0; k < daysOfWeek.length; k++) {
            System.out.println(daysOfWeek[k]);
        }
    }
}
 
