Struktur kontrol (control structures) adalah bagian penting dalam bahasa pemrograman Java, yang memungkinkan pengembang untuk mengontrol alur eksekusi program dengan membuat keputusan, melakukan pengulangan, dan menjalankan blok kode tertentu pada kondisi tertentu. Berikut ini adalah beberapa struktur kontrol di Java:

1. Struktur kontrol if-else
Struktur kontrol if-else digunakan untuk memeriksa sebuah kondisi dan mengeksekusi blok kode tertentu jika kondisi tersebut benar. Jika kondisi salah, maka blok kode yang berbeda dapat dieksekusi. Contoh penggunaan struktur kontrol if-else:

java
int num = 10;
if (num > 0) {
    System.out.println("Number is positive.");
} else {
    System.out.println("Number is negative.");
}

2. Struktur kontrol switch-case
Struktur kontrol switch-case digunakan untuk memeriksa nilai ekspresi dan mengeksekusi blok kode tertentu berdasarkan nilai tersebut. Contoh penggunaan struktur kontrol switch-case:

java
int day = 3;
switch (day) {
    case 1:
        System.out.println("Monday");
        break;
    case 2:
        System.out.println("Tuesday");
        break;
    case 3:
        System.out.println("Wednesday");
        break;
    default:
        System.out.println("Invalid day");
        break;
}

3. Struktur kontrol for
Struktur kontrol for digunakan untuk melakukan pengulangan sejumlah kali yang sudah diketahui. Contoh penggunaan struktur kontrol for:

java
for (int i = 1; i <= 10; i++) {
    System.out.println("Count: " + i);
}

4. Struktur kontrol while
Struktur kontrol while digunakan untuk melakukan pengulangan selama kondisi tertentu benar. Contoh penggunaan struktur kontrol while:

java

int i = 1;
while (i <= 10) {
    System.out.println("Count: " + i);
    i++;
}

5. Struktur kontrol do-while
Struktur kontrol do-while mirip dengan while, namun blok kode dieksekusi setidaknya satu kali, meskipun kondisi tidak benar pada awalnya. Contoh penggunaan struktur kontrol do-while:

java
int i = 1;
do {
    System.out.println("Count: " + i);
    i++;
} while (i <= 10);
Dalam penjelasan di atas, setiap struktur kontrol memiliki cara kerja yang berbeda untuk mengontrol alur eksekusi program. Dalam mengembangkan program Java, pengembang dapat memilih struktur kontrol yang paling sesuai untuk kebutuhan spesifik mereka.
