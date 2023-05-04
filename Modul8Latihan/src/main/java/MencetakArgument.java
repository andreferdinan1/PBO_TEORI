/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Dell
 */
public class MencetakArgument { //mendefinisikan kelas dengan nama MencetakArgument.
    public static void main(String[] args) { //mendefinisikan method utama yang akan dieksekusi oleh Java ketika program dijalankan. 
                                             //Parameter args adalah array string yang berisi argumen yang diberikan oleh user melalui command line.
                                             
      for (int i = 0; i < args.length; i++) {//menginisialisasi sebuah loop yang akan diulang sebanyak argumen yang diberikan oleh user, 
                                             //dimulai dari indeks ke-0 hingga indeks terakhir.
                                             
         System.out.println(args[i]);//mencetak setiap argumen ke layar dengan menambahkan baris baru setiap kali mencetak.
      }
   }
}
