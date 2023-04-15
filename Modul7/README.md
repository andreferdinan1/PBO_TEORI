ARRAY
    Array adalah sebuah struktur data pada bahasa pemrograman Java yang digunakan untuk menyimpan kumpulan nilai atau objek dengan tipe data yang sama. Array terdiri dari beberapa elemen yang diakses menggunakan sebuah indeks yang dimulai dari 0.
Pendeklarasian array
    Array harus dideklarasikan seperti layaknya sebuah variabel. Apabila Anda mendeklarasikan array, Anda harus membuat sebuah list dari tipe data, yang diikuti oleh tanda kurung buka dan kurung tutup, yang diikuti oleh nama identifier. Sebagai contoh, 
    int ages[];  

    Setelah pendeklarasian, kita harus membuat array dan menentukan berapa panjangnya dengan sebuah konstruktor. Proses ini di Java disebut sebagai instantiation ( Kata dalam Java yang berarti membuat ). Untuk meng-instantiate sebuah obyek, kita membutuhkan sebuah konstruktor. Kita akan membicarakan lagi mengenai instantiateobyek dan pembuatan konstruktor pada bagian selanjutnya. Perlu dicatat, bahwa ukuran dari array tidak dapat diubah setelah Anda menginisialisasinya. Sebagai contoh, 
 
    //deklarasi 
    int ages[]; 
  
    //instantiate obyek 
    ages = new int[100]; 
    atau bisa juga ditulis dengan, 
    //deklarasi dan instantiate 
    obyek 
    int ages[] = new 
    int[100];    

Pengaksesan Array
    Untuk mengakses sebuah elemen dalam array, atau mengakses sebagian dari array, Anda harus menggunakan sebuah nomor atau yang disebut sebagai index atau subscript. 
    Sebuah nomor index atau subscript telah diberikan kepada tiap anggota array, sehingga program dan programmer dapat mengakses setiap value apabila dibutuhkan. 
    Index selalu dalam integer. Dimulai dari nol, kemudian akan terus bertambah sampai list value dari array tersebut berakhir. Perlu dicatat, bahwa elemen-elemen didalam array dimulai dari 0 sampai dengan (ukuranArray-1). 
    Sebagai contoh, pada array yang kita deklarasikan tadi, kita mempunyai, 
 
    //memberikan nilai 10 kepada elemen pertama array 
    ages[0] = 10; 
    //mencetak elemen array yang terakhir 
    System.out.print(ages[99]); 

Panjang Array
    Untuk mengetahui berapa banyak element didalam sebuah array, Anda dapat menggunakan length (panjang) field dalam array. Panjang field dalam array akan mengembalikan ukuran dari array itu sendiri. Sebagai contoh, 
        arrayName.length

Array Multidimensi
    Array multidimensi adalah struktur data pada bahasa pemrograman Java yang dapat menampung nilai atau objek dalam bentuk tabel atau matriks dengan dua atau lebih dimensi. Setiap elemen pada array multidimensi diidentifikasi oleh sebuah set indeks yang terdiri dari bilangan bulat non-negatif yang merepresentasikan posisi elemen pada setiap dimensi.

    Contoh sederhana array multidimensi adalah sebagai berikut:

    int[][] matriks = {
    {1, 2, 3},
    {4, 5, 6},
    {7, 8, 9}
        };
    Dalam contoh di atas, matriks adalah sebuah array multidimensi yang terdiri dari 3 baris dan 3 kolom. Untuk mengakses nilai dari elemen di posisi tertentu pada array multidimensi, kita dapat menggunakan dua atau lebih indeks. Misalnya, untuk mengakses elemen pada baris kedua dan kolom ketiga dari matriks, kita dapat menggunakan sintaks matriks[1][2], yang akan menghasilkan nilai 6.   

Penjelasan sintaks Latihan2
    import java.io.BufferedReader;: Baris ini mendefinisikan sebuah package yang digunakan untuk mengimpor kelas BufferedReader ke dalam program. BufferedReader digunakan untuk membaca input yang diberikan oleh pengguna melalui konsol.

    import java.io.IOException;: Baris ini mengimpor package java.io.IOException, yang digunakan untuk menangani exception yang dapat terjadi pada saat membaca input dari pengguna.

    import java.io.InputStreamReader;: Baris ini mengimpor package java.io.InputStreamReader, yang digunakan untuk menghubungkan System.in (input dari konsol) dengan BufferedReader.

    import javax.swing.JOptionPane;: Baris ini mengimpor package javax.swing.JOptionPane, yang digunakan untuk menampilkan dialog box pada aplikasi Java.

    int[] numbers = new int[10];: Baris ini mendefinisikan sebuah array dengan nama numbers yang berukuran 10. Array ini akan digunakan untuk menyimpan 10 nomor yang dimasukkan oleh pengguna.

    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));: Baris ini mendefinisikan sebuah objek BufferedReader yang digunakan untuk membaca input dari pengguna melalui konsol.

    for (int i = 0; i < 10; i++) {: Baris ini memulai sebuah loop for yang digunakan untuk menanyakan nomor kepada pengguna sebanyak 10 kali.

    String input = JOptionPane.showInputDialog("Masukkan nomor ke-" + (i+1) + ":");: Baris ini menampilkan sebuah dialog box menggunakan JOptionPane yang meminta pengguna untuk memasukkan nomor ke-i+1.

    numbers[i] = Integer.parseInt(input);: Baris ini menyimpan nomor yang dimasukkan oleh pengguna ke dalam array numbers.

    int max = numbers[0];: Baris ini mendefinisikan sebuah variabel max dan menginisialisasinya dengan nilai pada indeks pertama array numbers.

    for (int i = 1; i < numbers.length; i++) {: Baris ini memulai sebuah loop for yang digunakan untuk mencari nilai terbesar di dalam array numbers. Loop dimulai dari indeks ke-1, karena nilai pada indeks ke-0 sudah diambil sebelumnya.

    if (numbers[i] > max) {: Baris ini melakukan perbandingan nilai pada indeks i dengan nilai max, dan jika nilai pada indeks tersebut lebih besar dari max, maka nilai max diperbarui dengan nilai pada indeks tersebut.

    JOptionPane.showMessageDialog(null, "Input terbesar yang diberikan adalah: " + max);: Baris ini menampilkan dialog box menggunakan JOptionPane yang berisi nilai terbesar yang diberikan oleh pengguna.

Penjelasan sintaks Latihan3
    Baris pertama mendefinisikan sebuah array dua dimensi dengan nama entry. Array ini memiliki tiga baris dan tiga kolom, dan menyimpan informasi tentang nama, nomor telepon, dan alamat dari tiga orang yang terdaftar dalam buku alamat.

    Loop for digunakan untuk mengakses setiap baris dari array entry. Loop dijalankan sebanyak tiga kali, karena array entry memiliki tiga baris.

    Pada setiap iterasi loop, tiga nilai yang terkait dengan orang yang terdaftar pada baris tersebut dicetak ke layar menggunakan System.out.println(). Nilai ini diakses menggunakan indeks baris dan kolom yang sesuai pada array entry.