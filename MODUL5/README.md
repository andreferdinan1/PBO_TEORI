MENDAPATKAN INPUT DARI KEYBOARD

1. MENGGUNAKAN BUFFEREDREADER
Dalam bahasa pemrograman Java, kita juga dapat menggunakan kelas BufferedReader untuk mendapatkan input dari keyboard. Berikut ini adalah contoh kode program Java yang dapat digunakan untuk mendapatkan input dari keyboard menggunakan BufferedReader:

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputExample {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Masukkan sebuah kata:");
        String word = reader.readLine();

        System.out.println("Anda memasukkan kata: " + word);
    }
}
Dalam contoh di atas, kita mengimpor kelas BufferedReader menggunakan pernyataan import java.io.BufferedReader;. Kemudian, kita membuat objek BufferedReader dengan menginisialisasi objek InputStreamReader dengan System.in.

Kita kemudian menggunakan metode readLine() pada objek BufferedReader untuk membaca input sebagai sebuah string. Setelah mendapatkan input, kita mencetak nilai tersebut pada console menggunakan System.out.println().

Penting untuk diingat bahwa metode readLine() dapat menghasilkan IOException, sehingga kita harus menangani pengecualian ini menggunakan blok try-catch atau melemparkan pengecualian tersebut pada metode pemanggil.

2.MENGGUNKAN JOPTIONPANE
Dalam bahasa pemrograman Java, kita dapat menggunakan kelas JOptionPane untuk mendapatkan input dari pengguna melalui dialog box. Berikut ini adalah contoh kode program Java yang dapat digunakan untuk mendapatkan input dari pengguna menggunakan JOptionPane:

java
Copy code
import javax.swing.JOptionPane;

public class InputExample {
    public static void main(String[] args) {
        String name = JOptionPane.showInputDialog("Masukkan nama Anda:");

        JOptionPane.showMessageDialog(null, "Halo, " + name + "!");
    }
}
Dalam contoh di atas, kita mengimpor kelas JOptionPane menggunakan pernyataan import javax.swing.JOptionPane;. Kita kemudian menggunakan metode showInputDialog() pada kelas JOptionPane untuk menampilkan dialog box yang meminta pengguna untuk memasukkan nama mereka.

Metode showInputDialog() mengembalikan nilai string yang merupakan input dari pengguna. Kita kemudian menggunakan metode showMessageDialog() pada kelas JOptionPane untuk menampilkan pesan selamat datang pada dialog box.

Selain showInputDialog(), ada beberapa metode lain pada kelas JOptionPane yang dapat digunakan untuk mendapatkan input dari pengguna, antara lain:

* showConfirmDialog(): menampilkan dialog box konfirmasi dengan tombol "OK" dan "Batal".
* showOptionDialog(): menampilkan dialog box dengan pilihan beberapa opsi.
* showInputDialog() dengan argumen tambahan: dapat digunakan untuk menampilkan input dialog box dengan jenis input yang berbeda, seperti bilangan bulat, bilangan desimal, dan sebagainya.
Perlu diingat bahwa penggunaan JOptionPane bergantung pada jenis aplikasi yang kita buat dan kebutuhan desain antarmuka pengguna.

