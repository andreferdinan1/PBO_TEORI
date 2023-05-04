/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Dell
 */
public class OperasiAritmatik {
    public static void main(String[] args) { //metode main yang akan dieksekusi oleh JVM.
        
        //kita memeriksa apakah jumlah argumen yang diberikan sama dengan 2. Jika tidak sama dengan 2, 
        //maka akan dicetak pesan error dan program akan dihentikan menggunakan perintah return.
        if (args.length != 2) {
            System.out.println("Operasi: java Operasi Aritmatika <nomor1> <nomor2>");
            return;
        }
        
        //mengubah string yang mewakili bilangan menjadi bilangan integer menggunakan metode parseInt() dari kelas Integer.
        int num1 = Integer.parseInt(args[0]);
        int num2 = Integer.parseInt(args[1]);
        
        //melakukan operasi aritmatika pada dua bilangan tersebut, yaitu penjumlahan, pengurangan, perkalian, dan pembagian. 
        //Hasil operasi tersebut disimpan pada variabel masing-masing.
        int sum = num1 + num2;
        int difference = num1 - num2;
        int product = num1 * num2;
        int quotient = num1 / num2;
        
        //mencetak hasil operasi aritmatika tersebut menggunakan fungsi System.out.println().
        System.out.println("sum = " + sum);
        System.out.println("difference = " + difference);
        System.out.println("product = " + product);
        System.out.println("quotient = " + quotient);
    }
}
