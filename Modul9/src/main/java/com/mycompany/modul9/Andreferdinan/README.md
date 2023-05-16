MENDEFINISIKAN ISTILAH
Dengan kata-kata Anda sendiri, definisikan istilah-istilah berikut ini : 
1. Class 
2. Object 
3. Instantiate 
4. Instance Variable 
5. Instance Method 
6. Class Variables atau static member variables 
7. Constructor

Jawab:
1. Class adalah sebuah blueprint atau template yang digunakan untuk membuat objek-objek dalam pemrograman berorientasi objek. 


2. Object adalah sebuah instansi konkret dari sebuah class. 


3. Instantiate adalah proses pembuatan objek dari sebuah class. 

4. Instance Variable adalah variabel yang nilainya unik untuk setiap objek individu yang dibuat dari class. 


5. Instance Method adalah metode yang didefinisikan dalam class dan berkaitan dengan objek-objek yang dibuat dari class tersebut. 

6. Class Variables atau static member variables adalah variabel-variabel yang nilainya sama untuk semua objek yang dibuat dari class yang sama.

7. Constructor adalah metode khusus dalam sebuah class yang digunakan untuk menginisialisasi objek-objek yang dibuat dari class tersebut. 

JAVA SCAVANGER HUNT

1. Perhatikan sebuah method yang diuji jika String pasti diakhiri suffix yang pasti. Sebagai contoh, jika diberikan string "Hello", Method harus mengembalikan nilai true suffix yang diberikan adalah "lo", dan false jika suffix yang diberikan adalah "alp".

Class: String
Method Declaration: public boolean endsWith(String suffix)
Sample Usage:

String str = "Hello";
boolean endsWithLo = str.endsWith("lo"); // true
boolean endsWithAlp = str.endsWith("alp"); // false

2. Perhatikan untuk method yang mengenali character yang mewakili sebuah digit yang spesifik dalam radix khusus. Sebagai contoh, jika input digit adalah 15, dan the radix adalah 16, method akan mengembalikan Character F, sejak F adalah representasi hexadecimal untuk angka 15 (berbasis 10).

Class: Character
Method Declaration: public static char forDigit(int digit, int radix)
Sample Usage:

int digit = 15;
int radix = 16;
char character = Character.forDigit(digit, radix); // 'F'

3. Perhatikan untuk method yang mengakhiri running Java Virtual Machine yang sedang berjalan.

Class: System
Method Declaration: public static void exit(int status)
Sample Usage:

System.exit(0);

4. Perhatikan untuk method yang memperoleh lantai dari sebuah nilai double. Sebagai contoh, jika Saya input a 3.13, method harus mengembalikan nilai 3.

Class: Math
Method Declaration: public static double floor(double a)
Sample Usage:

double value = 3.13;
double floorValue = Math.floor(value); // 3.0
5. Perhatikan untuk method yang mengenali jika character yang dipakai adalah sebuah digit. Sebagai contoh, jika Saya input '3', dia akan mengembalikan nilai true.

Class: Character
Method Declaration: public static boolean isDigit(char ch)
Sample Usage:

char digit = '3';
boolean isDigit = Character.isDigit(digit); // true

Pastikan untuk menggunakan sintaksis yang tepat saat menggabungkan contoh-contoh kode ini dengan program Pipoy, sehingga program dapat berhasil dikompilasi dan menghasilkan output yang diharapkan.