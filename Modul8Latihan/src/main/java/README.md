ARGUMENT
Argument dalam command line Java dapat digunakan untuk memberikan input pada program yang dijalankan melalui baris perintah (command line).

Dalam Java, argument dapat diberikan pada program melalui parameter yang diambil oleh method main pada class yang dijalankan.

Secara umum, sintaks untuk menjalankan program Java dengan argument adalah sebagai berikut:

kotlin
Copy code
java nama_class arg1 arg2 arg3 ...
nama_class adalah nama dari class yang akan dijalankan. arg1, arg2, arg3, dan seterusnya adalah argument yang akan diberikan pada program.

Dalam program Java, argument dapat diakses melalui parameter yang didefinisikan pada method main. Parameter tersebut bertipe String[] dan berisi daftar argument yang diberikan pada program.

Contoh penggunaan argument dalam program Java:

typescript
Copy code
public class Main {
  public static void main(String[] args) {
    System.out.println("Hello " + args[0] + "!");
  }
}
Program di atas akan mencetak pesan "Hello" diikuti dengan argument pertama yang diberikan pada program. Jika program tersebut dijalankan dengan perintah java Main John, maka output yang dihasilkan adalah "Hello John!".

CARA MENCETAK ARGUMEN Di COMMAND LINE

Untuk mencetak argumen pada program Java di NetBeans, Anda dapat menggunakan class JOptionPane atau class System.out. Berikut adalah contoh penggunaan kedua class tersebut:

1. Menggunakan class JOptionPane
typescript
Copy code
public class Main {
  public static void main(String[] args) {
    String message = "Arguments: ";
    for (String arg : args) {
      message += arg + " ";
    }
    JOptionPane.showMessageDialog(null, message);
  }
}
Program di atas akan menampilkan dialog dengan pesan yang berisi daftar argument yang diberikan pada program.

2. Menggunakan class System.out
typescript
Copy code
public class Main {
  public static void main(String[] args) {
    System.out.print("Arguments: ");
    for (String arg : args) {
      System.out.print(arg + " ");
    }
  }
}
Program di atas akan mencetak daftar argument pada console output.

Untuk menjalankan program di NetBeans dengan argument, klik kanan pada file Java yang akan dijalankan, pilih "Properties", kemudian masukkan argument pada kolom "Run". Kemudian, jalankan program dengan menekan tombol "Run" di toolbar NetBeans atau dengan menekan tombol F6 pada keyboard.

Untuk mencetak argument di NetBeans menggunakan command line, Anda dapat mengikuti langkah-langkah berikut:

1.Buka NetBeans dan buka project Java yang ingin dijalankan dengan argument.

2.Klik kanan pada project tersebut dan pilih "Properties".

3.Pada jendela "Properties", pilih "Run" di bagian kiri.

4.Masukkan argument yang ingin digunakan pada kolom "Arguments". Argument dapat dipisahkan dengan spasi atau baris baru.

5.Klik tombol "OK" untuk menyimpan perubahan.

6.Buka command prompt (atau terminal pada sistem operasi macOS atau Linux) dan masuk ke direktori tempat file .java dan .class berada.

7.Jalankan program dengan menggunakan perintah java diikuti dengan nama class dan argumen yang diberikan pada program. Contohnya:

css
Copy code
java Main arg1 arg2 arg3
8. Program akan dijalankan dan argumen akan ditampilkan pada console output di NetBeans.
Dengan cara ini, Anda dapat menjalankan program Java dengan argument menggunakan command line dan melihat output pada console output di NetBeans.

