modul 3 membuat hello world
/**
 *
 * @author andreferdinan
 */
public class Membuathelloworld { //<- Ini adalah blok class dengan nama Membuathelloworld 
    // Blok class dibuka dengan tanda kurung kurawal { kemudian ditutup atau diakhiri dengan }.
    // Di dalam blok class, kita dapat mengisinya dengan method atau fungsi-fungsi dan juga variabel.
    // Pada contoh di bawah, terdapat method main().
    public static void main(String[] args) { // Method main() atau fungsi main() merupakan blok program yang akan dieksekusi pertama kali.
     // Ini adalah entri point dari program.
     // Method main() wajib kita buat. Kalau tidak, maka programnya tidak akan bisa dieksekusi.
    // Method main() memiliki parameter args[]. Parameter ini nanti akan menyimpan sebuah nilai dari argumen di command line.
        System.out.println("WELCOME TO JAVA PROGRAMING [ANDRE FERDINAN] "); // Ini adalah fungsi untuk menampilkan teks ke layar monitor.  
    }
}


modul 3 membuat the tree
/**
 *
 * @author andreferdinan
 */
public class TheTree { // bagian class dengan nama TheTree
    public static void main(String[] args) { // method main
                                             // Method main() memiliki parameter args[]. 
                                             // Parameter ini nanti akan menyimpan sebuah nilai dari argumen di command line.
        System.out.println("I think I shall never see,");  // Ini adalah fungsi untuk menampilkan teks ke layar monitor.
        System.out.println("a poem as lovely as a tree."); // Ini adalah fungsi untuk menampilkan teks ke layar monitor.
        System.out.println("A tree whose hungry mouth is pressed"); // Ini adalah fungsi untuk menampilkan teks ke layar monitor.
        System.out.println("Against the Earth's sweet flowing breast.");  // Ini adalah fungsi untuk menampilkan teks ke layar monitor.  
    }
}

MODUL 4
Latihan 1
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package andreferdinan090323;

/**
 *
 * @author Andre Ferdinan
 * 
 */
//modul 4
public class Latihan1 {
    public static void main(String[] args){
        int number =10;//int adalah tipe data, number adalah variable 10=initial value
        char letter ='a';//char adalah tipe data, letter= variable dan a adalah initial value
        boolean result = true;//boolean adalah tipe data ,result adalah variable, dan true adalah initial value
        String str =  "";//string adalah tipe data, str adalah variable
        
        str="hello";//hello adalah initial value
        
        
        System.out.println("number = "+number);//print number=10
        System.out.println("letter = "+letter);//print letter=a
        System.out.println("result = "+result);//print result=true
        System.out.println("str= "+str);//print str=hello
        
    } 
}

Latihan 2
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package andreferdinan090323;

/**
 *
 * @author Andre Ferdinan
 */
public class Latihan2 {
    public static void main(String[] args){
        int number1=10;//data 1
        int number2=20;//data 2
        int number3=45;//data 3
        int avarage;//rata-rata
        
        avarage=(number1 + number2+number3)/3;//eumus avarage=jumlah angka dibagi banyak data/angka
        
        System.out.println("number 1 ="+number1);//print number1=10
        System.out.println("number 2= "+number2);//print number2=20
        System.out.println("number 3= "+number3);//print number3=45
        System.out.println("avarage is ="+avarage);//print avarage=25
        
    } 
}

latihan 3
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package andreferdinan090323;

/**
 *
 * @author Andre Ferdinan
 */
public class Latihan3 {
     public static void main(String[] args){
         int number1=10;//angka 1
         int number2=23;//angka 2
         int number3=5;//angka 3
         int score=0;//mencari angka tertinggi dengan score
         
         score=(number2 > number3)?(number2>number1)? number2:number1:number3;//rumus angka tertinggi
         
         System.out.println("number 1 ="+number1);//print aangka 1
         System.out.println("number 2 ="+number2);//print angka 2
         System.out.println("number 3 ="+number3);//print angka 3
         System.out.println("nilai tertingginya adalah angka = "+score);//print nilai terttinggi
        
         
         
     }
    
}

latihan 4
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package andreferdinan090323;

/**
 *
 * @author andreferdinan
 */
public class latihan4 {
    public static void main(String[] args){

System.out.println("((a / (b ^ (c ^ d))) - e) + ((f - (g * h)) + i)");
System.out.println("(((3 * 10) * 2) / 15) - 2 + (4 ^ (2 ^ 2))");
System.out.println("(((r ^ s) * t) / u) - v + (w ^ x) - (y++)");
    }
    
}

modul 5
latihan 1
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author andreferdinan
 */
import java.io.BufferedReader;//Ini adalah sintaks untuk mengimport kelas BufferedReader 
                              //dari paket java.io. Kelas ini digunakan untuk membaca input 
                              //dari pengguna melalui command line.
import java.io.IOException;//Ini adalah sintaks untuk mengimport kelas IOException dari paket 
                           //java.io. Kelas ini digunakan untuk menangani kesalahan input-output pada program.
import java.io.InputStreamReader;//ni adalah sintaks untuk mengimport kelas InputStreamReader dari paket java.io. 
                                //Kelas ini digunakan untuk membaca karakter dari input stream.

public class latihan1 {
    public static void main(String[] args) { //Ini adalah sintaks untuk mendefinisikan metode main. Metode main adalah titik masuk dari program Java.
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));//Ini adalah sintaks untuk membuat objek BufferedReader yang 
        //digunakan untuk membaca input dari pengguna. Objek tersebut dibuat dengan menggunakan objek InputStreamReader sebagai argumen untuk konstruktor BufferedReader, 
        //dan objek System.in sebagai argumen untuk konstruktor InputStreamReader.

        try {//try { ... } catch (IOException e) { ... }: Ini adalah sintaks untuk menangani kesalahan input-output yang dapat terjadi pada program. Dalam blok try, 
            //program meminta pengguna untuk memasukkan tiga kata secara berurutan, dan menangkap input pengguna menggunakan BufferedReader. Jika terjadi kesalahan saat membaca input, 
            //program akan menjalankan blok catch dan menampilkan pesan kesalahan.
            System.out.print("Enter word1: ");//ni adalah sintaks untuk menampilkan pesan permintaan input kepada pengguna di command line.
            String word1 = reader.readLine();//Ini adalah sintaks untuk membaca input pengguna menggunakan objek BufferedReader. Input yang dimasukkan oleh pengguna akan disimpan dalam variabel word1.

            System.out.print("Enter word2: ");
            String word2 = reader.readLine();

            System.out.print("Enter word3: ");
            String word3 = reader.readLine();

            System.out.println(word1 + " " + word2 + " " + word3);// Ini adalah sintaks untuk menampilkan output ke layar. Output tersebut adalah tiga kata yang dimasukkan oleh pengguna secara berurutan, 
            //dengan setiap kata dipisahkan oleh satu spasi.
        } catch (IOException e) {
            System.out.println("Error reading input from user");
            e.printStackTrace();
        }
    }
}

latihan 2

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

modul 6
latihan 1
