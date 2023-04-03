/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author andreferdinan
 */
import javax.swing.JOptionPane;//Ini adalah sintaks untuk mengimport kelas JOptionPane dari paket javax.swing. 
//Kelas ini menyediakan metode untuk membuat kotak dialog dan menampilkan pesan ke pengguna.

public class GetInputFromKeyboard {
    public static void main(String[] args) {
        String word1 = JOptionPane.showInputDialog("Enter word1:");//ni adalah sintaks untuk menampilkan kotak dialog permintaan input kepada pengguna dengan pesan "Enter word1:". 
        //Program akan menangkap input pengguna dengan mengambil nilai balik dari metode showInputDialog() dan menyimpannya dalam variabel word1.
        String word2 = JOptionPane.showInputDialog("Enter word2:");
        String word3 = JOptionPane.showInputDialog("Enter word3:");

        String output = word1 + " " + word2 + " " + word3;//Ini adalah sintaks untuk menggabungkan tiga kata yang dimasukkan oleh pengguna menggunakan operator concatenation +, 
        //dan menyimpan hasilnya dalam variabel output

        JOptionPane.showMessageDialog(null, output);//Ini adalah sintaks untuk menampilkan kotak dialog yang berisi output dari program kepada pengguna menggunakan metode showMessageDialog(). 
                //Output tersebut adalah tiga kata yang dimasukkan oleh pengguna secara berurutan, dengan setiap kata dipisahkan oleh satu spasi. Argument pertama (null) menunjukkan bahwa kotak dialog akan muncul di tengah-tengah layar.
    }
}