Berikut adalah kode lengkap yang dimodifikasi dan hasil output yang sesuai dengan yang diinginkan:

public class TestExceptions {
    public static void main(String[] args) {
        try {
            for (int i = 0; true; i++) {
                System.out.println("args[" + i + "]=" + args[i]);
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception caught:");
            System.out.println(e);
            System.out.println("Quitting...");
        }
    }
}
Output yang dihasilkan setelah menjalankan program dengan perintah javac TestExceptions one two three adalah sebagai berikut:

args[0]=one
args[1]=two
args[2]=three
Exception caught:
java.lang.ArrayIndexOutOfBoundsException: 3
Quitting...
Pesan "args[0]=one", "args[1]=two", dan "args[2]=three" menunjukkan nilai dari elemen array args sesuai dengan argumen yang diberikan saat menjalankan program.

Kemudian, program mencapai pengecualian ArrayIndexOutOfBoundsException karena mencoba mengakses elemen ke-3 yang tidak ada dalam array args. Penangkapan pengecualian terjadi, dan pesan "Exception caught:" diikuti oleh informasi pengecualian dan pesan "Quitting..." dicetak sebagai output program.



Latihan 2

menangani pengecualian adalah praktik yang baik dalam pengembangan perangkat lunak. Untuk mengatasi pengecualian dalam program TestExceptions, kita dapat menambahkan blok try-catch untuk menangkap dan menangani pengecualian yang mungkin terjadi. Berikut adalah kode yang diperbarui:

public class TestExceptions {
    public static void main(String[] args) {
        try {
            for (int i = 0; true; i++) {
                System.out.println("args[" + i + "]=" + args[i]);
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception caught:");
            System.out.println(e);
            System.out.println("Quitting...");
        } finally {
            System.out.println("Program execution completed.");
        }
    }
}
Dalam kode di atas, saya menambahkan blok try-catch untuk menangani pengecualian ArrayIndexOutOfBoundsException. Jika pengecualian terjadi saat mencoba mengakses elemen yang tidak ada dalam array args, blok catch akan dieksekusi dan pesan pengecualian akan dicetak.

Selain itu, kita juga menambahkan blok finally yang akan dieksekusi terlepas dari apakah pengecualian terjadi atau tidak. Dalam blok finally, kita mencetak pesan "Program execution completed." untuk menandakan bahwa eksekusi program telah selesai.

Dengan menggunakan blok try-catch-finally, kita dapat menangani pengecualian yang terjadi saat mencoba mengakses elemen array args yang melebihi indeks yang tersedia. Pesan pengecualian akan dicetak, dan pesan "Program execution completed." akan ditampilkan setelah penanganan pengecualian.
