/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author andreferdinan
 */
import javax.swing.JOptionPane;

public class pangkatforloop {
    public static void main(String[] args) {
        int angka = Integer.parseInt(JOptionPane.showInputDialog("Masukkan angka:"));
        int pangkat = Integer.parseInt(JOptionPane.showInputDialog("Masukkan pangkat:"));

        int hasil = 1;

        for (int i = 0; i < pangkat; i++) {// i<pangkat i tambah 1
            hasil *= angka;
        }

        JOptionPane.showMessageDialog(null, angka + " pangkat " + pangkat + " = " + hasil);
    }
}
