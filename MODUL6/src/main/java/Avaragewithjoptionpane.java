/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author andreferdinan
 */
import javax.swing.JOptionPane;

public class Avaragewithjoptionpane {
    public static void main(String[] args) {
        
        // meminta input user untuk tiga nilai ujian menggunakan JOptionPane
        String nilai1Str = JOptionPane.showInputDialog("Masukkan nilai ujian pertama:");
        double ujian1 = Double.parseDouble(nilai1Str);
        
        String nilai2Str = JOptionPane.showInputDialog("Masukkan nilai ujian kedua:");
        double ujian2 = Double.parseDouble(nilai2Str);
        
        String nilai3Str = JOptionPane.showInputDialog("Masukkan nilai ujian ketiga:");
        double ujian3 = Double.parseDouble(nilai3Str);
        
        // menghitung rata-rata dari tiga nilai ujian
        double rataRata = (ujian1 + ujian2 + ujian3) / 3;
        
        // membuat output message
        String message = "Rata-rata nilai ujian: " + rataRata + "\n";
        
        // menambahkan smiley face pada output jika rata-rata lebih besar atau sama dengan 60
        if (rataRata >= 60) {
            message += ":)";
        } else {
            message += ":(";
        }
        
        // menampilkan output message menggunakan JOptionPane
        JOptionPane.showMessageDialog(null, message);
    }
}
