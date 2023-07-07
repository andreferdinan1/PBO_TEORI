PENJELASAN TENTANG LATIHAN Studentrecord

public class BukuAlamat {
Deklarasi kelas BukuAlamat yang merupakan kelas publik.


    private String nama;
    private String alamat;
    private String nohp;
    private String email;
    private static int studentCount;
Deklarasi variabel-variabel instance nama, alamat, nohp, dan email yang memiliki tipe data String. Variabel studentCount dideklarasikan sebagai variabel statik yang akan digunakan untuk menghitung jumlah mahasiswa dalam program.


    public BukuAlamat(){
        studentCount++;
    }
Konstruktor tanpa parameter yang akan dieksekusi ketika objek BukuAlamat dibuat. Setiap kali konstruktor ini dipanggil, studentCount akan bertambah satu.


    public BukuAlamat(String temp){ 
        this.nama = temp; 
        studentCount++;
    } 
Konstruktor dengan satu parameter temp yang digunakan untuk menginisialisasi variabel nama. Setelah variabel nama diinisialisasi, studentCount akan bertambah satu.


    public BukuAlamat(String nama, String alamat, String nohp, String email){ 
        this.nama = nama; 
        this.alamat = alamat;
        this.nohp = nohp; 
        this.email = email;
        studentCount++;
    }
Konstruktor dengan empat parameter nama, alamat, nohp, dan email yang digunakan untuk menginisialisasi semua variabel instance. Setelah variabel-instance diinisialisasi, studentCount akan bertambah satu.


    public String getNama(){
        return nama;
    }

    public void setNama(String nama){
        this.nama = nama;
    }
Metode getNama digunakan untuk mengembalikan nilai variabel nama. Metode setNama digunakan untuk mengubah nilai variabel nama.


    public String getAlamat(){
        return alamat;
    }

    public void setAlamat(String alamat){
        this.alamat = alamat;
    }
Metode getAlamat digunakan untuk mengembalikan nilai variabel alamat. Metode setAlamat digunakan untuk mengubah nilai variabel alamat.


    public String getNohp(){
        return nohp;
    }

    public void setNohp(String nohp){
        this.nohp = nohp;
    }
Metode getNohp digunakan untuk mengembalikan nilai variabel nohp. Metode setNohp digunakan untuk mengubah nilai variabel nohp.


    public String getEmail(){
        return email;
    }

    public void setEmail(String email){
        this.email = email;
    }
Metode getEmail digunakan untuk mengembalikan nilai variabel email. Metode setEmail digunakan untuk mengubah nilai variabel email.

    public static int getStudentCount(){
        return studentCount;
    }
Metode statik getStudentCount digunakan untuk mengembalikan nilai variabel studentCount.

    public void print(String temp){ 
        System.out.println("Nama:" + nama); 
        System.out.println("Alamat:" + al

PENJEALSAN TENTANG LATIHAN 2 MODUL 10

Kode import java.io.BufferedReader; dan import java.io.InputStreamReader; digunakan untuk mengimpor kelas-kelas yang terdapat dalam pustaka Java yang diperlukan untuk membaca input dari pengguna melalui konsol.

1. java.io.BufferedReader adalah kelas yang digunakan untuk membaca teks dari aliran masukan (input stream). Kelas ini membungkus aliran masukan lain, seperti java.io.InputStreamReader, sehingga memungkinkan kita membaca input dari pengguna dengan cara yang lebih efisien.
2. java.io.InputStreamReader adalah kelas yang digunakan untuk membaca karakter dari aliran masukan (input stream) dan mengonversinya menjadi karakter yang dapat dibaca oleh Java. Kelas ini bekerja dengan berbagai jenis aliran masukan, seperti System.in yang merupakan aliran masukan standar (konsol).
   Dengan mengimpor kedua kelas tersebut, kita dapat menggunakan objek BufferedReader yang dibuat dengan new BufferedReader(new InputStreamReader(System.in)) untuk membaca input dari pengguna melalui konsol. Misalnya, dengan menggunakan readLine() dari objek BufferedReader, kita dapat membaca baris teks yang dimasukkan oleh pengguna.